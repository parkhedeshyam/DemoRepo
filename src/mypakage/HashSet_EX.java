package mypakage;

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
		hs.add("Language");

		// Traversing elements
       // Iterator <String> itr = hs.iterator();
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
	}

}
