package Bai6;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryManagement {

    static ArrayList<Category> categories = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n========== QUẢN LÝ DANH MỤC ==========");
            System.out.println("1. Thêm mới danh mục");
            System.out.println("2. Hiển thị danh sách danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Tìm kiếm danh mục theo tên");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addCategory();
                    break;

                case 2:
                    displayCategories();
                    break;

                case 3:
                    updateCategory();
                    break;

                case 4:
                    deleteCategory();
                    break;

                case 5:
                    searchCategory();
                    break;

                case 6:
                    System.out.println("Đã thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }

    // 1. Thêm danh mục
    public static void addCategory() {

        System.out.println("\n--- THÊM DANH MỤC ---");

        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        // Kiểm tra ID đã tồn tại chưa
        for (Category category : categories) {
            if (category.getId().equalsIgnoreCase(id)) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập tên danh mục: ");
        String name = sc.nextLine();

        System.out.print("Nhập mô tả: ");
        String description = sc.nextLine();

        Category category = new Category(id, name, description);

        categories.add(category);

        System.out.println("Thêm danh mục thành công!");
    }

    // 2. Hiển thị danh sách
    public static void displayCategories() {

        System.out.println("\n--- DANH SÁCH DANH MỤC ---");

        if (categories.isEmpty()) {
            System.out.println("Danh sách danh mục đang trống!");
            return;
        }

        for (Category category : categories) {
            System.out.println(category);
        }
    }

    // 3. Cập nhật danh mục
    public static void updateCategory() {

        System.out.println("\n--- CẬP NHẬT DANH MỤC ---");

        System.out.print("Nhập ID danh mục cần cập nhật: ");
        String id = sc.nextLine();

        for (Category category : categories) {

            if (category.getId().equalsIgnoreCase(id)) {

                System.out.print("Nhập tên mới: ");
                String name = sc.nextLine();

                System.out.print("Nhập mô tả mới: ");
                String description = sc.nextLine();

                category.setName(name);
                category.setDescription(description);

                System.out.println("Cập nhật thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy danh mục có ID: " + id);
    }

    // 4. Xóa danh mục
    public static void deleteCategory() {

        System.out.println("\n--- XÓA DANH MỤC ---");

        System.out.print("Nhập ID danh mục cần xóa: ");
        String id = sc.nextLine();

        for (Category category : categories) {

            if (category.getId().equalsIgnoreCase(id)) {

                categories.remove(category);

                System.out.println("Xóa danh mục thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy danh mục có ID: " + id);
    }

    // 5. Tìm kiếm theo tên
    public static void searchCategory() {

        System.out.println("\n--- TÌM KIẾM DANH MỤC ---");

        System.out.print("Nhập tên danh mục cần tìm: ");
        String keyword = sc.nextLine().trim().toLowerCase();

        boolean found = false;

        for (Category category : categories) {

            if (category.getName().toLowerCase().contains(keyword)) {

                System.out.println(category);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy danh mục phù hợp!");
        }
    }
}
