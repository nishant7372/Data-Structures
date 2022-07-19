package stack.Array;

import java.util.Scanner;

public class Stack_StaticArray {
	static Scanner scan = new Scanner(System.in);
	static int[] stack = new int[10];
	static int top = -1;
	public static void main(String[] args)
	{
		while(true)
		{
		System.out.println("\nOperations that u can perform on the data:");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("4. Traverse/Display");
		System.out.println("5. Exit");
		System.out.print("Enter your choice:");
		int ch = scan.nextInt();
		switch(ch)
		{
		case 1: push();
		        break;
		case 2: pop();
		        break;
		case 3: peek();
		        break;
		case 4: traverse();
		        break;
		case 5: System.exit(1);
		        break;
		default: System.out.println("Invalid Choice\n");
		}
		}
	}
	
	static void push()
	{
	   if(isFull())
	   {
		   System.out.println("Stack OVERFLOW");
	   }
	   else
	   {
		  System.out.print("Enter the data:");
		  int data = scan.nextInt();
		  stack[++top]=data;
		  System.out.println(data + " is Inserted");
	   }
	}
	
	static void pop()
	{
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW");
	   }
	   else
	   { 
		  System.out.println(stack[top--] + " is Popped Out");
	   }
	}
	
	static void peek()
	{
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW");
	   }
	   else
	   { 
		  System.out.println(stack[top] + " is at the Peek of Stack");
	   }
	}
	
	static void traverse()
	{
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW");
	   }
	   else
	   { 
		 for(int i=top;i>=0;i--)
		 {
			 System.out.println("--" + stack[i] + "--");
		 }
	   }
	}
	
	static boolean isFull()
	{
		if(top==stack.length-1)
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
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

