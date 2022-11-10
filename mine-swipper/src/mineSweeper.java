import java.util.Random;
public class mineSweeper {
    int line;
    int column;
    int[][] matrixGame = new int[this.line][this.column];

    mineSweeper(int line,int column){
        this.line = line;
        this.column=column;
    }


    public void printer(){
        System.out.println(this.line +" "+ this.column);


    }

    public void matrix(){


        for(int i=0; i< this.line;i++){
            System.out.print("[");
            for (int j=0; j< this.column; j++){
                System.out.print("-");
            }
            System.out.print("]");
            System.out.println("");
        }

    }

    public void randoMine(){
        int a= (this.column*this.line)/4;
        Random rn = new Random();
        int randomColumnNum;
        int randomLineNum;
     //   System.out.println("random sütun: "+randomColumnNum);
      //  System.out.println("random satır: "+randomLineNum);
        System.out.println(a);

        for (int i=0;i<a;i++){
            randomColumnNum = rn.nextInt((this.column - 1) + 0) + 0;
            randomLineNum = rn.nextInt((this.column - 1) + 0) + 0;


            this.matrixGame[randomColumnNum][randomLineNum]=1;
//25. satırda yazdırmam gerekiyor öncelikle!!!!

        }


    }






}
