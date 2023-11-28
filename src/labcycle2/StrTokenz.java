package labcycle2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StrTokenz{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a line of Integers : ");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s," ");
		int sum=0;
		while(st.hasMoreTokens()) {
			String str=st.nextToken();
			int n=Integer.parseInt(str);
			System.out.println(n);
			sum+=n;
			
		}
		System.out.print("Sum : "+sum);
		sc.close();
		
	}
}