/*
Date : 26.10.2020
Program : Add two numbers
*/
import java.io.*;
import java.util.Scanner;

public class Lab1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("The sum is "+(num1+num2));
		sc.close();
	}
}
