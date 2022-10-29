import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo;

        Scanner inp = new Scanner(System.in);
        System.out.println("Kilonu Gir: ");
        kilo = inp.nextDouble();
        System.out.println("Boyunu Gir: ");
        boy = inp.nextDouble();

        double sonuc = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndexiniz: "+ sonuc);


    }
}