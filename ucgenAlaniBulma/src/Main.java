import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        int d;
        int alan;

        Scanner input = new Scanner(System.in);
        System.out.println("A Kenarını Giriniz: ");
        a=input.nextInt();
        System.out.println("B Kenarını Giriniz");
        b=input.nextInt();
        System.out.println("C Kenarını Giriniz: ");
        c=input.nextInt();

        d = (a+b+c) /2;
        alan = (int) Math.sqrt(d*(d-a)* (d-b) * (d-c));
        System.out.println("Üçgenin Alanı: "+ alan);









    }
}