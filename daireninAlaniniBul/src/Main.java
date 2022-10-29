import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14;
        double alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarı Çapını Girin: ");
        r = input.nextInt();
        System.out.println("Dairenin Merkez Ölçüsünü Girin: ");
        a = input.nextInt();

        alan =(pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı:" + alan);
    }
}