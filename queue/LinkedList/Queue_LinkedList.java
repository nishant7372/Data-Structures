package queue.LinkedList;

import java.util.Scanner;

public class Queue_LinkedList {

	static Scanner scan = new Scanner(System.in);
	static Node front = null;
	static Node rear = null;
	public static void main(String[] args)
	{
		while(true)
		{
		System.out.println("\nOperations that u can perform on the data:");
		System.out.println("1. Insert/Enqueue");
		System.out.println("2. Delete/Dequeue");
		System.out.println("3. Traverse/Display");
		System.out.println("4. Length");
		System.out.println("5. Exit");
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
		case 4: System.out.println("Length: " + length());
		        break;
		case 5: System.exit(1);
		        break;
		default: System.out.println("Invalid Choice\n");
		}
		}
	}
	
	static void enqueue()
	{
		System.out.print("Enter data:");
		int data = scan.nextInt();
	    
		Node temp = new Node(data,null);
		
		if(front==null)
		{
		front=temp;
		}
		else
		{
		rear.link=temp;
		}
		rear = temp;

		System.out.println(data+" is inserted");
	}
	
	static void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue UNDERFLOW");
		}
		else
		{
		Node temp=front;
		
		front = temp.link;
		temp.link=null;
		
		System.out.println(temp.data + " is deleted");
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
			Node temp=front;
			
			while(temp!=null)
			{
				System.out.print("<--"+temp.data);
				temp=temp.link;
			}
		}
	}
	
	static boolean isEmpty()
	{
		if(front==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	static int length()
	{
		Node temp=front;
		int c=0;
		while(temp!=null)
		{
			c++;
			temp=temp.link;
		}
		return c;
	}

}
