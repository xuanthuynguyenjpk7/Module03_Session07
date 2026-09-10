package Bai5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Product> products = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== QUẢN LÝ SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    displayProducts();
                    break;

                case 3:
                    updateProduct();
                    break;

                case 4:
                    deleteProduct();
                    break;

                case 5:
                    System.out.println("Đã thoát chương trình!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // 1. Thêm sản phẩm
    public static void addProduct() {

        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();

        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());

        Product product = new Product(id, name, price);

        products.add(product);

        System.out.println("Thêm sản phẩm thành công!");
    }

    // 2. Hiển thị danh sách
    public static void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm đang trống!");
            return;
        }

        System.out.println("\n===== DANH SÁCH SẢN PHẨM =====");

        for (Product product : products) {
            product.display();
        }
    }

    // 3. Cập nhật sản phẩm
    public static void updateProduct() {

        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        String id = sc.nextLine();

        for (Product product : products) {

            if (product.getId().equals(id)) {

                System.out.print("Nhập tên mới: ");
                String newName = sc.nextLine();

                System.out.print("Nhập giá mới: ");
                double newPrice = Double.parseDouble(sc.nextLine());

                product.setName(newName);
                product.setPrice(newPrice);

                System.out.println("Cập nhật thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy sản phẩm có ID: " + id);
    }

    // 4. Xóa sản phẩm
    public static void deleteProduct() {

        System.out.print("Nhập ID sản phẩm cần xóa: ");
        String id = sc.nextLine();

        for (Product product : products) {

            if (product.getId().equals(id)) {

                products.remove(product);

                System.out.println("Xóa sản phẩm thành công!");
                return;
            }
        }

        System.out.println("Không tìm thấy sản phẩm có ID: " + id);
    }
}
