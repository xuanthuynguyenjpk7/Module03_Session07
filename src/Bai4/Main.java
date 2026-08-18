package Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Tạo danh sách sinh viên
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Nguyen Van An", 20, "CNTT1", 8.5));
        students.add(new Student("Tran Thi Binh", 21, "CNTT2", 7.2));
        students.add(new Student("Le Van Cuong", 19, "CNTT1", 6.8));
        students.add(new Student("Pham Thi Dung", 20, "CNTT3", 9.1));
        students.add(new Student("Hoang Van Em", 22, "CNTT2", 5.9));

        // Nhập điểm min và max
        System.out.print("Nhập điểm min: ");
        double min = scanner.nextDouble();

        System.out.print("Nhập điểm max: ");
        double max = scanner.nextDouble();

        // Kiểm tra min <= max
        if (min > max) {
            System.out.println("Điểm min phải nhỏ hơn hoặc bằng điểm max.");
            scanner.close();
            return;
        }

        // Hiển thị sinh viên trong khoảng điểm
        System.out.println("\nDanh sách sinh viên có điểm trung bình từ "
                + min + " đến " + max + ":");

        boolean found = false;

        for (Student student : students) {
            if (student.getAvgScore() >= min &&
                    student.getAvgScore() <= max) {

                student.displayInfo();
                found = true;
            }
        }

        // Không tìm thấy sinh viên
        if (!found) {
            System.out.println("Không có sinh viên nào trong khoảng điểm này.");
        }

        scanner.close();
    }
}
