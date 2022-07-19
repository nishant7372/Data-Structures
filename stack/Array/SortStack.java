package stack.Array;

public class SortStack {
	static int top=9;
	public static void main(String[] args)
	{
		//Initially ---->  top-->9
		int[] stack = {3,6,5,4,2,7,1,0,9,8};
		System.out.println("Before Sort:");
		traverse(stack);
		//calling sort function(Based on Insertion Sorting ALgorithm)
		sort(stack);
		System.out.println("\nAfter Sort:");
		traverse(stack);
	}
	
	static void sort(int[] stack)
	{
		if(top==-1)
			return;
		int element = stack[top--];
		sort(stack);
		insert_at_bottom(element,stack);	
	}
	
	static void insert_at_bottom(int element,int[] stack)
	{
		if(top==-1)
			stack[++top]=element;
		else
		{
			int i;
			for(i=++top;i>0&&stack[i-1]>element; i--)
			{
				stack[i]=stack[i-1];
			}
			stack[i] = element;
		}
	}
	
	static void traverse(int[] stack)
	{
		for(int i=top;i>=0;i--)
		System.out.println("---"+stack[i]+"---");
	}
}
