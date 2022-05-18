package Array_int;

import java.util.ArrayList;

public class Duplicate_elements_Array_int {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        int a[]= {5,6,5,7,2,3,2,1,4,4};
        int t;
        int cnt=0;
        ArrayList al=new ArrayList();
        System.out.println("All elements in Array is :");
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]==a[j])
        		{
        			al.add(a[i]);
        			//cnt=cnt+1;
        			//System.out.println("Duplicate element is  : "+a[i]+cnt);
        		}
        		
        	}       	
        	
        }
        System.out.print("Duplicate element is :");
        for(int k=0;k<al.size();k++)
        {
        	System.out.print(al.get(k)+" ");
        }
        
	}
}

	


