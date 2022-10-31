
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayisini giriniz : ");
        int n = input.nextInt();
        int b = 0, c = 1, d;
        for (int i = 1; i <= n; i++) {
            d = b + c;
            System.out.println(b + "+" + c + "=" + d);
            b = c;
            c = d;

            System.out.println(" ");
        }
    }
}