package array;

import java.util.Scanner;

public class ReverseArray_Recursion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		arr[i] = scan.nextInt();
		
		reverse(arr,0,n-1);
		display(arr);
		scan.close();
	}
	
	static void reverse(int arr[], int i, int j)
	{
		if(i>=j)
			return;
		if(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		reverse(arr,++i,--j);
	}
	
    static void display(int[] arr)
    {
    	for(int x: arr)
    	System.out.print(x+" ");
    }

}