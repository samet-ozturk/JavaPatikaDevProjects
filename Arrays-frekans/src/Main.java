
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        int[] liste = {10, 20, 20, 10, 10, 20, 5, 20};

        Arrays.sort(liste);
        int[] frekansList = new int[liste.length];

        

        for(int i=0;i< liste.length;i++){
            int sayac=0;
            for (int k=0; k< liste.length;k++){
                if(liste[i]==liste[k]){

                    sayac++;
                }
            }
            frekansList[i]=sayac++;
        }

        for (int i=0; i< frekansList.length; i++){
          //  System.out.print(frekansList[i]);
        }

        for(int i=0;i< liste.length;i++){
            if (i==0 || (liste[i]!=liste[i-1])){
                System.out.println(liste[i]+". Değerinden "+frekansList[i]+"   Tane var!");
            }

        }



    }

}