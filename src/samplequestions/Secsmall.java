package samplequestions;

import java.util.*;

public class Secsmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,temp;
		int[]a;
		a=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		int n= sc.nextInt();
		System.out.println("Enter the Elements");
		for (i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for (i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++) {
				if (a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (i=0;i<n;i++) {
			if (a[i]<a[i+1]) {
				System.out.println(a[i+1]+" is the second smallest element");
				break;
			}
		}

	}

}
