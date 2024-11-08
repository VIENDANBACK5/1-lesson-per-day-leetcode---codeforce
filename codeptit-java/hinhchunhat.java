import java.util.Scanner;

public class hinhchunhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int h = input.nextInt();

        if (w <= 0 || h <= 0) {
            System.out.println(0);
        } else {
            System.out.println(2 * (w + h) + " " + w * h);
        }
    }
}