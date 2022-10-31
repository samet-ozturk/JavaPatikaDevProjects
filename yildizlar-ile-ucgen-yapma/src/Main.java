
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int an;
    System.out.println("Bir sayı giriniz: ");
    an = input.nextInt();

    for (int i=0;i<an;i++){

        for (int j = 0; j < (an - i); j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i + 1); k++) {
            System.out.print("*");
        }
        System.out.println(" ");

    }
    for (int i=an;0<=i;i--){

            for (int j = 0; j < (an - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

    }




    }
}