package queue.Array;

import java.util.Scanner;

public class Queue_StaticArray {

	static Scanner scan = new Scanner(System.in);
	static int[] queue = new int[10];
	static int front = 0;
	static int rear = 0;
	public static void main(String[] args)
	{
		while(true)
		{
		System.out.println("\nOperations that u can perform on the data:");
		System.out.println("1. Insert/Enqueue");
		System.out.println("2. Delete/Dequeue");
		System.out.println("3. Traverse/Display");
		System.out.println("4. Exit");
		System.out.print("Enter your choice:");
		int ch = scan.nextInt();
		switch(ch)
		{
		case 1: enqueue();
		        break;
		case 2: dequeue();
		        break;
		case 3: traverse();
		        break;
		case 4: System.exit(1);
		        break;
		default: System.out.println("Invalid Choice\n");
		}
		}
	}
	
	static void enqueue()
	{
		if(isFull())
		{
			System.out.println("Queue OVERFLOW");
		}
		else
		{
			System.out.print("Enter the data:");
			int data = scan.nextInt();
			queue[rear++]= data;
			System.out.println(data + " is inserted");
		}
	}
	
	static void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue UNDERFLOW");
		}
		else
		{
			System.out.println(queue[front]+ " is deleted");
			for(int i=front;i<rear-1;i++)
			{
				queue[i]=queue[i+1];
			}
			rear--;
		}
	}
	
	static void traverse()
	{
		if(isEmpty())
		{
			System.out.println("Queue UNDERFLOW");
		}
		else
		{
			for(int i=front;i<rear;i++)
			{
				System.out.print("<--" + queue[i]);
			}
		}
	}
	
	static boolean isFull()
	{
		if(rear == queue.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static boolean isEmpty()
	{
		if(front==rear)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
