
public class Main {
    public static void main(String[] args) {

        int[] list =  {1,8,3,4,5,6,1};
        double sum = 0;
        double harmonikSum = 0;

        for(int i=0;i<list.length;i++){
            sum +=list[i];
            harmonikSum += ((double) 1/list[i]);

        }

        double avarage = sum/list.length;

        System.out.println("Dizinin ortalaması: "+ avarage);
        System.out.println(" Harmonik Ortalama: " + list.length/harmonikSum);


    }
}