import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Armut Kaç kilo? :");
        double degerArmut = girdi.nextDouble();
        System.out.println("Elma Kaç kilo? :");
        double degerElma = girdi.nextDouble();
        System.out.println("Domates Kaç kilo? :");
        double degerDomates = girdi.nextDouble();
        System.out.println("Muz Kaç kilo? :");
        double degerMuz = girdi.nextDouble();
        System.out.println("Patlıcan Kaç kilo? :");
        double degerPatlican = girdi.nextDouble();

        double totalValue = (armut-degerArmut) + (elma*degerElma) + (domates*degerDomates)+(muz*degerMuz) + (patlican*degerPatlican);

        System.out.println("Toplam Ödenecek Tutar: "+ totalValue);

    }
}