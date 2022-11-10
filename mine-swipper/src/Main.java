
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int satir;
    int sutun;


        System.out.println("Kaç Satırlı olsun: ");
        satir = input.nextInt();
        System.out.println("Kaç sütunlu olsun: ");
        sutun = input.nextInt();

        mineSweeper start = new mineSweeper(satir,sutun);

       start.printer();
       start.matrix();
       start.randoMine();
    }
}