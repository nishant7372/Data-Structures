package linkedList.singlyLinkedList.problems;

import java.util.Scanner;
//This program not working properly

public class Node_Reference_Swapping {

		static Node root=null;
		static Scanner scan = new Scanner(System.in);
		public static void main(String[] args)
		{
		while(true)
		{
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Length");
			System.out.println("4. Swap two nodes(Reference Swapping)");
			System.out.println("5. Exit");
			
			System.out.println("\nEnter your choice:");
			int ch = scan.nextInt();
			
			switch(ch)
			{
			case 1: insert();
			        display();
			        break;
			case 2: display();
	                break;
	        case 3: int length=length();
	                System.out.println("Length: " + length + "\n");
	                break;
	        case 4: System.out.println("Enter i and j:");
	                int i = scan.nextInt();
	                int j = scan.nextInt();
	                swapNodes(i,j);
	                display();
	                 break;
	        case 5: System.exit(1);
	            
	        default: System.out.println("Invalid Choice...\n");
	        }
		}
		
	}
	static void insert()
	{
			int data;
			Node temp;
			
			System.out.println("Enter data:");
			data = scan.nextInt();
			temp = new Node(data, null);
			
			if(root == null)
			{
				root = temp;
			}
			else
			{
				Node p=root;
				while(p.link!=null)
				{
					p=p.link;
				}
				p.link = temp;
			}
		}

	static void display()
	{
		Node temp=root;
		
		if(root == null)
		{
			System.out.println("LinkedList is Empty...\n");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data + "-->");
				temp=temp.link;
			}
			System.out.println("\n");
		}
	}

	static int length()
	{
		Node temp=root;
		int c=0;
		
		if(root == null)
		{
			System.out.println("LinkedList is Empty...");
		}
		else
		{
			while(temp!=null)
			{
				c++;
				temp=temp.link;
			}
		}
		return c;
	}

	static Node swapNodes(int k, int k2)
	{
	    Node temp=root;
	    Node prev1=root;
	    Node temp1=root;
	    Node prev2 = root;
	    int i=k;
	    int j=k2;
	    while(i!=1)
	    {
	    	prev1=temp;
	        temp=temp.link;
	        i--;
	    }
	    while(j!=1)
	    {
	    	prev2=temp;
	       temp1=temp1.link;
	        j--; 
	    }
	    prev1.link=temp1;
	    prev2.link=temp;
	    temp.link=temp1.link;
	    temp1.link=prev2;
	 
	    return root;
	}
	}
