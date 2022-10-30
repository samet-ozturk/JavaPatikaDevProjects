
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int km,yas,yolculukTipi;
    double kmBasina=0.10;

    System.out.println("Gideceğiniz Yer Kaç KM?");
    km = inp.nextInt();
    System.out.println("Yaşınızı Yazınız..");
    yas = inp.nextInt();
    System.out.println("Yolculuk Tipinizi Yazınız:(Tek yön=1, Gidiş-Dönüş=2)");
    yolculukTipi = inp.nextInt();

    if ((yolculukTipi==1 || yolculukTipi==2) && (km>0 && yas>0)){
    double normalFiyat = (km*kmBasina*yolculukTipi);

    System.out.println("Ödenecek Normal tutar: "+ normalFiyat);

        if (yas<12){
            System.out.println("12 Yaşından küçük Olduğunuz için %50 indirim uygulandı: "+ (normalFiyat*0.5));
            if (yolculukTipi==2){
                System.out.println("%20'de dönüşlü bilet alma indirimi uygulandı: "+ ((normalFiyat*0.5)*0.8));
            }else {System.out.println("Toplam Ödeyeceğiniz miktar: "+(normalFiyat*0.5));}

        } else if (yas<24 && 12<yas) {
            System.out.println("12-24 yaş aralığında olduğu için %10 indirim uygulanacaktır."+ (normalFiyat*0.9));
            if (yolculukTipi==2){
                System.out.println("%20'de dönüşlü bilet alma indirimi uygulandı: "+ ((normalFiyat*0.9)*0.8));
            }else {System.out.println("Toplam Ödeyeceğiniz miktar: "+(normalFiyat*0.9));}
        } else if (yas>65) {
            System.out.println("65 Yaşından büyük oldugu için %30 indirim uygulanacaktır. "+ (normalFiyat*0.7));
            if (yolculukTipi==2){
                System.out.println("%20'de dönüşlü bilet alma indirimi uygulandı: "+ ((normalFiyat*0.7)*0.8));
            }else {System.out.println("Toplam Ödeyeceğiniz miktar: "+(normalFiyat*0.7));}
        }

    }else {
        System.out.println("Hatalı Giriş Yaptınız!");
    }

    }
}