package String_Ex;

import java.util.Arrays;

public class anagram_String {
	
	
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1="abcd";
		String str2="dcbaa";
		char a[]=str1.toCharArray();
		char b[]=str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean status =true; 
		if(Arrays.equals(a, b))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println(" not anagram");
		}
		

	}

}
