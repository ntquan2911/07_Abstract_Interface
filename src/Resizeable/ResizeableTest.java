package Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(6, 8);
        System.out.println("Before resize: ");

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }

        System.out.println("Afer resize: ");
        for (int i = 0; i < shapes.length; i++) {
            double percent = Math.round(Math.random() * 100 + 1);

            if (shapes[i] instanceof Resizeable) {
                System.out.print("Percent is: ");
                System.out.println(percent);
                ((Resizeable) shapes[i]).resize(percent);
                System.out.println(shapes[i]);
            }
        }
    }
}
