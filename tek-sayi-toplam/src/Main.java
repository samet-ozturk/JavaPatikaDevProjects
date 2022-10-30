
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int dd, toplam=0;

    do {
        System.out.println("Bir sayı giriniz: ");
        dd = input.nextInt();
        if ((dd%2)==0){
            toplam += dd;
        }
    }while (dd>0);

    System.out.println("Çift Sayıların toplamı: "+ toplam);

    }
}