package Array_int;

public class Max_Elements 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        int a[]= {5,6,7,2,3,1,4,8,44};
        int max=a[0];
        int sconmax=0;
        int t;
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        
        for(int i=0;i<a.length;i++)
        {
        		if(a[i]<max)
        		{
        			max=a[i];
        		}    
        		
        }
        System.out.println(" ");
        System.out.println("max elements is : " +max);
	}

	}


