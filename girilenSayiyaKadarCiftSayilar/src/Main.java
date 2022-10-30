
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0;
        int sayac=0;
        Scanner newInput = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        sayi = newInput.nextInt();

        for (int i=1;i<=sayi;i++){
            if ((i%4)==0 && (i%3)==0){
                toplam +=i;
                sayac++;
            }

        }
        int ortalama = toplam/sayac;
        System.out.println("toplam Sayı: "+ toplam);
        System.out.println("Ortalama Sayı: "+ ortalama);

    }
}