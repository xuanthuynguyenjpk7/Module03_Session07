package Bai4;

public class Student {
    private String name;
    private int age;
    private String className;
    private double avgScore;

    // Constructor
    public Student(String name, int age, String className, double avgScore) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public double getAvgScore() {
        return avgScore;
    }

    // Hiển thị thông tin sinh viên
    public void displayInfo() {
        System.out.printf(
                "Tên: %s | Tuổi: %d | Lớp: %s | Điểm TB: %.2f%n",
                name, age, className, avgScore
        );
    }
}
