package Bai3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Tạo 2 đối tượng Person
        Person person1 = new Person();
        Person person2 = new Person();

        // Nhập thông tin Person 1
        System.out.println("=== Nhập thông tin Person 1 ===");

        System.out.print("Nhập tên: ");
        person1.setName(scanner.nextLine());

        System.out.print("Nhập tuổi: ");
        person1.setAge(scanner.nextInt());

        scanner.nextLine(); // Xóa ký tự Enter

        // Nhập thông tin Person 2
        System.out.println("\n=== Nhập thông tin Person 2 ===");

        System.out.print("Nhập tên: ");
        person2.setName(scanner.nextLine());

        System.out.print("Nhập tuổi: ");
        person2.setAge(scanner.nextInt());

        // So sánh tuổi
        System.out.println("\n=== Kết quả ===");

        if (person1.getAge() > person2.getAge()) {
            System.out.println(person1.getName() + " lớn tuổi hơn " + person2.getName());
        } else if (person1.getAge() < person2.getAge()) {
            System.out.println(person2.getName() + " lớn tuổi hơn " + person1.getName());
        } else {
            System.out.println(person1.getName() + " và " + person2.getName() + " bằng tuổi nhau");
        }

        scanner.close();
    }
}
