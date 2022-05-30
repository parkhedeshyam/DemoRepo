package String_Ex;

public class Repeated_Char {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="amol";
		System.out.println("print repeatetive character ");
		String x="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			char c=str.charAt(i);
			x=x+ch+c;
		}
		System.out.println(x);
	}
}
