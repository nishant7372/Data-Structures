package stack.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_words_of_a_String {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a String:");
		String s=scan.nextLine();
		s=reverse(s);
		System.out.println("Reversed String: "+s);
	}
	
	static String reverse(String s)
	{
		StringBuffer sb = new StringBuffer();
		ArrayList<String> a = new ArrayList<String>();
		int k=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				if(s.substring(k,i)!="")
					a.add(s.substring(k,i));
				k=i+1;
			}
		}
		if(s.substring(k,s.length())!="")
			a.add(s.substring(k,s.length()));
		
		for(int i=a.size()-1;i>=0;i--)
		{
			sb.append(a.get(i));
			if(i!=0)
			sb.append(" ");
		}
		
		return sb.toString();
	}
}

