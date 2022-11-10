import java.util.Random;
import java.util.Scanner;
public class mineSweeper {
    int line;
    int column;
    int[][] matrixGame;
    String[][] matrixShow;

    mineSweeper(int line,int column){

        this.line = line;
        this.column=column;
        this.matrixGame = new int[line][column];
        this.matrixShow = new String[line][column];
    }

    public void printer(){
        System.out.println(this.line +" "+ this.column);
    }
    public void randoMine(){
        int a= (this.column*this.line)/4;
        Random rn = new Random();
        int randomColumnNum;
        int randomLineNum;
        System.out.println(a);

        for (int i=0;i<a;i++){
            randomColumnNum = rn.nextInt((this.column - 0) + 0) + 0;
            randomLineNum = rn.nextInt((this.column - 0) + 0) + 0;


            System.out.println("random column : "+ randomColumnNum);
            System.out.println("Random Line : "+randomLineNum);

            matrixGame[randomColumnNum][randomLineNum]=5;

        }

        for(int i=0; i< this.line;i++){
            System.out.print("[");
            for (int j=0; j< this.column; j++){
                System.out.print(matrixGame[i][j]);
            }
            System.out.print("]");
            System.out.println("");
        }

    }
    public void matrixshow(){
        for(int i=0; i< this.line;i++){
            for (int j=0; j< this.column; j++){
                matrixShow[i][j]= "-";

            }
        }
    }
    public void play(){
        int satirP;
        int sutunP;
        matrixshow();

        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Bir satır girin: ");
            satirP = input.nextInt();
            System.out.println("Bir sütun girin: ");
            sutunP = input.nextInt();
            if(matrixGame[satirP][sutunP]==5){
                System.out.println("Game Over!....");
            } else if (matrixGame[satirP][sutunP]!=5) {

                int mayinsayar=0;
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        if(satirP-1+i>=0 && satirP-1+i<matrixGame.length){
                            if (sutunP-1+j>=0 && sutunP-1+j<matrixGame[i].length){
                                if(matrixGame[satirP-1+i][sutunP-1+j]==5){
                                    mayinsayar++;
                                }
                            }
                        }
                    }
                }
                matrixShow[satirP][sutunP]= String.valueOf(mayinsayar);

                for(int i=0; i< this.line;i++){
                    System.out.print("[");
                    for (int j=0; j< this.column; j++){

                        System.out.print(matrixShow[i][j]);
                    }
                    System.out.print("]");
                    System.out.println("");
                }
            }
        }while(matrixGame[satirP][sutunP]!=5);
    }
}