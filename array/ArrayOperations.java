package array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOperations {
	static ArrayList<Integer> a = new ArrayList<Integer>();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the Array:");
		int n = scan.nextInt();
		int[] intArray = new int[n];
		
		while(true) 
		{
			System.out.println("\n1. Create new Array");
			System.out.println("2. Display");
			System.out.println("3. Delete by Value(If Elements are distinct or else delete first occurence)");
			System.out.println("4. Delete by Index");
			System.out.println("5. Delete all elements of Similar Value");
			System.out.println("6. Search by Value(If Elements are distinct or else search first occurence)");
			System.out.println("7. Search by Index");
			System.out.println("8. Sort the Array");
			System.out.println("9. Length of Array:");
			System.out.println("10. String Representation");
			System.out.println("11. Count Occurences of an element");
			System.out.println("12. Indexes of all Occurences of an element");
			System.out.println("13. Reverse the Array");
			System.out.println("14. Sum of Array elements");
			System.out.println("15. Product of non zero Array elements");
			System.out.println("16. Squaring the Array Elements");
			System.out.println("17. Powering the Array Elements");
			System.out.println("18. Find the non-zero largest and smallest");
			System.out.println("19. Running Sum of Array");
			System.out.println("20. Reverse the Array by Index");
			System.out.println("21. Find the middle element");
			System.out.println("22. Exit\n");
			
		System.out.print("Enter your Choice:");
		int ch=scan.nextInt();
	    
		switch(ch)
		{
		case 1: create(intArray);
		        break;
		case 2: display(intArray);
		        break;
		case 3: System.out.print("Enter the element:");
		        int target = scan.nextInt();
			    delete_by_value(intArray, target);
			    display(intArray);
		        break;
		case 4: System.out.print("Enter the index:");
                int index = scan.nextInt();		
			    delete_by_index(index, intArray);
			    display(intArray);
		        break;
		case 5: System.out.print("Enter the element:");
                int target2 = scan.nextInt();
                int c= count(intArray, target2, 0, 0);
                while(c!=0)
                {
	            delete_by_value(intArray, target2);
	            c--;
                }
	            display(intArray);
                break;
		case 6: System.out.print("Enter the element:");
                int target3 = scan.nextInt();
			    System.out.println("Index:"+search_by_value(intArray, target3));
		        break;
		case 7: System.out.print("Enter the index:");
                int index2 = scan.nextInt();
	            System.out.println("Value:"+search_by_index(intArray, index2));
                break;
		case 8: Arrays.sort(intArray);
		        display(intArray);
                break;
		case 9: System.out.println("Length:"+intArray.length);
		        break;
		case 10: System.out.println(Arrays.toString(intArray));
		        display(intArray);
		        break;
		case 11: System.out.print("Enter the element:");
                 int target4 = scan.nextInt();		
			     System.out.println("Occuences:" + count(intArray, target4, 0, 0));
		         break;
		case 12: System.out.print("Enter the element:");
                 int target5 = scan.nextInt();		
	             System.out.print("Occuences:" + count(intArray, target5, 0, 0) + "\nIndexes:");
	             repeatedValues(intArray, target5, 0);
	             System.out.println(a.toString());	 
	             a.clear();
                 break;         
		case 13: reverse(intArray, 0, intArray.length-1);
		         display(intArray);
		         break;
		case 14: System.out.println("Sum:" + sum(intArray, 0, 0));
                 break;
		case 15: System.out.println("Product:" + product(intArray, 0, 1));
                 break;
		case 16: to_any_power(intArray, 0, 2);
                 display(intArray);
                 break;        
		case 17: System.out.print("Enter the power:");
                 int power = scan.nextInt();
			     to_any_power(intArray, 0, power);
                 display(intArray);
                 break; 
		case 18: largest_and_smallest(intArray, 0 , intArray[0], intArray[0]);
	             System.out.println("Largest:" + a.get(0) + " & Smallest:" + a.get(1));
	             a.clear();
	             break;
		case 19: running_sum_of_array(intArray, intArray[0], 0);
                 System.out.println(a.toString());
                 a.clear();
                 break;
		case 20: System.out.print("Enter the start index:");
		         int start = scan.nextInt();
		         System.out.print("Enter the end index:");
		         int end = scan.nextInt();
			     reverse(intArray, start, end);
                 display(intArray);
                 break;
		case 21: System.out.println("Middle element:" + middle(intArray));
		         break;
	 	case 22: System.exit(1);
        default: System.out.println("Invalid Choice:");
        	     break;
		}
		}
	}
	
	static void create(int[] intArray)
	{
		System.out.println("Enter the Elements:");
		for(int i=0;i<intArray.length;i++)
		{
			intArray[i] = scan.nextInt();
		}
	}
	
	static void display(int[] intArray)
	{
		System.out.println("Array:");
		for(int x: intArray)
		{
			System.out.print(x + " ");
		}
		System.out.print("\n");
	}
	
	static void delete_by_value(int[] intArray, int target)
	{
		for(int i=0;i<intArray.length;i++)
		{
			if(intArray[i]==target)
			delete_by_index(i, intArray);
		}
	}

	static void delete_by_index(int i, int[] intArray)
	{
		for(int j=i;j<intArray.length-1;j++)
		{
			intArray[j]=intArray[j+1];
		}
		intArray[intArray.length-1]=0;
	}
	
	static int search_by_value(int[] intArray, int target)
	{
		int i=0;
		for(int x: intArray)
		{
			if(x==target)
			return i;
			i++;
		}
	    return -1;
	}
	
	static int search_by_index(int[] intArray, int index)
	{
		if(index>intArray.length-1&&index<0)
		{
		System.out.println("Invalid Index");
		return 0;
		}
		else
		return intArray[index];
	}
	
	static int count(int[] intArray, int target, int i, int c)
	{
		if(i==intArray.length)
			return c;
		if(intArray[i]==target)
			c++;
		return count(intArray,target,++i, c);
	}
    
	static void repeatedValues(int[] intArray, int target, int i)
	{
		if(i==intArray.length)
			return;
		if(intArray[i]==target)
			a.add(i);
		repeatedValues(intArray,target,++i);
	}
	
	static void reverse(int[] intArray, int i, int j)
	{
		if(i>=j)
			return;
	    if(i<j)
	    {
	    	int temp = intArray[i];
	        intArray[i]= intArray[j];
	        intArray[j] = temp;
	    }
	    reverse(intArray, ++i, --j);
	}
	
	static int sum(int[] intArray, int i, int sum)
	{
		if(i==intArray.length)
			return sum;
		sum = sum + intArray[i];
		return sum(intArray, ++i, sum);
	}
	static int product(int[] intArray, int i, int product)
	{
		if(i==intArray.length)
			return product;
		if(intArray[i]!=0)
		product = product * intArray[i];
		return product(intArray, ++i, product);
    }
	static void to_any_power(int[] intArray, int i, int power)
	{
		if(i==intArray.length)
			return;
		intArray[i] = (int)Math.pow(intArray[i], power);
		to_any_power(intArray, ++i, power);
    }
	
	static void largest_and_smallest(int[] intArray, int i, int largest, int smallest)
	{
		if(i==intArray.length)
		{
			a.add(largest);
			a.add(smallest);
			return;
		}
		if(intArray[i]>largest && intArray[i]!=0)
			largest=intArray[i];
		if(intArray[i]<smallest && intArray[i]!=0)
			smallest=intArray[i];
		largest_and_smallest(intArray, ++i ,largest, smallest);
	}
	
	static void running_sum_of_array(int[] intArray, int runningSum, int i)
	{
		a.add(runningSum);
		if(i==intArray.length-1)
			return;
		running_sum_of_array(intArray, runningSum+intArray[i+1], ++i);	
	}
	
	static int middle(int[] intArray)
	{
		int totalsum=0;
		int leftsum=0;
		
		for(int x: intArray)
			totalsum+=x;
		
		for(int x: intArray)
		{
			if(leftsum==totalsum-leftsum-x)
				return x;
			leftsum+=x;
		}
		return -1;
	}
}	
