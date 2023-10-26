package labcycle2;
public class trycatchthrowfinally {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
				int x=10;
				int y=0;
				int z=x/y;
	}
		catch (ArithmeticException e) {
			System.out.println("Cannot be divided by 0");
		}finally {
			System.out.println("Finally Eecuted");
			
		}
	}

}
