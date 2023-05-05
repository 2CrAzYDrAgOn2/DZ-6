public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public boolean equals(Shape other) {
        if (other instanceof Circle) {
            Circle otherCircle = (Circle) other;
            return super.equals(other) && this.x == otherCircle.x && this.y == otherCircle.y && this.radius == otherCircle.radius;
        }
        return false;
    }
}
