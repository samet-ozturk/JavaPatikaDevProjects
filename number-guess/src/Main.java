
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int knowNumber;
        int guess;
        int again=5;
        int[] guessList = new int[5];
        int win=0;
        Scanner input = new Scanner(System.in);
        knowNumber= (int) (Math.random()*100);

        System.out.println("Rastgele 0 ile 100 arasında bir sayı tutuldu. Tahmin edeceksiniz.");



            while (again>0){
                System.out.print("Tahmininiz: ");
                guess = input.nextInt();
                if ((guess>100) || (guess<0)){
                    System.out.print("Sadece 1-100 Arasında değerler girebilirsiniz. Bu sebeple program. kapatılıyor.");
                    break;
                }
                guessList[again-1]=guess;

                if(Math.abs(knowNumber-guess)<20){
                    System.out.println("Sıcaakk");
                }else {
                    System.out.println("Soğuk!");
                }

                if (guess==knowNumber){
                    System.out.println("Tebrikler! Sayıyı Doğru Bildiniz! Sayı: "+knowNumber );
                    win=1;

                } else if (guess!=knowNumber) {
                    System.out.println("Maalesef sayıyı bilemediniz!" );
                }
                again--;
            }
            if (again==0 && win==0){
                System.out.println("Bilemediniz. Kaybettiniz!");

                for (int i=0;i<guessList.length;i++){
                    System.out.print(", "+guessList[i]+" ");
                }
            }



    }
}