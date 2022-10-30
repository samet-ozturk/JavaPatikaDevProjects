import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a,b;
       System.out.println("Üssü Alınacak Sayıyı Giriniz: ");
       a = input.nextInt();
       System.out.println("Üs Olacak SAyıyı Giriniz: ");
       b = input.nextInt();
        int total = 1;
       for (int i=1;i<=b;i++){
           total *=a;
       }
       System.out.println("Sonuç: "+ total);
    }
}