
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short yil;
        System.out.println("Yılı giriniz: ");
        yil = input.nextShort();
        short bolum = (short) (yil%4);
        switch (bolum){
            case 0:
                System.out.println("Bu yıl bir Artık Yıldır.");
            break;
            case 1:
                System.out.println("Bu yıl bir Artık Yıl değildir.");
            break;
            case 2:
                System.out.println("Bu yıl bir Artık Yıl değildir.");
            break;
            case 3:
                System.out.println("Bu yıl bir Artık Yıl değildir.");
            break;
        }




    }
}