/*
 * Create a class with a method that prints "This is parent class" and its subclass with another method that
 * prints "This is child class". Now, create an object for each of the class and call
 * 1 - method of parent class by object of parent class
 * 2 - method of child class by object of child class
 * 3 - method of parent class by object of child class
 */
import java.io.*;
import java.util.Scanner;

public class Lab2_5 {
	public static void main(String[] args) {
		parent p = new parent();
		child c = new child();
		
		p.messageParent();
		c.messageChild();
		c.messageParent();		
	}
}

class parent{
	void messageParent() {
		System.out.println("This is parent class");		
	}
}

class child extends parent{
	void messageChild(){
		System.out.println("This is child class");		
	}
}