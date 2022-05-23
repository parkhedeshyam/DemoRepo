package String_Ex;

public class String_Reverse_Word 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="Java is object oriented programming language";
		String a[]=str.split(" ");
		System.out.println("Length is : "+a.length);
		String str1=" ";
		for(int i=a.length-1;i>=0;i--)
		{
			//System.out.println(a[i]);
			str1=str1+a[i]+" ";
		}
		System.out.println("The reverser String is ::"+str1);
	}

}
