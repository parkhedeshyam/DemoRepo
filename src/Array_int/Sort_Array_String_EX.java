package Array_int;

public class Sort_Array_String_EX 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a[]= {"Java","ASP","SQL"};
		String t=" ";
		System.out.println("Before Sort ");
//		for(int x=0;x<=a.length-1;x++)
//		{
//			System.out.print(a[x]+" ");
//		}
		for(String x:a)
		{
			System.out.println(x);
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
			
		}
		System.out.println(" ");
		System.out.println("After Sort ");
		for(int y=0;y<=a.length-1;y++)
		{
			System.out.print(a[y]+" ");
		}
	}

}
