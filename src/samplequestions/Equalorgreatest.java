package samplequestions;

import java.util.*;

public class Equalorgreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter First Number : ");
		a=sc.nextInt();
		System.out.print("Enter Second Number : ");
		b=sc.nextInt();
		if (a==b)
			System.out.print("They are Equal");
		else if (a>b)
			System.out.print("Greatest : "+a+" Smallest : "+b);
		else
			System.out.print("Greatest : "+b+" Smallest : "+a);
	}

}
