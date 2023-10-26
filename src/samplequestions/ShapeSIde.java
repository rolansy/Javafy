package samplequestions;

abstract class Shape{
	
	public abstract int NumberOfSides();
}

class Triangle extends Shape{
	
	public int NumberOfSides() {
		return 3;
	}
}

class Rectangle extends Shape{
	
	public int NumberOfSides() {
		return 4;
	}
}

class Hexagon extends Shape{
	
	public int NumberOfSides() {
		return 6;
	}
}

public class ShapeSIde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle=new Triangle();
		Rectangle rectangle=new Rectangle();
		Hexagon hexagon=new Hexagon();
		
		System.out.println("Number of Sides of Triangle : "+triangle.NumberOfSides());
		System.out.println("Number of Sides of Rectangle : "+rectangle.NumberOfSides());
		System.out.println("Number of Sides of Hexagon : "+hexagon.NumberOfSides());
		
		
	}

}
