import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int an,an2;
    System.out.println("Bir N değeri giriniz: ");
    an = input.nextInt();
    System.out.println("Bir Başlangıç değeri giriniz: ");
    an2 = input.nextInt();

    patterN(an,an2);

    }


    public static void patterN(int n,int last){
        Scanner input = new Scanner(System.in);

        int ff;

        if (n<0){
            last =last+5;
            System.out.println("Son değer: "+ last);
            System.out.println("bir N değeri gir: ");
            ff = input.nextInt();
            patterN(ff,last);
        }else {
            last=last-5;
            System.out.println("Son Deger: "+ last);
            System.out.println("bir N değeri gir: ");
            ff = input.nextInt();
            patterN(ff,last);
        }

    }
}