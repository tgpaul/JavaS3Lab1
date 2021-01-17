//Find the sum of the first 'n' numbers
import java.io.*;
import java.util.Scanner;

public class Lab1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println("The sum is "+sum);
		sc.close();
	}
}
