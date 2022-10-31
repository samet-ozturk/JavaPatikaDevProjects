import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price,right=3, balance=1500,operation;
        String userName,password;

        while (right>0){

        System.out.println("Kullanıcı adınızı giriniz:");
        userName = input.next();
        System.out.println("Şifre Giriniz: ");
        password = input.next();
        if (userName.equals("samet") && password.equals("123456")){
            System.out.println("Merhaba, Samet Bank'a hoşgeldiniz!!");
            System.out.println("---- Yapacağınız İşlemi Seçin ----");
            System.out.println("----1- Para Yatırma ----");
            System.out.println("----2- Para Çekme ----");
            System.out.println("----3- Bakiye Sorgulama ----");
            System.out.println("----4- Çıkış Yapma ----");
            operation = input.nextInt();

            switch (operation){
                case 1:
                    System.out.println("Para Yatırma İşlemini Seçtiniz: Yatıracağınız tutarı girip Enter Deyin.");
                    int ekstra = input.nextInt();
                    balance = ekstra+balance;
                    System.out.println("İşlem Başarılı Yeni Bakiyeniz..:"+ balance + "TL");
                    System.out.println("Güvenlik sebebi ile Çıkış yapıyorsunuz..");
                break;
                case 2:
                    System.out.println("Para Çekme İşlemini Seçtiniz: Yatıracağınız Tutarı girip Enter Deyin.");
                    int eksi =input.nextInt();
                    balance =eksi+balance;
                    System.out.println("İşlem Başarılı Yeni Bakiyeniz..:"+ balance + "TL");
                    System.out.println("Güvenlik sebebi ile Çıkış yapıyorsunuz..");
                break;
                case 3:
                    System.out.println("Bakiyenizi Sorguluyorsunuz:  Bakiyeniz: "+ balance);
                break;
                case 4:
                    System.out.println("Çıkış Yapma İşlemini seçtiniz. Hesabınızdan çıkış yapılıyor!");
                break;
                default:
                    System.out.println("Yanlış bir değer girdiniz!****");
            }
        }else {
            right--;
            System.out.println("Kalan hakkın: "+ right);
        }

        }


    }
}