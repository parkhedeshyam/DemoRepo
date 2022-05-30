package Array_int;

public class Max_Word_InArray {

	public static void main(String[] args)
	{
		// Find the max word from given String 
		String z ="java is programming language";
		
		//String a[]= {"Java","ASP","PLSQL","DBMS"};
		String a[]=z.split(" ");
		String t=" ";
		System.out.println("Before Sort ");
		String max= a[0];
		for(String x:a)
		{
			System.out.println(x);
		}
		System.out.println("Before Max word is  "+max);
		for(int i=0;i<=a.length-1;i++)
		{
			//if(a[i].compareTo(max)>0)
			if(a[i].length()>max.length())
			{
				max=a[i];
			}
			System.out.println(a[i].length());
			System.out.println(max.length());
		}
		
		System.out.println("Max word is  "+max);
			
	}
		
}


