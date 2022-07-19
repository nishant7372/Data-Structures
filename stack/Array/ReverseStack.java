package stack.Array;

public class ReverseStack {

	static int top=9;
	public static void main(String[] args)
	{
		//Initially ---->  top-->9
		int[] stack = {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Before Reversal:");
		traverse(stack);
		//calling reverse function
		reverse(stack);
		System.out.println("\nAfter Reversal:");
		traverse(stack);
	}
	
	static void reverse(int[] stack)
	{
		if(top==-1)
			return;
		int element = stack[top--];
		reverse(stack);
		insert_at_bottom(element,stack);
		
	}
	
	static void insert_at_bottom(int element,int[] stack)
	{
		if(top==-1)
			stack[++top]=element;
		else
		{
			int i = top++;
			for(i=top;i>0;i--)
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
