package labcycle2;
import java.util.*;
interface Sports{
	final double sportwt=6.0;
	abstract void putwt();
}

class student{
	int rollno;
	void getno() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll no : ");
		rollno=sc.nextInt();
	}
	void puttno() {
		System.out.print("RollNo : "+rollno);
	}
}

class test extends student{
	int term1;
	int term2;
	void getmarks() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Term 1 Marks : ");
		term1=sc.nextInt();
		System.out.print("Enter Term 2  Marks : ");
		term2=sc.nextInt();
	}
	
}

public class multipleInheritance {
	public static void main()
{}
}
