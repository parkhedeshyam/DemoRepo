package Array_int;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sort_String 
{

	public static void main(String[] args) 
	{
		
      System.out.println("Example of Collections");
     ArrayList <String>al=new ArrayList();
     al.add("C");
     al.add("Java");
     al.add("Php");
     al.add("SQL");
     al.add("ASP");
     System.out.println("Before Sort Elemets is : "+al);
     //System.out.println("After Sort Elemets is : "Collections.sort(al,Collections.reverseOrder()));
     System.out.print("After Sort in ascending   Elemets is :");
     Collections.sort(al);
     System.out.println(al);
     System.out.print("After Sort in descending    Elemets is :");
     Collections.sort(al,Collections.reverseOrder());
     System.out.println(al);
System.out.println("Display using Foreach Loop");
     for(String x:al)
     {
    	 System.out.print(x+" ");
     }
     System.out.println();
     System.out.println("Display using For Loop");
     for(int x=0;x<al.size();x++)
     {
    	 System.out.print(al.get(x)+" ");
     }
	
	}

}
