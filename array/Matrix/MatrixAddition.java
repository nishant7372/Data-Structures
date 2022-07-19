package array.Matrix;

import java.util.Scanner;

public class MatrixAddition{

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter the no. of rows");
		int m = scan.nextInt();
		
		System.out.println("Enter the no. of columns");
		int n = scan.nextInt();
		
		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		int[][] c = new int[m][n];
		
		System.out.println("Enter elements in matrix 1:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter elements in matrix 2:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				b[i][j] = scan.nextInt();
			}
		}
		
		addition(a,b,c,m,n); 
		multiplication();
		
		System.out.println("Addition:");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println("\n");
		}
	}
	
	static void addition(int[][] a,int[][] b,int[][] c,int m,int n)
	{
	   for(int i=0;i<m;i++)
	   {
		   for(int j=0;j<n;j++)
		   {
			   c[i][j] = a[i][j]+b[i][j];
		   }
	   }
	}
	
	static void multiplication()
	{
		
	}

}
