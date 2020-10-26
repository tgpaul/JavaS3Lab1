/*
 * Date : 26.10.2020
 * Program : Check to see if a number is prime or nah
 */
import java.io.*;
import java.util.Scanner;

public class Lab1_4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int flag = 0;
		for(int i=2;i<num/2;i++) {
			if(num % i == 0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime");
		}
		else
			System.out.println("Not prime");
		sc.close();
		
	}
}
