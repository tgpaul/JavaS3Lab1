//Print Fibonacci series
import java.io.*;
import java.util.Scanner;

public class Lab1_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n= sc.nextInt();
		int n1=0,n2=1;
		System.out.printf("Fibonacci series of the first %d numbers are ",n);
		for(int i=0;i<n;i++) {
			System.out.printf("%d ",n1);
			int temp = n1 + n2;
			n1 = n2;
			n2 = temp;
		}
		sc.close();
		
	}
}
