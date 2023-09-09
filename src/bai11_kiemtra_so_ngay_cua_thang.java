import java.util.Scanner;

public class bai11_kiemtra_so_ngay_cua_thang {
    public static void main(String[] args) {
        //Nhập vào 1 tháng từ 1-12, kiểm tra tháng đó có bao nhiêu ngày. Nếu tháng đó không hợp lệ thì thông báo cho người dùng biết
        //Khai báo biến
        int thang, nam;
        int songay = 0;

        //Khai báo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        //Yêu cầu người dùng nhập vào tháng và năm
        System.out.println("Mời bạn nhập vào tháng: ");
        thang = sc.nextInt();
        System.out.println("Mời bạn nhập vào năm: ");
        nam = sc.nextInt();

        //Kiểm tra tháng đó có bao nhiêu ngày
        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Tháng " + thang + " có 31 ngày");
            case 4, 6, 9, 11 -> System.out.println("Tháng " + thang + " có 30 ngày");
            case 2 -> {
                if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                    System.out.println("Tháng " + thang + " có 29 ngày");
                } else System.out.println("Tháng " + thang + " có 28 ngày");
            }
            default -> System.out.println("Tháng bạn nhập không hợp lệ");
        }
    }
}
