package linkedList.singlyLinkedList.problems;

import java.util.Scanner;
//This program not working properly

public class Insertion_in_sorted_list {
	static Node root=null;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Length");
			
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
            case 4: System.exit(1);
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
			Node p1=root;
			Node p2 =p1.link;
			if(temp.data<p1.data||temp.data==p1.data)
			{
				temp.link=p1;
				root=temp;
			}
			else
			{
			while(temp.data>p1.data&&p2!=null)
			{
				p1=p2;
				p2=p2.link;
			}
			temp.link=p2;
			p1.link=temp;
			}
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
}
