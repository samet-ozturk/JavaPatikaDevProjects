
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int c=2;

    static public void main(String[] args) {
        System.out.println("Asal Sayı Sorgu Sayısı Giriniz: ");
        int numbera = input.nextInt();

        asal(numbera,c);

    }
    static public void asal(int num,int c) {

        if(c==num){
            System.out.println("Asal Sayıdır!!!");
            return;
        } else if (num%c==0) {
            System.out.println("Asal Sayi Değildir. ");
            return;
        }
        asal(num,c+1);
    }



}