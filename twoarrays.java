import java.util.*;
public class TwoArrays {

    public static void main(String args[]) { 
        Scanner scn= new Scanner(System.in);
        int rows=scn.nextInt();
        int cals=scn.nextInt();
        int[][] numbers=new int[rows][cals];

        //input
        //row
        for(int i=0; i<rows; i++){
            //collum
            for(int j=0;j<cals; j++){
                numbers[i][j]=scn.nextInt();
            }
        }
        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cals; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}