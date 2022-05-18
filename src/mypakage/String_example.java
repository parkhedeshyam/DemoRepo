package mypakage;

public class String_example {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		StringBuilder str = new StringBuilder("Rahul");
//		System.out.println(str);
//		str.append("Parkhede");
//		System.out.println(str);
//      System.out.println(str.reverse());
		
		StringBuilder s=new StringBuilder("Rahul");
		StringBuilder s1=new StringBuilder("Rahul");
		if(s.equals(s1))
			System.out.println("Equal");
		else
			System.out.println("not Equal");
		
		System.out.println("Original String  is :"+s);
		s.append("Patil");
		System.out.println("After use Append command : "+s);
		s.reverse();
		System.out.println("reverse String :"+s);
		
		
	}

}
