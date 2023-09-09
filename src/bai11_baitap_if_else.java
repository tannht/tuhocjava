import java.util.Scanner;

public class bai11_baitap_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào điểm trung bình: ");
        double dtb = sc.nextDouble();

        if (dtb >= 5.0) {
            System.out.println("Bạn đỗ");
            System.out.println("Chúc mừng bạn");
        } else System.out.println("Bạn trượt");
    }
}
