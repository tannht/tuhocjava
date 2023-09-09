import java.util.Scanner;

public class bai11_baitap_coban {
    public static void main(String[] args) {
        //Viết chương trình giải phương trình bậc 2
        // Khai báo biến
        double a, b, c, x1, x2, delta;

        // Khai báo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào các hệ số a, b, c
        System.out.println("Mời bạn nhập vào hệ số a: ");
        a = sc.nextDouble();
        System.out.println("Mời bạn nhập vào hệ số b: ");
        b = sc.nextDouble();
        System.out.println("Mời bạn nhập vào hệ số c: ");
        c = sc.nextDouble();

        // Kiểm tra điều kiện và tính toán
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
            }
            return;
        }

        // tính delta
        delta = b * b - 4 * a * c;

        // tính nghiệm
        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
