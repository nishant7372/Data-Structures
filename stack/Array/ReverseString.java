package stack.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class ReverseString {
    static char[] stack;
	static int top;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a String:");
		String s=scan.nextLine();
		
		stack=new char[s.length()];
		top=-1;
		s=reverse_StringBuffer(s);
		System.out.println("Reversed String: "+s);
		s=reverse_StringBuffer_collections(s);
		System.out.println("Reversed String: "+s);
		s=reverse_StringBuilder(s);
		System.out.println("Reversed String: "+s);
		s=reverse_StringBuilder_collections(s);
		System.out.println("Reversed String: "+s);
		s=reverse_String(s);
		System.out.println("Reversed String: "+s);
		s=reverse_ArrayList(s);
		System.out.println("Reversed String: "+s);
	}
	
	static String reverse_StringBuffer(String s)
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			stack[++top]=s.charAt(i);
		}
		for(int i=top;i>=0;i--)
		{
			sb.append(stack[top--]);
		}
		return sb.toString();
	}
	
	static String reverse_StringBuffer_collections(String s)
	{
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
	
	static String reverse_StringBuilder_collections(String s)
	{
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	
	static String reverse_StringBuilder(String s)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			stack[++top]=s.charAt(i);
		}
		for(int i=top;i>=0;i--)
		{
			sb.append(stack[top--]);
		}
		return sb.toString();
	}
	
	static String reverse_String(String s)
	{
		String t="";
		for(int i=0;i<s.length();i++)
		{
			stack[++top]=s.charAt(i);
		}
		for(int i=top;i>=0;i--)
		{
			t=t+stack[top--];
		}
		return t;
	}
	
	static String reverse_ArrayList(String s)
	{
		ArrayList<Character> a = new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			stack[++top]=s.charAt(i);
		}
		for(int i=top;i>=0;i--)
		{
			a.add(stack[top--]);
		}
		return a.toString();
	}
}
