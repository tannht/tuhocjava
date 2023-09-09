import java.util.Arrays;
import java.util.Scanner;

public class bai12_sorting {
    public static void main(String[] args) {
        // cho phép người dùng nhập vào 1 dãy số, độ dài của dãi số do người dùng chọn, sau đó sắp sếp theo thứ tự tăng dần
        // Khai báo biến
        int n;
        int[] arr;

        // Khai báo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào độ dài của dãy số cao nhất là 10 nếu lớn hơn 10 thì thông báo cho người dùng biết và yêu cầu nhập lại
        do {
            System.out.println("Mời bạn nhập vào độ dài của dãy số: ");
            n = sc.nextInt();
            if (n > 10) {
                System.out.println("Độ dài của dãy số không được lớn hơn 10");
            }
        } while (n > 10);

        // Khởi tạo mảng
        arr = new int[n];


        // Yêu cầu người dùng nhập vào các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.println("Mời bạn nhập vào phần tử thứ " + (i + 1) + " của mảng: ");
            arr[i] = sc.nextInt();
        }

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(arr);

        // In ra mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp là: " + Arrays.toString(arr));
    }
}
