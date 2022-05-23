package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo 
{

	public static void main(String[] args) 
	{
		
      System.out.print("Example of Collections");
     // ArrayList al=new ArrayList();
      
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(1);list.add(2); list.add(3);list.add(5);list.add(4);  list.add(6);

      System.out.println(list);
      
      System.out.println("Max elements is : "+Collections.max(list)) ;
      System.out.println("Min elements is : "+Collections.min(list)) ;
      Collections.sort(list);
      System.out.println("Max elements sort is : "+list);
      
      Collections.sort(list,Collections.reverseOrder());
      
      
      System.out.println("Max elements sort is : "+list);
     
    
    
      
     
    }
}
	
	


