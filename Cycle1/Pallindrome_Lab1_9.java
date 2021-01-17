//Check if the given number is Palindrome or nah
import java.io.*;
import java.util.Scanner;
public class Lab1_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int copy = num;
		int rev=0,rem;
		while(num>0) {
			rem = num % 10;
			rev = (rev*10) + rem;
			num = num / 10;	
		}
		if(rev==copy)
			System.out.println("The given number IS a Palindrome");
		else
			System.out.println("The given number IS NOT a Palindrome");
		sc.close();
		
	}
}
