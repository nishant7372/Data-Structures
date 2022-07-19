package linkedList.singlyLinkedList.problems;

import java.util.Scanner;

public class Even_odd_nodes_seperator {

	static Node root=null;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
	while(true)
	{
		System.out.println("1. Insert");
		System.out.println("2. Seperate even and odd nodes");
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
		case 2: function();
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

static void function()
{
	Node odd=null;
	Node even=null;
	Node temp=root;
	int i=1;
	while(temp!=null)
	{
		if(i%2!=0)
		{
			odd = append(odd, temp.data);	
		}
		else
		{
			even = append(even, temp.data);	
		}
		temp=temp.link;
		i++;
	}
	root=odd;
	while(odd.link!=null)
	{
		odd=odd.link;
	}
	odd.link=even;
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

static Node append(Node head, int data)
{
		Node temp;
		
		temp = new Node(data, null);
		
		if(head == null)
		{
			head = temp;
		}
		else
		{
			Node p=head;
			while(p.link!=null)
			{
				p=p.link;
			}
			p.link = temp;
		}
		return head;
}

}