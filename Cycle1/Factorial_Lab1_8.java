//Find factorial of first 'n' numbers
import java.io.*;
import java.util.Scanner;

public class Lab1_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1 ; i<=num ; i++) {
			for(int j=1 ; j<=i ; j++) {
				fact *= j;
			}
			System.out.printf("%d! = %d\n",i,fact);
			fact = 1;
		}
		sc.close();
	}
}
