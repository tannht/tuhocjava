import java.util.Scanner;

public class bai10_baitap_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào bán kính hình tròn: ");
        int r = sc.nextInt();
        double cv = 2*Math.PI*r;
        double dt = 2 * Math.PI * Math.pow(r,2);

        System.out.println("Chu vi hình tròn:" +cv);
        System.out.println("Diện tích hình tròn: " +dt);
    }
}
