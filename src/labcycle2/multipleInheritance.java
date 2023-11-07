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

public class multipleInheritance {
	public static void main()
{}
}
