

public class Main {
    static boolean isFind(int[] arr, int value){
        for (int i:arr){
            if (i == value){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] liste = {3,6,8,6,3,6,8,22,3,4};
        int[] dublicateListe = new int[liste.length];
        int startindex=0;

        for (int i =0;i<liste.length;i++){
            for (int j=0;j< liste.length;j++){
                if((i!=j)&& (liste[i]%2==0) && (liste[i] == liste[j] ) ){
                    if (!isFind(dublicateListe, liste[i])){
                        dublicateListe[startindex++]=liste[i];
                    }
                    break;
                }
            }
        }
       for (int value : dublicateListe){
           if (value != 0){
               System.out.println(value);
           }
       }
    }
}