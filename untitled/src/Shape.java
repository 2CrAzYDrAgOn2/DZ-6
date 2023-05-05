public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract void draw();

    public boolean equals(Shape other) {
        return this.color.equals(other.color);
    }
}
