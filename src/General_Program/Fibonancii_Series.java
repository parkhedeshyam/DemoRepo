package General_Program;

import java.util.Scanner;

public class Fibonancii_Series {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the term ");
		int t=s.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=t;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}

}
