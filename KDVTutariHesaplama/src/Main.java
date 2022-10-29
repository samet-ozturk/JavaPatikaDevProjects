
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double inValue, kdvOran8, kdvOran=0.18;
        System.out.println("-----------KDV Tutarını Hesaplayan Programa Giriş yaptınız--------------");

        Scanner input = new Scanner(System.in);

        System.out.println("KDV Hesaplanacak Değeri Girin: ");
        inValue =input.nextDouble();

        double KDV18Total = (inValue*kdvOran)+inValue;
        kdvOran8 =(inValue*kdvOran)+inValue;
        System.out.println("KDV Miktarı "+ inValue*kdvOran);


        double b = (inValue <= 1000) ? KDV18Total : kdvOran8;

        System.out.println(b);

    }
}