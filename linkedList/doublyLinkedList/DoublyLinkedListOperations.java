package linkedList.doublyLinkedList;

import java.util.Scanner;

public class DoublyLinkedListOperations {
	static Node root = null;
	static Scanner scan = new Scanner(System.in);
public static void main(String[] args)
{
	while(true)
	{
		System.out.println("\nCreation:\n");
		
		System.out.println("1. Append");
		System.out.println("2. Add at Beginning");
		System.out.println("3. Add at Particular Position");
		System.out.println("4. Add after Particular Position");
		
		System.out.println("\nDeletion:\n");
		
		System.out.println("5. Deletion from Beginning");
		System.out.println("6. Deletion by Particular Value");
		System.out.println("7. Deletion by Particular Location");
		System.out.println("8. Delete the whole Linked List");
		
		System.out.println("\nTraversal:\n");
		System.out.println("9. Forward Display");
		System.out.println("10. Backward Display");
		System.out.println("11. Length");
		
		System.out.println("\nUtilities:\n");
		System.out.println("12. Reverse the Linked List");
		System.out.println("13. Exit");
		
		System.out.print("\nEnter your choice:");
		int ch=scan.nextInt();
		
		switch(ch)
		{
		case 1: append();
		        display();
		        break;
		case 2: add_at_beginning();
			    display();
                break; 
		case 3: System.out.print("Enter location:");
		        int loc1 = scan.nextInt();
			    add_at_particular_position(loc1);
	            display();
                break; 
		case 4: System.out.print("Enter location:");
                int loc2 = scan.nextInt();
	            add_after_particular_position(loc2);
                display();
                break; 
		case 5: deletion_from_beginning();
			    display();
                break;
		case 6: deletion_by_particular_value();
	            display();
                break;
		case 7: System.out.print("Enter location:");
                int loc3 = scan.nextInt();
			    deletion_by_particular_location(loc3);
                display();
                break;
		case 8: delete_all();
                break;
		case 9: display();
                break;
		case 10: reverse_display();
                break;
		case 11: int length = length();
		         System.out.println("Length: " + length);
                 break;
		case 12: reverse();
	             display();
                 break;
		case 13: System.exit(1);
                 break;
        default: System.out.println("Invalid Choice...\n");
		        
		}
	}
}

static void append()
{
	int data;
	Node temp;
	
	System.out.print("Enter data:");
	data = scan.nextInt();
	
	temp = new Node(data, null, null);
	
	if(root == null)
	{
		root=temp;
	}
	
	else
	{
		Node p = root;
		while(p.right!=null)
		{
			p=p.right;
		}
		p.right = temp;
		temp.left = p; 
	}
}

static void add_at_beginning()
{
	int data;
	Node temp;
	
	System.out.print("Enter data:");
	data = scan.nextInt();
	
	temp = new Node(data, null, null);
	
	if(root == null)
	{
		root=temp;
	}
	
	else
	{
		temp.right=root;
		root.left=temp;
		root=temp;
	}
}

static void add_at_particular_position(int loc)
{
	int data;
	Node temp;
	int length = length();
	
	if(loc>length+1)
	{
		System.out.println("First Insert data at " + (length+1) + "th location...");
	}
	else if(loc<=0)
	{
		System.out.println("Location not available...");
	}
	else if(loc==1)
	{
		add_at_beginning();
	}
	else if(loc==length+1)
	{
		append();
	}
	else
	{
		System.out.print("Enter data:");
		data = scan.nextInt();
		temp = new Node(data, null, null);
		
		int c=2;
		Node p1 = root;
		Node p2 = p1.right;
		while(c<loc)
		{
		p1=p2;
		p2=p2.right;
		c++;
		}
		temp.right = p2;
		p2.left = temp;
		p1.right = temp;
		temp.left = p1;
	}
}

static void add_after_particular_position(int loc)
{
	int data;
	Node temp;
	int length = length();
	
	if(loc>length)
	{
		System.out.println("First Insert data after " + length + "th location...");
	}
	else if(loc<0)
	{
		System.out.println("Location not available...");
	}
	else if(loc==0)
	{
		add_at_beginning();
	}
	else if(loc==length)
	{
		append();
	}
	else
	{
		System.out.print("Enter data:");
		data = scan.nextInt();
		temp = new Node(data, null, null);
		
		int c=1;
		Node p1 = root;
		Node p2 = p1.right;
		while(c<loc)
		{
		p1=p2;
		p2=p2.right;
		c++;
		}
		temp.right = p2;
		p2.left = temp;
		p1.right = temp;
		temp.left = p1;
	}
}

static void deletion_from_beginning()
{
	Node temp=root;
	
	if(root==null)
	{
		System.out.println("List is Empty....Would u like to insert a element, reply with 'yes' or 'no'");
		String s=scan.next();
		if(s.equals("yes"))
		{
			append();
		}
	}
	
	else
	{
		root=temp.right;
		if(temp.right!=null)
		{
		temp.right.left=null;
		temp.right=null;
		}
	}
}

static void deletion_by_particular_value()
{
	
	if(root==null)
	{
		System.out.println("List is Empty....Would u like to insert a element, reply with 'yes' or 'no'");
		String s=scan.next();
		if(s.equals("yes"))
		{
			append();
		}
	}
	
	else
	{
		Node temp1 = root;
		Node temp2 = temp1.right;
		System.out.print("Enter data:");
		int element = scan.nextInt();
		boolean b = ispresent(element);
		if(b==true)
		{
			if(temp1.data==element)
			{
				root=temp1.right;
				if(temp1.right!=null)
				{
					temp1.right.left=null;
					temp1.right=null;
				}
				
			}
			else
			{
				while(temp2.data!=element)
				{
					temp1 = temp2;
					temp2 = temp2.right;
				}
				temp1.right = temp2.right;
				temp2.left = null;
				if(temp2.right!=null)
				{
					temp2.right.left = temp1;
					temp2.right = null;
				}
			}
		}
		else 
		{
			System.out.println("Element not found");
		}
	}
}

static void deletion_by_particular_location(int loc)
{
	if(root==null)
	{
		System.out.println("List is Empty....Would u like to insert a element, reply with 'yes' or 'no'");
		String s=scan.next();
		if(s.equals("yes"))
		{
			append();
		}
	}
	
	else
	{
		int length = length();
		if(loc<=0||loc>length)
		{
            System.out.println("Location not Found");
		}
		else if(loc==1)
        {
        	deletion_from_beginning();
        }
		else
		{
			Node temp1 = root;
			Node temp2 = temp1.right;
			int c=2;
			while(c<loc)
			{
				temp1=temp2;
				temp2=temp2.right;
				c++;
			}
			temp1.right = temp2.right;
			temp2.left = null;
			if(temp2.right!=null)
			{
			temp2.right.left = temp1;
			temp2.right = null;
			}
		}
	}
}

static void delete_all()
{
	root=null;
    System.out.print("Linked List Deleted...");
    System.out.print("Would u like to create a new one, reply with 'yes' or 'no'");
	String s=scan.next();
	if(s.equals("yes"))
	{
		append();
	}
}

static void display()
{
	Node temp=root;
	
	if(root ==null)
	{
		System.out.println("Linked List is Empty...");
	}
	else
	{
		while(temp!=null)
		{
			System.out.print(temp.data + "-->");
			temp=temp.right;
		}
		System.out.print("\n");
	}
}

static void reverse_display()
{
    Node temp=root;
	
	if(root == null)
	{
		System.out.println("Linked List is Empty...");
	}
	else
	{
		while(temp.right!=null)
		{
			temp=temp.right;
		}
		while(temp.left!=null)
		{
			System.out.print(temp.data + "<--");
			temp=temp.left;
		}
		System.out.print(temp.data + "<--");
		System.out.print("\n");
	}
}

static int length()
{
	Node temp=root;
	int count=0;
	
	if(root ==null)
	{
		System.out.println("Linked List is Empty...");
	}
	else
	{
		while(temp!=null)
		{
			temp=temp.right;
			count++;
		}
	}
	return count;
}

static boolean ispresent(int element)
{
	Node temp=root;
	
	while(temp!=null)
	{
		if(element==temp.data)
		return true;
		temp=temp.right;
	}
	return false;
}

static void reverse() 
{
       int l=length();
       Node temp=root;
       Node temp1=root;
       int i=0;
       int j=l-1;
       while(i<j)
       {
           int k=0;
           while(k<j)
           {
           	temp1=temp1.right;
               k++;
           }
           int a = temp.data;
           temp.data=temp1.data;
           temp1.data=a;
           i++;
           j--;
           temp=temp.right;
           temp1=root;
       }
   }
}
