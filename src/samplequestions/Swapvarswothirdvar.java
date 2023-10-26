package samplequestions;

import java.util.*;

public class Swapvarswothirdvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter First Number : ");
		a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		b=sc.nextInt();			
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("First Number : "+a);
		System.out.println("Second Number : "+b);

	}

}
