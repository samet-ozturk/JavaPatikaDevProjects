import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float kmBasina=2.2f, minTutar=20f, tAcilis=10f, toplamUcret;
        int KM;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Gidilecek Mesafeyi Giriniz(KM): ");
        KM = girdi.nextInt();

        toplamUcret = (KM*kmBasina)+tAcilis;

        double b = (toplamUcret<=20) ? 20 : toplamUcret;

        System.out.println("Toplam Ödemeniz Gereken Tutar: " + b );

    }
}