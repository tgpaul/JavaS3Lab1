/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating
 * a class named 'Triangle' without any parameter in its constructor
 */
import java.io.*;

public class Lab2_3 {
	public static void main(String[] args) {
		triangle t = new triangle();
	}
}

class triangle{
	triangle(){
		int side1=3,side2=4,side3=5;
		double peri,area,perihalf;
		peri = side1 + side2 + side3;
		perihalf = peri / 2;
		area = Math.sqrt(perihalf*(perihalf-side1)*(perihalf-side2)*(perihalf-side3));
		
		System.out.println("Given Triangle with sides 3,4 and 5 units\n\nPerimeter of Triangle = "+peri+" units");
		System.out.println("Area of Triangle = "+area+" sq.units");
	}
}
