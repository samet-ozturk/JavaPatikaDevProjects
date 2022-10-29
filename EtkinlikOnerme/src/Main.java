
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    short havaSicakligi;

    Scanner value = new Scanner(System.in);

    System.out.println("Sıcaklık Değerini Giriniz: ");
    havaSicakligi = value.nextShort();


    if (havaSicakligi<5){
        System.out.println("Kayak Yapmalısın!");
    } else if (5<=havaSicakligi && havaSicakligi<=15) {
        System.out.println("Sinema Yapmalısın!");
    } else if (16<=havaSicakligi && havaSicakligi<=25){
        System.out.println("Piknik Yapmalısın!");
    }else if (25<havaSicakligi){
        System.out.println("Yüzmelisin!");
    }else {
        System.out.println("Yapacak bişey yok!");
    }


    }
}