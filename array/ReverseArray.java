package array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no. of elements:");
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		arr[i] = scan.nextInt();
		
		reverse(arr);
		
		System.out.println("Reversed Array:");
		display(arr);
		
		scan.close();
	}
	
	static void reverse(int arr[])
	{
		int i = 0;
		int j= arr.length-1;
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	static void display(int arr[])
	{
		for(int x: arr)
			System.out.print(x + " ");
	}
}