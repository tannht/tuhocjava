import java.util.Scanner;

public class bai12_toantu3ngoi {
    //Ví dụ về toán tử 3 ngôi
    // cho phép người dùng nhập vào 2 số a, b. Tìm số lớn nhất trong 2 số đó

    public static void main(String[] args) {
        // Khai báo biến
        int a, b, max;

        // Khai báo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào 2 số a, b
        System.out.println("Mời bạn nhập vào số a: ");
        a = sc.nextInt();
        System.out.println("Mời bạn nhập vào số b: ");
        b = sc.nextInt();

        // Tìm số lớn nhất
        max = (a > b) ? a : b;
        System.out.println("Số lớn nhất trong 2 số a và b là: " + max);
    }
}
