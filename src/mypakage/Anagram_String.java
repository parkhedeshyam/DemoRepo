package mypakage;

import java.util.Arrays;

public class Anagram_String {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1="abcd";
		String str2="cdab";
		char a[]=str1.toCharArray();
		char b[]=str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}


	}

}
