package mypakage;

import java.util.ArrayList;

public class Array_Array_List {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(4);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		al.remove(2);
		System.out.println("After Renoval of Elements");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
