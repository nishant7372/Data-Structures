package linkedList.singlyLinkedList.problems;

import java.util.Scanner;

public class Remove_consecutive_duplicate_values {
	static Node root=null;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
	while(true)
	{
		System.out.println("1. Insert");
		System.out.println("2. Remove Consecutive duplicate elements");
		System.out.println("3. Display");
		System.out.println("4. Length");
		System.out.println("5. Exit");
		
		System.out.println("\nEnter your choice:");
		int ch = scan.nextInt();
		
		switch(ch)
		{
		case 1: insert();
		        display();
		        break;
		case 2: System.out.println("Max. No. of Consecutive Repititions:");
		        double rep = scan.nextDouble();
			    remove(rep);
                display();
                break; 
		case 3: display();
                break;
        case 4: int length=length();
                System.out.println("Length: " + length + "\n");
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

static void remove(double rep)
{
		if(root == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			int i=0;
			while(i<(int)Math.ceil(Math.log10(rep)/Math.log10(2.0)))
			{
				Node temp1=root;
			    Node temp2=temp1.link;
				while(temp2!=null)
				{
					if(temp2.data==temp1.data)
					{
						temp1.link=temp2.link;
					    temp2=temp1.link;
					}
					if(temp2!=null)
					{
					temp1=temp2;
					temp2=temp2.link;
					}
				}
				i++;
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
