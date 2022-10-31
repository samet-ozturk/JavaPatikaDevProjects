
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,sonuc=0;
        System.out.println("Bir sayı giriniz: ");
        sayi = input.nextInt();

        if (sayi>0){
            for (int i=1;i<sayi;i++){
                if (sayi%i==0){
                    sonuc+=i;
                }else {

                }
            }
            if (sonuc==sayi){
                System.out.println("Girdiğiniz değer bir Mükemmel Sayıdır!  ");
            }
        System.out.println("Toplam: "+ sonuc);
        }else {
            System.out.println("Girdiğiniz değer negatiftir. Lütfen Pozitif değer deneyiniz.");
        }
    }
}