
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,hesapSayi,buyukSayi=0,kucukSayi=0;
        System.out.println("Toplam Kaç tane sayı gireceksiniz: ");
        sayi = input.nextInt();

        for (int i=1;i<=sayi;i++){
            System.out.println(i+".Sayıyı Giriniz: ");
            hesapSayi = input.nextInt();

            if (i==1){
                buyukSayi=hesapSayi;
                kucukSayi=hesapSayi;
            }
            if (hesapSayi>=buyukSayi){
                buyukSayi = hesapSayi;
            } else if (hesapSayi<kucukSayi) {
                kucukSayi = hesapSayi;
            }


        }
        System.out.println("Sonuç olarak Büyük Sayı: "+ buyukSayi + "Küçük sayı ise: "+ kucukSayi);
    }
}