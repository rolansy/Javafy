package samplequestions;
import java.util.*;

public class MatrixMultiplication{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of Rows of matrix A : ");
        int arow=sc.nextInt();
        System.out.print("Enter the number of Columns of matrix B : ");
        int acol=sc.nextInt();

        System.out.print("Enter the number of ROws of Matrix B : ");
        int brow=sc.nextInt();
        System.out.print("Enter the number of Columns of Matrix B : ");
        int bcol=sc.nextInt();
        
        if (acol!=brow){
            System.out.print("The Matrices cannot be multiplied");
            return;
        }

        int[][] matrixa = new int[arow][acol];
        System.out.println("Enter Elements for Matrix A : ");
        inputm(sc, matrixa);

        int[][] matrixb=new int[brow][bcol];
        System.out.println("Enter Elements for Matrix B : ");
        inputm(sc, matrixb);

        int[][] resultm=multiply(matrixa, matrixb);

        System.out.println("Product Matrix of Matrix A : ");
        display(matrixa);
        System.out.println("And Matrix B : ");
        display(matrixb);
        System.out.println("Is : ");
        display(resultm);
        

    }
    
    public static void inputm(Scanner sc, int[][] m){
        for (int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print("Enter Element at position ("+(i+1)+","+(j+1)+") : ");
                m[i][j]=sc.nextInt();

            }
        }
    }
    public static int[][] multiply(int[][] a,int[][] b){
        int arow=a.length;
        int acol=a[0].length;
        int bcol=b[0].length;

        int[][] result = new int[arow][bcol];
        for (int i=0;i<arow;i++){
            for (int j=0;j<bcol;j++){
                for(int k=0;k<acol;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return result;
    }

    public static void display(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}