public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("red", 0, 0, 5);
        shapes[1] = new Rectangle("blue", 0, 0, 10, 5);

        for (Shape shape : shapes) {
            shape.draw();
        }

        Circle c1 = new Circle("red", 0, 0, 5);
        Circle c2 = new Circle("red", 1, 1, 5);
        Rectangle r = new Rectangle("blue", 0, 0, 10, 5);

        System.out.println(c1.equals(c2)); // true
        System.out.println(c1.equals(r)); // false
    }
}