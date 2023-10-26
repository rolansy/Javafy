package samplequestions;

import java.util.*;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.print("Enter Number : ");
		a=sc.nextInt();
		if (a%2==0)
			System.out.print(a+" is an even number");
		else 
			System.out.print(a+" is an odd number");
	}

	
}
