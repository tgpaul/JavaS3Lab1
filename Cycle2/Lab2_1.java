/*
 * Write a Java class having overloaded methods to calculate area of rectangle
 * and circle.
*/
import java.io.*;
import java.util.Scanner;

public class Lab2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lab2_1 A = new Lab2_1();
		float length,breadth,radius;
		System.out.println("Enter the length and breadth of the retangle : ");
		length = sc.nextFloat();
		breadth = sc.nextFloat();
		System.out.println("The area of the rectangle is : "+A.calcArea(length,breadth)+" sq. units");
		System.out.println("Enter the radius of the circle : ");
		radius = sc.nextFloat();
		System.out.println("The area of the circle is : "+A.calcArea(radius)+" sq. units");
		sc.close();
	}
	float calcArea(float length, float breadth){
		return (length*breadth);
	}
	double calcArea(float radius) {
		return (3.14*radius*radius);
	}
}
