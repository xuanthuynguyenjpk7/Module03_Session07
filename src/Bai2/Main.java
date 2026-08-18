package Bai2;
public class Main {

    public static void main(String[] args) {

        // Khởi tạo đối tượng Book
        Book book = new Book("Java Programming", "Nguyen Van A", 250000);

        // Hiển thị thông tin ban đầu
        System.out.println("=== THÔNG TIN SÁCH ===");
        System.out.println("Tên sách: " + book.getTitle());
        System.out.println("Tác giả: " + book.getAuthor());
        System.out.println("Giá: " + book.getPrice());

        // Thay đổi thông tin sách bằng setter
        book.setTitle("Lập trình Java cơ bản");
        book.setAuthor("Nguyen Van B");
        book.setPrice(300000);

        System.out.println("\n=== SAU KHI THAY ĐỔI ===");
        System.out.println("Tên sách: " + book.getTitle());
        System.out.println("Tác giả: " + book.getAuthor());
        System.out.println("Giá: " + book.getPrice());

        // Thử nhập giá âm
        System.out.println("\n=== KIỂM TRA GIÁ ÂM ===");
        book.setPrice(-50000);

        // Kiểm tra giá sau khi nhập giá âm
        System.out.println("Giá hiện tại: " + book.getPrice());
    }
}
