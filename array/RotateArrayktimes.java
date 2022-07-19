package array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class RotateArrayktimes {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the size of the Array:");
		int n = scan.nextInt();
		int[] intArray = new int[n];
		create(intArray);
		System.out.println("Enter number of time u want to rotate:");
		int k=scan.nextInt();
		
		while(true) 
		{
			System.out.println("\n1. Method 1");
			System.out.println("2. Method 2");
			System.out.println("3. Method 3");
			System.out.println("4. Method 4");
			System.out.println("5. Exit\n");
			
		System.out.print("Enter your Choice:");
		int ch=scan.nextInt();
	    
		switch(ch)
		{
		case 1: rotate1(intArray, k);
		        System.out.print(Arrays.toString(intArray));
	          	break;
		case 2: rotate2(intArray, k);
		        System.out.print(Arrays.toString(intArray));
            	break;
		case 3: rotate3(intArray, k);
		        System.out.print(Arrays.toString(intArray));
             	break;
		case 4: rotate4(intArray, k);
	        	System.out.print(Arrays.toString(intArray));
      	        break;
		case 10: System.exit(1);
        default:System.out.println("Invalid Choice:");
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
	
	static void rotate1(int[] nums, int k) {
		int element=nums[0];
		        while(k!=0)
		        {
		            element=nums[nums.length-1];
		        for(int i=nums.length-1;i>0;i--)
		        {
		            nums[i]=nums[i-1];
		        }
		            nums[0]=element;
		            k--;
		        }
		}

		static void rotate2(int[] nums, int k) {
		        ArrayList<Integer> a = new ArrayList<Integer>();
		        k=k%nums.length;
		        if(nums.length>1&&k>0)
		        {
		       for(int i=nums.length-k;i<nums.length;i++)
		       {
		           a.add(nums[i]);
		       }
		        for(int i=nums.length-1;i>=k;i--)
		            nums[i]=nums[i-k];
		        for(int i=0;i<a.size();i++)
		            nums[i]=a.get(i);
		        }
		    }

		static void rotate3(int[] nums, int k) {
		        k=k%nums.length;
		        reverse(nums,0,nums.length-1);
		        reverse(nums,0,k-1);
		        reverse(nums,k,nums.length-1);
		    }
		    
		    static void reverse(int[] nums, int i, int j)
		    {
		        if(i>=j)
		        return;
		        int temp=nums[i];
		        nums[i]=nums[j];
		        nums[j]=temp;
		        reverse(nums,++i,--j);
		    }

		    static void rotate4(int[] nums, int k) {
		     k = k % nums.length;
		int[] end = Arrays.copyOfRange(nums, nums.length - k, nums.length);
		System.arraycopy(nums, 0, nums, k, nums.length - k);
		System.arraycopy(end, 0, nums, 0, end.length);
		}

}
