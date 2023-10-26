package samplequestions;

import java.util.Scanner;

 class Employee{
	String name;
	int age;
	int phoneno;
	String address;
	float Salary;
	void salary() {
		System.out.println("Salary : "+Salary);
	}
	void data() {
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
		System.out.println("Phone No : "+phoneno);
		System.out.println("Address : "+address);
	}
}

class Officer extends Employee{
	String specialization;
	void spec() {
		System.out.println("Specialization : "+specialization);
	}
}

class Manager extends Employee{
	String department;
	void dept() {
		System.out.println("Department : "+department);
	}
}

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Officer officer=new Officer();
	Manager manager=new Manager();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Officer Details : ");
	System.out.print("Enter Name : ");
	officer.name=sc.next();
	System.out.print("Enter Age : ");
	officer.age=sc.nextInt();
	System.out.print("Enter PhoneNo : ");
	officer.phoneno=sc.nextInt();
	System.out.print("Enter Address : ");
	officer.address=sc.next();
	System.out.print("Enter Salary : ");
	officer.Salary=sc.nextInt();
	System.out.print("Enter Specialization : ");
	officer.specialization=sc.next();
	System.out.println("Enter Officer Details : ");
	System.out.print("Enter Name of Officer : ");
	manager.name=sc.next();
	System.out.print("Enter Age : ");
	manager.age=sc.nextInt();
	System.out.print("Enter PhoneNo : ");
	manager.phoneno=sc.nextInt();
	System.out.print("Enter Address : ");
	manager.address=sc.next();
	System.out.print("Enter Salary : ");
	manager.Salary=sc.nextInt();
	System.out.print("Enter Department : ");
	manager.department=sc.next();
	
	System.out.println("Officer: ");
	officer.data();
	officer.spec();
	officer.salary();
	
	System.out.println("");
	System.out.println("Manager: ");
	manager.data();
	manager.dept();
	manager.salary();
	
	}
}
