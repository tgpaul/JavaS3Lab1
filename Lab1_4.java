//Check if a given number is Prime or nah
import java.io.*;
import java.util.Scanner;

public class Lab1_4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int flag = 0;
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");
		sc.close();
		
	}
}
