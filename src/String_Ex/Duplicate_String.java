package String_Ex;

import java.util.ArrayList;

public class Duplicate_String {

	public static void main(String[] args) 
	{
		// Duplicate word in Array and Count it
	// String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		 
		String[] my_array = {"java", "cpp", "java", "cpp", "ruby", "c","c"};
	
		 
		 int cnt=0;
		 
	        for (int i = 0; i < my_array.length; i++)
	        {
	        cnt=1;
	            for (int j = i+1; j < my_array.length; j++)
	            {
	                if( (my_array[i].equals(my_array[j])) )
	                {
	                	//al.add(my_array[i]);
	                	cnt=cnt+1;
	                    System.out.println("Duplicate Element is : "+my_array[j]+cnt);
	                }
	            }
	        }
	      

	}

}
