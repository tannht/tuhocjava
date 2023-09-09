import java.util.Scanner;

public class bai11_baitap_if_else_nang_cao {
    public static void main(String[] args) {
        // Bài tập: Viết chương trình nhập vào 3 số nguyên a, b, c. Kiểm tra xem a, b, c có phải là 3 cạnh của một tam giác hay không?

        // Khai báo biến
        int a, b, c;
        double p, s;

        // Khai báo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào 3 cạnh của tam giác
        System.out.println("Mời bạn nhập vào cạnh a: ");
        a = sc.nextInt();
        System.out.println("Mời bạn nhập vào cạnh b: ");
        b = sc.nextInt();
        System.out.println("Mời bạn nhập vào cạnh c: ");
        c = sc.nextInt();

        // Kiểm tra điều kiện
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("a, b, c là 3 cạnh của một tam giác");
            p = (double) (a + b + c) / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Chu vi tam giác là: " + (a + b + c));
            System.out.println("Diện tích tam giác là: " + s);
        } else {
            System.out.println("a, b, c không phải là 3 cạnh của một tam giác");
        }

    }
}
