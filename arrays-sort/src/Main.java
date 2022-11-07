
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner listInput = new Scanner(System.in);
        Scanner listIn = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz: ");
        int a = listInput.nextInt();
        System.out.println("Dizinin Elemanlarını Giriniz: ");
        int [] listA = new int[a];

        for (int i=0;i<listA.length;i++){
        System.out.print(i+". Elemanı Giriniz: ");
        int value = listIn.nextInt();
        listA[i]=value;

        }
        Arrays.sort(listA);
        for(int i=0;i<listA.length;i++){
            System.out.print(listA[i]);
            System.out.print(",");
        }
        

    }
}