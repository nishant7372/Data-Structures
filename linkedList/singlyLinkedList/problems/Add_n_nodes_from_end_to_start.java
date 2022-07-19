package linkedList.singlyLinkedList.problems;

import java.util.Scanner;

public class Add_n_nodes_from_end_to_start {

	static Node root=null;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
	while(true)
	{
		System.out.println("1. Insert");
		System.out.println("2. Add n nodes from end to start");
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
		case 2: System.out.println("Enter n:");
		        int n = scan.nextInt();
			    function(n);
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

static void function(int n)
{
	Node temp=root;
	Node temp1=root;
	int l = length();
	int m=l-n;
	if(m>0&&m<=l)
	{
	while(m!=1)
	{
		temp=temp.link;
		m--;
	}
	while(temp1.link!=null)
	{
		temp1=temp1.link;
	}
	temp1.link=root;
	root=temp.link;
	temp.link=null;
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
