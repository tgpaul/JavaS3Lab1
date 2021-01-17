//Find the factor of a given number
import java.io.*;
import java.util.Scanner;

public class Lab1_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a  number : ");
		int num = sc.nextInt();
		System.out.printf("The factors of %d are : ",num);
		for(int i=1;i<=num/2;i++) {
			if(num%i==0)
				System.out.printf("%d ",i);
		}
		sc.close();
	}
}
