/*
 * Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its
 * length and breadth as parameters of its constructor and having a method named 'returnArea' which returns
 * the area of the rectangle. Length and breadth of rectangle are entered through keyboard
 */

import java.io.*;
import java.util.Scanner;

public class Lab2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}
}

class area{
	int length,breadth;
	double area;
	area(int lenght, int breadth){
		this.length = length;
		this.breadth = breadth;
		area = length*breadth;
	}
	
	double returnArea() {
		return area;
	}
	
}
