
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int asalSayi;

        System.out.println("Bir max değer girin: ");
        asalSayi = inp.nextInt();

        for (int i=2;i<=asalSayi;i++){
            if (((i%2!=0)&&(i%3!=0))||(i==2)||(i==3)){
                System.out.print(" - "+i+" - ");
            }
        }
    }
}