
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        short islem;
        String userName, password,passwordTry;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz: ");
        userName = input.next();
        System.out.println("Şifrenizi Giriniz: ");
        password = input.next();


        if(userName.equals("sametozturk") && password.equals("123456") ){
            System.out.println("Başarılı Şekilde Giriş yaptınız.");

        }else {
            System.out.println("Kullanıcı Adınız veya Şifreniz yanlış, Şifrenizi Fırılamak istiyorsanız, 1, istemiyorsanız 0'a basın.)");
            islem = input.nextShort();

            switch (islem){
                case 0:
                    System.out.println("Şifrenizi Sıfırlamak istemiyorsunuz. Uygulama kapatılıyor...");
                break;
                case 1:
                    System.out.println("kullanıcı adınızı giriniz: ");
                    userName = input.next();
                    System.out.println("Yeni Şifrenizi Giriniz: ");
                    password = input.next();
                    System.out.println("Yeni Şifrenizi Tekrar Giriniz: ");
                    passwordTry = input.next();

                    if(password.equals("123456")){
                        System.out.println("Şifreniz Önceki şifreniz ile aynı. Lütfen Başka bir şifre deneyiniz.");

                    } else if (password != passwordTry){
                        System.out.println("Şifreniz Değiştirildi.");
                    }
                    else {
                        System.out.println("Sistemde bir hata var tekrar deneyiniz....");
                    }

            }

        }


    }
}