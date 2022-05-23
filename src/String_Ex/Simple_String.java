package String_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class Simple_String {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string value: ");
	      String str = sc.nextLine();
	      char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(Arrays.toString(charArray));
	 String x=     new String(charArray);
	      //System.out.println(new String(charArray));
	 System.out.println(x);
	}

}
