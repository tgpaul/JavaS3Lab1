//Check to see if a given number is an Armstrong number or nah
import java.io.*;
import java.util.Scanner;

public class Lab1_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int copy = num,soc=0,dig;
		while(copy>0) {
			dig = copy % 10;
			soc += (dig*dig*dig);
			copy = copy / 10;
		}
		if(soc == num)
			System.out.println("The given number IS a Armstrong number");
		else
			System.out.println("The given number IS NOT a Armstrong number");
		sc.close();
	}
}
