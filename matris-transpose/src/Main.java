

public class Main {
    public static void main(String[] args) {



        int matrix[][] = new int[2][3];
        int dugo=2;

        for(int i=0; i< matrix.length;i++){

            for(int j=0;j< matrix.length+1;j++){
                dugo=dugo*3;

                matrix[i][j]=dugo;

                dugo++;
            }

        }

        for (int i=0;i< matrix.length;i++){
            System.out.print("[");
            for (int j=0;j< matrix.length+1;j++){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.println("");
        }

        // Transpose of Matrix
        for (int i=0;i< matrix.length+1;i++){
            System.out.print("[");
            for (int j=0;j< matrix.length;j++){
                System.out.print(matrix[j][i]);
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.println("");
        }
    }



}