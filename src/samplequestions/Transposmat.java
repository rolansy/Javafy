package samplequestions;

import java.util.*;
public class Transposmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number of rows : ");
		r= sc.nextInt();
		System.out.print("Enter Number of Columns : ");
		c= sc.nextInt();
		int[][]a=new int[100][100];
		int[][]x=new int[100][100];
		for (i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print("Enter Element : ");
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("Actual Matrix : ");
		for (i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		for (i=0;i<r;i++) {
			for(j=0;j<c;j++) {
				x[j][i]=a[i][j];
			}
		}
		System.out.println("Transpose Matrix : ");
		for (i=0;i<c;i++) {
			for(j=0;j<r;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println("");
		}
		

	}

}
