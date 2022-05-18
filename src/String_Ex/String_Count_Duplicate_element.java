package String_Ex;

public class String_Count_Duplicate_element {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a[]= {"JAVA","C#","Python","C++","JAVA","JAVA","C++"} ;
		int cnt=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==(a[j]))&&(i!=j))
				{
					cnt=cnt+1;
				  System.out.println(a[i]+" count :"+cnt);
				}
			}
		}

	}

}


