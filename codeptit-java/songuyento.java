import java.util.Scanner;
public class songuyento {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            ketqua();
        }
    }
    public static boolean songuyento(int n){
        if (n<2){
            return false;
        }
        for (int i = 2 ; i<= Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void ketqua() {
        int n= sc.nextInt();
        if (songuyento(n)){
            System.out.println("YES");
        }else{
        System.out.println("NO");
        }
    }

}