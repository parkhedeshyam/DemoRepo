package String_Ex;

import java.util.Arrays;

public class anagram_String 
{
	
	
	static void isAnagram(String s1,String s2)
	{
		// TODO Auto-generated method stub
				String str1=s1; 
				String str2=s2; 
				
				//String str1=s1.replaceAll("\\s", ""); 
				//String str2=s2.replaceAll("\\s", ""); 
				
				char a[]=str1.toLowerCase().toCharArray();
				char b[]=str2.toLowerCase().toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);
				//boolean status =true; 
				if(Arrays.equals(a, b))
				{
					System.out.println("anagram");
				}
				else
				{
					System.out.println(" not anagram");
				}
				
	}
	

	public static void main(String[] args) 
	{
		isAnagram("Pat","tap");  
		
		isAnagram("Pat", "Tap");  
        isAnagram("Mother In Law", "Hitler Woman");
        isAnagram("Ready","Steady");
        
       	
        

	}

}
