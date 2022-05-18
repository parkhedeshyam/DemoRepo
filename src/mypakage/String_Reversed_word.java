package mypakage;

public class String_Reversed_word {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str="I am RAHul";
		String s[]=str.split(" ");
		//String s[]="I am RAHul".split(" ");
		String rev=" ";
		for(int i=s.length-1;i>=0;i--)
		{
			
			System.out.println(s[i]);
			rev=rev+" "+s[i];
			System.out.println(rev);
		}
		System.out.println(rev);
	}

}
