//Check if a number is odd or even
import java.util.Scanner;
import java.io.*;

public class Lab1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num  =  sc.nextInt();
		if(num%2 == 0)
			System.out.println("Even");
		else if (num == 0)
			System.out.println("Zero");
		else
			System.out.println("Odd");
		sc.close();
	}
}
