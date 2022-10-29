import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short matematik,turkce,fizik,kimya,muzik,sonuc;

        System.out.println("----DERS NOTU HESAPLAMA PROGRAMI----");

        System.out.println("Matematik Dersi Sonucu : ");
        matematik = input.nextShort();
        System.out.println("Türkçe Dersi Sonucu : ");
        turkce = input.nextShort();
        System.out.println("Fizik Dersi Sonucu : ");
        fizik = input.nextShort();
        System.out.println("Kimya Dersi Sonucu : ");
        kimya = input.nextShort();
        System.out.println("Müzik Dersi Sonucu : ");
        muzik = input.nextShort();

        if ((matematik<101 && turkce<101 && fizik<101 && kimya<101 && muzik<101)&&(0<=matematik && 0<=turkce && 0<=fizik && 0<=kimya && 0<=muzik)) {
            sonuc = (short) ((matematik + turkce + fizik + kimya + muzik) / 5);
            System.out.println("Sınav Sonucu: "+ sonuc);
        }else {
            System.out.println("Girdiğiniz bir ders notu yanlış.");
        }

    }
}