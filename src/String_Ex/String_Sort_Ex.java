package String_Ex;

import java.util.Arrays;

public class String_Sort_Ex 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int temp, size;
		String str = "rahul";
		char charArray[] = str.toCharArray();
		size = charArray.length;
		for(int i = 0; i < size; i++ )
		{
			for(int j = i+1; j < size; j++)
			{
				//if(charArray[i]>charArray[j])
				if(charArray[i]>(charArray[j]))
				{
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = (char) temp;

				}


			}
		}
		System.out.println("Third largest element is: "+Arrays.toString(charArray));
	}
}