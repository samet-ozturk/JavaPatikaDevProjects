import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik,ortalama;

        System.out.println("Not Ortalaması Hesaplama Programına Hoşgeldiniz!");

       Scanner input = new Scanner(System.in);

       System.out.println("Matematik Notunuzu giriniz:");
       matematik = input.nextInt();
       System.out.println("Fizik Notunuzu giriniz:");
        fizik = input.nextInt();
       System.out.println("Kimya Notunuzu giriniz:");
        kimya = input.nextInt();
       System.out.println("Türkçe Notunuzu giriniz:");
        turkce = input.nextInt();
       System.out.println("Tarih Notunuzu giriniz:");
        tarih = input.nextInt();
       System.out.println("Müzik Notunuzu giriniz:");
        muzik = input.nextInt();

        ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("6 dersinizin ortalaması: "+ ortalama);

        String gecti = "Geçtiniz";
        String kaldi = "Kaldınız";
        String b = String.valueOf((ortalama >= 60) ? gecti : kaldi);

        System.out.println(b);




    }
}