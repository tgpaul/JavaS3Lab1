/*
 * Define a class Queue for representing a queue data structure. The class must
 * define a default constructor, a parameterized constructor and functions for enqueue, de-queue and display operations. Write a Java program to implement
 * this.
 */
import java.io.*;
import java.util.Scanner;

public class Lab2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int new_size;
		System.out.println("Enter Size of new queue : ");
		new_size = sc.nextInt();	
		System.out.println(new_size);
		queue Q1 = new queue(new_size);  
		Q1.menu();
		System.out.println("\n\n/-/-/-/-/-/-/-/-/-/\nGiven Queue has 5 items size");
		queue Q2 = new queue();
		Q2.menu();
		System.out.println("End of program");
		sc.close();
	}
}

class queue{
	private Scanner sc = new Scanner(System.in);
	private int size,front,rear;
	private int[] items;
	queue(){
		size = 5;
		front = rear = 0;
		items = new int[size];
	}
	queue(int new_size){
		size = new_size;
		front = rear = 0;
		items = new int[size];
	}
	
	void menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.print("\n\n*-*-*-*-*-*-*\n1. Enqueue\n2. Dequeue\n3. Display\n4. Quit this queue\nEnter your choice (1-4) :");
			choice = sc.nextInt();

			switch(choice) {
				case 1: enqueue();
				break;
				case 2: dequeue();
				break;
				case 3: display();
				break;
				case 4: return;
				default:System.out.println("Invalid choice! (1-4)");
			}
		}while(choice!=4);
		sc.close();
	}
	
	void enqueue(){
		if(rear == size) {
			System.out.println("The queue is full!");
			return;
		}
		System.out.println("Enter the new item : ");
		items[rear] = sc.nextInt();
		rear++;
		
		System.out.println("Item entered!");
		display();
	}
	
	void dequeue() {
		if(front == rear) {
			System.out.println("The queue is empty!");
			return;
		}
		for(int i=0;i<rear-1;i++) {
			items[i] = items[i+1];
		}
		if(rear<size)
			items[rear] = 0;
		rear--;
		
		System.out.println("Item deleted!");
		display();
		
	}
	
	void display() {
		if (front == rear) {
			System.out.println("The queue is empty!");
			return;
		}
		System.out.print("The Queue is :\nFront->");
		for(int i=0;i<rear;i++) {
			System.out.println(items[i]+" ");
		}
	}
}