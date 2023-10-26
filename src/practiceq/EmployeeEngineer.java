package practiceq;

class Employee{
	void display() {
		System.out.println("Employee"
				+ "");
	}
	void calcsalaryemployee() {
		System.out.println("Salary : 1000");
	}
}

class Engineer extends Employee{
	void display() {
		super.display();
		System.out.println(this.getClass().getSimpleName());
	}
	void calcsalaryengineer() {
		System.out.println("Salary : 4000");
	}
	
}

public class EmployeeEngineer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer eng=new Engineer();
		
		eng.display();
		eng.calcsalaryemployee();
		eng.calcsalaryengineer();
		
	}

}
