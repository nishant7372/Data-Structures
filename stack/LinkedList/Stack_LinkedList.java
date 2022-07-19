package stack.LinkedList;

import java.util.Scanner;

public class Stack_LinkedList {
    static Scanner scan = new Scanner(System.in);
    static Node top = null;
    
    public static void main(String[] args)
    {
    	while(true)
		{
		System.out.println("\nOperations that u can perform on the data:");
		System.out.println("1. Push");
		System.out.println("2. Pop");
		System.out.println("3. Peek");
		System.out.println("4. Traverse/Display");
		System.out.println("5. Length");
		System.out.println("6. Exit");
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
		case 5: System.out.println("Length:" + length());
		        break;
		case 6: System.exit(1);
		        break;
		default: System.out.println("Invalid Choice\n");
		}
		}
	}
    
    static void push() 
    {
    	System.out.print("Enter the data:");
    	int data = scan.nextInt();
    	
    	Node temp = new Node(data,null);
  
    	temp.link = top;
    	top = temp; 
    	
    	System.out.println(data + " is inserted");
    }
    
    static void pop()
    {
    	if(isEmpty())
    	{
    		System.out.println("Stack UNDERFLOW");
    	}
    	else
    	{
    	Node temp = top;
    	top=temp.link;
    	temp.link=null;
    	
    	System.out.println(temp.data + " is popped out");
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
    	System.out.println(top.data + " is at the peek of Stack");
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
    		Node temp=top;
    		while(temp!=null)
    		{
    			System.out.println("--"+ temp.data +"--");
    			temp=temp.link;
    		}
    	}
    }
    
    static boolean isEmpty()
    {
    	if(top==null)
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
		Node temp=top;
		int c=0;
		while(temp!=null)
		{
			c++;
			temp=temp.link;
		}
		return c;
	}
}
