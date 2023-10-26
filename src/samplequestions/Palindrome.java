package samplequestions;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the string to check if Palindrome or Not : ");
		String a=sc.nextLine();
		String s=a.toLowerCase();
		int l=s.length();
		int x=0;
		for(int i=0;i<l/2;i++) {
			if(s.charAt(i)!=s.charAt(l-i-1)) {
				x=1;
				break;
				
			}
		}
		if (x==0) {
			System.out.print(a+" is a Palindrome");
		}
		else {
			System.out.print(a+" is Not a Palindrome");
		}
	}

}
