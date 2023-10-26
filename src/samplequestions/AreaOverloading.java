package samplequestions;
import java.util.*;
class Area{
	void area(int r) {
		double a =3.14*r*r;
		System.out.println("Area of Circle : "+a);
	}
	void area(int l,int b) {
		double a =l*b;
		System.out.println("Area of Rectangle : "+l*b);
	}
	void area(int a,int b,int c) {
		double s =(a+b+c)/2;
		double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.print("Area of Triangle : "+ar);
	}
}
public class AreaOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area A=new Area();
		A.area(10);
		A.area(10,10);
		A.area(10,10,10);
		

	}
}