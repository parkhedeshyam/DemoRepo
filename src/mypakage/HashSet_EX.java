package mypakage;

import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSet_EX {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Java");
		hs.add("is");
		hs.add("Object");
		hs.add("Oriented");
		hs.add("Programming");
		hs.add("Language");
		System.out.println(hs);
		System.out.println("Second Example for ArrayList");
		// Creating an Array of string type
		
        ArrayList<String> al = new ArrayList<>();
  
        // Adding elements to ArrayList
        // Custom inputs
        al.add("Geeks");
        al.add("Geeks");
  
        // Here we are mentioning the index
        // at which it is to be added
        al.add(1, "For");
        al.add(2, "THis");
        // Printing all the elements in an ArrayList
        System.out.println(al);
        
      //Creating HashSet and adding elements  
        System.out.println("Set Example ");
        HashSet<String> set=new HashSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Ravi");  
        set.add("Ajay");  
        //Traversing elements  
        java.util.Iterator<String> itr=set.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
	}

	}
}
