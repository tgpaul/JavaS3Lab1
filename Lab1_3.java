/*
 * Date : 26.10.2020
 * Program : Check if given number is odd or even
 */
import java.util.Scanner;
import java.io.*;

public class Lab1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num  =  sc.nextInt();
		if(num%2 == 0)
			System.out.println("Even");
		else if (num == 0)
			System.out.println("Zero");
		else
			System.out.println("Odd");
	}
}
