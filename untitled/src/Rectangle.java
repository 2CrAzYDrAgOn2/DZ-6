public class Rectangle extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(String color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
    }

    @Override
    public boolean equals(Shape other) {
        if (other instanceof Rectangle) {
            Rectangle otherRectangle = (Rectangle) other;
            return super.equals(other) && this.x1 == otherRectangle.x1 && this.y1 == otherRectangle.y1 && this.x2 == otherRectangle.x2 && this.y2 == otherRectangle.y2;
        }
        return false;
    }
}
