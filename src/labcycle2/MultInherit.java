package labcycle2;
import java.util.*;
interface Sports{
	final double sportwt=6.0;
	abstract void putwt();
}

class student{
	double rollno;
	void getno() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll no : ");
		rollno=sc.nextDouble();
	}
	void puttno() {
		System.out.println("RollNo : "+rollno);
	}
}

class test extends student{
	double term1;
	double term2;
	void getmarks() {
		Scanner c=new Scanner(System.in);
		System.out.print("Enter Term 1 Marks : ");
		term1=c.nextDouble();
		System.out.print("Enter Term 2  Marks : ");
		term2=c.nextDouble();
	}
	void putmarks() {
		System.out.println("Term 1 Marks : "+term1);
		System.out.println("Term 2 Marks : "+term2);
	}
	
}

class result extends test implements Sports{
	double total;
	public void putwt() {
		System.out.println("Sports Wt : "+sportwt);
	}
	void display() {
		total=term1+term2+sportwt;
		puttno();
		putmarks();
		putwt();
		System.out.println("Total : "+total);
	}
}
public class MultInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		result r=new result();
		r.getno();
		r.getmarks();
		r.display();
	}

}
