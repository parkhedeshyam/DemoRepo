package mypakage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Hash_Map_Hash_Table {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer,String> hp =new HashMap<Integer,String>();
		hp.put(1, "Rahul");
		hp.put(2, "Rajesh");
		hp.put(3, "Ram");
		hp.put(4, "Ramesh");
		hp.put(null,null);
		for(Map.Entry m:hp.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
System.out.println("***************Hash Table**************");
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");
    	ht.put(null,null);
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

	}

}
