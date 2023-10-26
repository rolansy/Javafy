package samplequestions;

import java.util.*;

public class Swapvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter First Number : ");
		a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		b=sc.nextInt();			
		c=a;
		a=b;
		b=c;
		System.out.println("First Number : "+a);
		System.out.print("Second Number : "+b);
		
	}

}
