/*
 * Date : 26.10.2020
 * Program : Find sum of 'n' natural numbers
 */
import java.io.*;
import java.util.Scanner;

public class Lab1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		System.out.println("The sum is "+sum);
		sc.close();
	}
}
