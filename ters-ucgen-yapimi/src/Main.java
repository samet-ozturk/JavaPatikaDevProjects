
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı gir: ");
        number = inp.nextInt();

        for (int i=1;i<=number;i++){

            for(int j=0;j<=i;j++){
                System.out.print(" ");

            }
            for (int k=1;k<=(number-i);k++){
                System.out.print("*");

            }
            System.out.println(" ");

        }


    }
}