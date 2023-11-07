package labcycle2;
import java.util.Scanner;

public class trycatchthrowfinally {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		try{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the value of x : ");
				int x=sc.nextInt();
				System.out.print("Enter the value of y : ");
				int y=sc.nextInt();
				int z=x/y;
				System.out.println("The result is : "+z);
				sc.close();
	}
		catch (ArithmeticException e) {
			System.out.println("Cannot be divided by 0");
		}finally {
			System.out.println("Finally Executed");
			
		}
	}

}
