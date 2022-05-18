package Array_int;

public class Array_Sort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int a[]= {5,6,7,2,3,1,4};
        int t;
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]>a[j])
        		{
        			t=a[i];
        			a[i]=a[j];
        			a[j]=t;
        			
        		}
        		
        	}       	
        	
        }
        System.out.println(" ");
        System.out.println("Sort elements is");
        for(int k=0;k<a.length;k++)
        {
        	System.out.print(a[k]+" ");
        }
	}

}
