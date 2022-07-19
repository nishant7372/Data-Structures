package linkedList.singlyLinkedList.allBasicOperations;

import java.util.Scanner;

public class SinglyLinkedListOperations {
	static Node root = null;
	static Node root2 = null;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("\nCreation:\n");
			
			System.out.println("1. Append/Add at Last");
			System.out.println("2. Add at Beginning");
			System.out.println("3. Add at Particular Location");
			System.out.println("4. Add after a Particular Location");
			
			System.out.println("\nDeletion:\n");
			System.out.println("5. Delete from Beginning");
			System.out.println("6. Delete Particular element By Value");
			System.out.println("7. Delete All Elements of Particular Value");
			System.out.println("8. Delete Particular element By Location");
			System.out.println("9. Remove Consecutive duplicate elements");
			System.out.println("10. Delete Linked List");
			
			System.out.println("\nTraversal:\n");
			System.out.println("11. Forward Display");
			System.out.println("12. Backward Display");
			System.out.println("13. Length");
			
			System.out.println("\nUtilties:\n");
			System.out.println("14. Reverse the Linked List");
			System.out.println("15. Middle of the Linked List");
			System.out.println("16. Swap two Adjacent Nodes");
			System.out.println("17. Swap kth nodes from Beginning and End");
			System.out.println("18. Swap Two Paticular nodes");
			System.out.println("19. Is Palindrome?");
			System.out.println("20. Addition of All Elements");
			System.out.println("21. Product of All Elements");
			System.out.println("22. Product of Non-zero Elements");
			System.out.println("23. Check Number of Occurences of an element");
			System.out.println("24. Exit");
			
			
			System.out.print("\nEnter your choice:");
			int ch = scan.nextInt();
			
