import java.util.Scanner;

public class bai11_if_else_nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào điểm trung bình: ");
        double dtb = scanner.nextDouble();

        if (dtb >= 8.0) {
            System.out.println("Bạn đạt loại giỏi");
            System.out.println("Chúc mừng bạn");
        } else if (dtb >=6) {
            System.out.println("Bạn đạt loại khá");
        } else if (dtb >=5) {
            System.out.println("Bạn đạt trung bình");
        } else System.out.println("Bạn rớt");
    }
}
