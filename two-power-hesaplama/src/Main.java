
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int a,i=1;
    Scanner input = new Scanner(System.in);
    System.out.println("Bir sayi giriniz: ");
    a = input.nextInt();

    while (i<a){
        int dort= (i*=4);

        if (i<a){
        System.out.println(dort);
        }
    }

    }
}