			switch(ch)
			{
			case 1: append();
			        display();
			        break;
			case 2: addatbeginning();
			        display();
	                break;
			case 3: System.out.print("Enter the location:");
			        int loc = scan.nextInt();
				    addatparticularlocation(loc);
				    display();
                    break;
			case 4: System.out.print("Enter the location:");
	                int loc2 = scan.nextInt();
		            addafterparticularlocation(loc2);
		            display();
                    break;
			case 5: deletefrombeginning();
                    display();
                    break;  
			case 6: delete_particular_element_by_value();
                    display();
                    break;
			case 7: delete_all_elements_of_particular_value();
                    display();
                    break;
			case 8: delete_particular_element_by_loc();
                    display();
                    break;
			case 9: System.out.println("Max. No. of Consecutive Repititions:");
	                double rep = scan.nextDouble();
		            remove_consecutive_elements(rep);
                    display();
                    break; 
			case 10: delete_all();
                     display();
                     break;
			case 11: display();
			         break;
			case 12: Node temp = root;
				     backward_display(temp);
	                 break;
			case 13: int length=length();
			         System.out.println("Length: " + length + "\n");
	                 break;
			case 14: reverse();
			         display();
                     break;
			case 15: middle();
	                 break;
			case 16: System.out.print("Enter position of kth node to swap kth and (k+1)th node:");
	                 int k= scan.nextInt();
		             swap_adjacent_Nodes(k);
		             display();
		             break;
			case 17: System.out.print("Enter node to swap:");
			         int k3= scan.nextInt();
				     swapNodes(k3);
				     display();
				     break;
			case 18: System.out.print("Enter location of 1st node:");
			         int k1= scan.nextInt();
			         System.out.print("Enter location of 2nd node:");
			         int k2= scan.nextInt();
				     swap_two_Nodes_by_position(k1,k2);
				     display();
				     break;
			case 19: System.out.println("Result:"+isPalindrome());
		             break;
			case 20: int sum=add();
			        System.out.println("Sum:" + sum);
			         break;
			case 21: int mul=multiply();
	                 System.out.println("Product:" + mul);
	                 break;
			case 22: int mul2=non_zero_multiply();
                     System.out.println("Product:" + mul2);
                     break;
			case 23: System.out.print("Enter the element:");
				     int element = scan.nextInt();
                     System.out.println("Occurences:" + count(0, element));
                     break;
			case 24: System.exit(1);
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
	
	static void addatbeginning()
	{
		int data;
		Node temp;
		
		System.out.print("Enter data:");
		data = scan.nextInt();
		temp = new Node(data, null);
		
		if(root == null)
		{
			root = temp;
		}
		else
		{
			temp.link=root;
			root=temp;
		}
	}
	
	static void addatparticularlocation(int loc)
	{
		int data;
		Node temp;
        int length = length();
        if(loc<=0)
        {
        	System.out.println("Location not Found");
        }
        else if(loc>length+1)
		{
			System.out.println("First Insert the element at " + (length+1) + "th location");
		}
		else if(loc==1)
		{
			addatbeginning();
		}
		else if(loc==length+1)
		{
			append();
		}
		else 
		{
			System.out.print("Enter data:");
			data = scan.nextInt();
			temp = new Node(data, null);
			
	        Node p1 = root;
	        Node p2 = root.link;
	        int c=2;
	        while(c<loc)
	        {
	        	p1=p2;
	        	p2=p2.link;
	        	c++;
	        }
	        temp.link=p2;
	        p1.link=temp;
		}
	}
	
	static void addafterparticularlocation(int loc)
	{
		int data;
		Node temp;
        int length = length();
        if(loc<0)
        {
        	System.out.println("Location not Found");
        }
        else if(loc>length)
		{
			System.out.println("First Insert the element after " + length + "th location");
		}
		else if(loc==0)
		{
			addatbeginning();
		}
		else if(loc==length)
		{
			append();
		}
		else 
		{
			System.out.print("Enter data:");
			data = scan.nextInt();
			temp = new Node(data, null);
			
	        Node p1 = root;
	        Node p2 = root.link;
	        int c=1;
	        while(c<loc)
	        {
	        	p1=p2;
	        	p2=p2.link;
	        	c++;
	        }
	        temp.link=p2;
	        p1.link=temp;
		}
	}
	
	static void deletefrombeginning()
	{
		if(root==null)
		{
			System.out.print("List is Empty....Would u like to insert a element, reply with 'yes' or 'no'");
			String s=scan.next();
			if(s.equals("yes"))
			{
				append();
			}
		}
		else
		{
			Node temp=root;

			root=temp.link;
			temp.link=null;
		}
	}
	
	static void delete_particular_element_by_value()
	{
		if(root==null)
		{
			System.out.print("List is Empty....Would u like to insert a element, reply with 'yes' or 'no'");
			String s=scan.next();
			if(s.equals("yes"))
			{
				append();
			}
		}
		else
		{
			Node temp1=root;
			Node temp2=temp1.link;
            System.out.print("Enter the element:");
            int element=scan.nextInt();
            boolean b = ispresent(element);
            if(b==true)
            {
            	if(element==temp1.data)
            	{
            		root=temp2;
            		temp1.link=null;
            	}
            	else
            	{
            		 while(element!=temp2.data)
                     {
                     	temp1=temp2;
                     	temp2=temp2.link;
                     }
         			temp1.link=temp2.link;
         			temp2.link=null;
                     }
            	}
           
            else
            {
            	System.out.println("Element not found");
            }
		}
	}
	
	static void delete_all_elements_of_particular_value()
	{
		if(root==null)
		{
			System.out.print("List is Empty....Would u like to insert a element, reply with 'yes' or 'no'");
			String s=scan.next();
			if(s.equals("yes"))
			{
				append();
			}
		}
		else
		{
            System.out.print("Enter the element:");
            int element=scan.nextInt();
            int c= count(0, element);
            if(c==0)
            {
            	System.out.println("Element not found");
            }
            else
            {
            	while(c!=0)
            	{
            		Node temp1=root;
        			Node temp2=temp1.link;
                  	if(element==temp1.data)
                  	{
                  		root=temp2;
                  		temp1.link=null;
                  	}
                  	else
                  	{
                  		 while(element!=temp2.data)
                          {
                           	temp1=temp2;
                           	temp2=temp2.link;
                          }
               			temp1.link=temp2.link;
               			temp2.link=null;
                     }
                  	c--; 
            	}
             }
		 }     	
	}
	
	static void delete_particular_element_by_loc()
	{
		if(root==null)
		{
			System.out.print("List is Empty....Would u like to insert a element, reply with 'yes' or 'no'");
			String s=scan.next();
			if(s.equals("yes"))
			{
				append();
			}
		}
		else
		{
			Node temp1=root;
			Node temp2=temp1.link;
			int length=length();
            System.out.print("Enter the Location:");
            int loc = scan.nextInt();
            if(loc<=0||loc>length)
            	System.out.println("Location not Found");
            else if(loc==1)
            {
            	deletefrombeginning();
            }
            else
            {
            	int c=2;
            	while(c<loc)
                {
                	temp1=temp2;
                	temp2=temp2.link;
                	c++;
                }
    			temp1.link=temp2.link;
    			temp2.link=null;
            }
        }
	}
	
	static void remove_consecutive_elements(double rep)
	{
			if(root == null)
			{
				System.out.println("Linked List is Empty...");
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
	
	static void backward_display(Node temp)
	{
		
		if(root == null)
		{
			System.out.println("LinkedList is Empty...\n");
		}
		if(temp==null)
		{
			return;
		}
		backward_display(temp.link);
		System.out.print(temp.data + "<--");
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
	
	 static boolean isPalindrome() {
         int l=length();
	        Node temp=root;
	        Node temp1=root;
	        int i=0;
	        int j=l-1;
         int count=0;
	        while(i<j)
	        {
	            int k=0;
	            while(k<j)
	            {
	            	temp1=temp1.link;
	                k++;
	            }
	            if(temp.data==temp1.data)
             count++;
	            i++;
	            j--;
	            temp=temp.link;
	            temp1=root;
	        }
     if(count==l/2)
     return true;
     else
     return false;
	 }
	 
	static void middle()
	{
		Node temp=root;
		
		if(root == null)
		{
			System.out.println("LinkedList is Empty...\n");
		}
		else
		{
			int l=length();
			if(l%2==0)
			{
				l=(l/2)+1;
			}
			else if(l%2!=0)
			{
				l=(int)Math.ceil((double)l/2);
			}
			while(l!=1)
			{
				temp=temp.link;
				l--;
			}
			System.out.println("Middle element:" + temp.data);
		}
	}
	
	static void swap_adjacent_Nodes(int k) 
	 {
		int l=length();
		if(k<=0||k>l-1)
        {
        	System.out.println("Nodes not Found");
        }
        else
        {
	        Node temp=root;
	        Node temp1=root;
	        int i=k;
	        int j=k+1;
	        while(i!=1)
	        {
	            temp=temp.link;
	            i--;
	        }
	        while(j!=1)
	        {
	           temp1=temp1.link;
	            j--; 
	        }
	        int a = temp.data;
	        temp.data=temp1.data;
	        temp1.data=a;
        }
	    }
	
	 static void swapNodes(int k) 
	 {
	        int l=length();
	        if(k<=0||k>l)
	        {
	        	System.out.println("Nodes not Found");
	        }
	        else
	        {
	        	Node temp=root;
		        Node temp1=root;
		        int i=k;
		        int j=l-k+1;
		        while(i!=1)
		        {
		            temp=temp.link;
		            i--;
		        }
		        while(j!=1)
		        {
		           temp1=temp1.link;
		            j--; 
		        }
		        int a = temp.data;
		        temp.data=temp1.data;
		        temp1.data=a;
	        }
	    }
	 
	 static void swap_two_Nodes_by_position(int k1,int k2) 
	 {
		int l=length();
		if(k1<=0||k1>l)
        {
        	System.out.println("Invalid Location for First Node...");
        }
		if(k2<=0||k2>l)
        {
        	System.out.println("Invalid Location for Second Node...");
        }
        else
        {
	        Node temp=root;
	        Node temp1=root;
	        int i=k1;
	        int j=k2;
	        while(i!=1)
	        {
	            temp=temp.link;
	            i--;
	        }
	        while(j!=1)
	        {
	           temp1=temp1.link;
	            j--; 
	        }
	        int a = temp.data;
	        temp.data=temp1.data;
	        temp1.data=a;
        }
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
	            	temp1=temp1.link;
	                k++;
	            }
	            int a = temp.data;
	            temp.data=temp1.data;
	            temp1.data=a;
	            i++;
	            j--;
	            temp=temp.link;
	            temp1=root;
	        }
	    }
	
	static boolean ispresent(int element)
	{
		Node temp=root;
		while(temp!=null)
		{
		    if(temp.data==element)
		    	return true;
		    temp=temp.link;
		}
		return false;
	}
	
	static int count(int c, int element)
	{
	        Node temp=root;
			while(temp!=null)
			{
			    if(temp.data==element)
			    	c++;
			    temp=temp.link;
			}
			return c;
	}
	
	static int add()
	{
		Node temp=root;
		int sum = 0;
		while(temp!=null)
		{
			sum=sum+temp.data;
			temp=temp.link;	
		}
		return sum;
	}
	
	static int multiply()
	{
		Node temp=root;
		int mul = 1;
		while(temp!=null)
		{
			mul=mul*temp.data;
			temp=temp.link;	
		}
		return mul;
	}
	
	static int non_zero_multiply()
	{
		Node temp=root;
		int mul = 1;
		while(temp!=null)
		{
			if(temp.data!=0)
			mul=mul*temp.data;
			temp=temp.link;	
		}
		return mul;
	}
}
