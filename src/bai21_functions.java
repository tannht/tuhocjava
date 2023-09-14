public class bai21_functions {
    public static void main(String[] args) {
       printHello("tannguyen");
       CongHaiSo(1, 2);
        GiaiPhuongTrinh(7, 8, 9);
    }
    public static void printHello(String name) {
        System.out.println("Hello " + name);
    }


    public static void CongHaiSo(int a, int b) {
        System.out.println("Tổng của " + a + " và " + b + " là: " + (a + b));
    }

    // tạo hàm giải phương trình bậc 2
    public static void GiaiPhuongTrinh(int a, int b, int c) {
        double x1, x2, delta;
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
            x1 = ((double) -b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

}
