package Bai1;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        System.out.println("=== Hình chữ nhật 1 ===");
        rectangle1.display();

        System.out.println();

        Rectangle rectangle2 = new Rectangle(10, 5);

        System.out.println("=== Hình chữ nhật 2 ===");
        rectangle2.display();
    }
}
