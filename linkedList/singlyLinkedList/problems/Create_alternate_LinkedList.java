package linkedList.singlyLinkedList.problems;

import java.util.Scanner;

public class Create_alternate_LinkedList {
	static Node root=null;
	static Node root2=null;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("\n1. Append");
			System.out.println("2. Create Alternate Linked List");
			System.out.println("3. Traverse 1");
			System.out.println("4. Traverse 2");
			System.out.println("5. Exit");
			
			System.out.println("Enter your choice:");
			int ch = scan.nextInt();
			
			switch(ch)
			{
			case 1: append();
			        traverse(root);
			        break;
			case 2: create();
			        traverse(root2);
			        break;
			case 3: traverse(root);
			        break;
			case 4: traverse(root2);
	                break;
			case 5: System.exit(1);
			default:System.out.println("Invalid choice:");
			}
		}
	}
	
	static void append()
	{
	   System.out.println("Enter data:");
	   int element = scan.nextInt();
	   Node temp = new Node(element,null);
	   if(root==null)
	   {
		   root=temp;
	   }
	   else
	   {
		   Node p=root;
		   while(p.link!=null)
		   {
			  p=p.link; 
		   }
		   p.link=temp;
	   } 
	}

static void create()
{
	Node temp=root;
	while(temp!=null&&temp.link!=null)
	{
		append2(temp.data);
		temp=temp.link.link;
	}
	if(temp!=null)
	{
		append2(temp.data);
	}
}

static void append2(int element)
{
   Node temp = new Node(element,null);
   if(root2==null)
   {
	   root2=temp;
   }
   else
   {
	   Node p=root2;
	   while(p.link!=null)
	   {
		  p=p.link; 
	   }
	   p.link=temp;
   } 
}

static void traverse(Node root)
{
	Node temp = root;
	while(temp!=null)
	{
		System.out.print(temp.data+"-->");	
		temp=temp.link;
	}
}
}