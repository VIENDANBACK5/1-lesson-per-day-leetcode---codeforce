import java.util.Scanner;
public class tinhtongnsonguyenduongdautien {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            tinhtong();
        }
    }
    public static void tinhtong(){
       long a = sc.nextLong();
       long tong = a * (a + 1) / 2;
       System.out.println(tong);
    }
}