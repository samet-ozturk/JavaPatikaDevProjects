import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list ={99,5,1,-45,102,3,55}; // {-45,1,3,5,55,99,102}
        Scanner input = new Scanner(System.in);
        int min = list[0];
        int max = list[0];
        int number;
        int minNumber;
        int maxNumber;
        System.out.print("Bir sayı Girin:");
        number = input.nextInt();

        Arrays.sort(list);

        for(int i:list){
            if(i>number){
                System.out.println("Büyük En yakın dizi değeri: "+ i);
                int index = Arrays.binarySearch(list, i);
                System.out.println("Küçün En yakın dizi değeri: "+list[index-1]);
                break;
            }else {

            }
        }


        for (int i:list) {
            if(i<min){
                min=i;
            }
            if(i>max){
                max = i;
            }

        }
        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
    }
}