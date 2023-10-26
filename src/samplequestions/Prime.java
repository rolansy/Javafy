package samplequestions;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to check if Prime or Not : ");
		int n = sc.nextInt();
		if (n==0 || n==1) {
			System.out.println(n+" is neither Prime nor Composite");
			f=1;
		}
		else {
			for(i=2;i<=n/2;i++) {
				
				if (n%i==0) {
					System.out.println(n+" is a Not a Prime Number");
					f=1;
					break;
					
				}
			}
		}
		if (f==0) {
			System.out.println(n+" is a Prime Number");
		}

	}

}
