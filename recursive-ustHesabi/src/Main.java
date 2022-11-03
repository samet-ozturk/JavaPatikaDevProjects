import java.util.Scanner;
public class Main {

    static Scanner input = new Scanner(System.in);
    static int value1;
    static int value2;
    public static int usHesap(int t, int un){
        if (un==0 || t==1){
            return 1;
        }else{
            return t*usHesap(t,un-1);
        }

    }
    public static void main(String[] args) {
        System.out.print("Taban Sayısını giriniz: ");
        value1 = input.nextInt();
        System.out.print("Üs Sayısını giriniz: ");
        value2 = input.nextInt();

        int sonuc = usHesap(value1,value2);
        System.out.println(sonuc );
    }

}