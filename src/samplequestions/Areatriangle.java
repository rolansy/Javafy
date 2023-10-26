package samplequestions;

import java.util.Scanner;

public class Areatriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter Height : ");
		a=sc.nextInt();
		System.out.print("Enter Base : ");
		b=sc.nextInt();
		System.out.println("Area Of Triangle : "+(0.5*a*b));
	}

}
