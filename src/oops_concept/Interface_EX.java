package oops_concept;

interface x
{
	int x=10;
	void display();
	void show();
}

class Interface_EX implements x
{
	public void display()
	{
		System.out.println("Display mthd"+x);
	}

	@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		System.out.println("show  mthd");
		
	}
	public static void main(String[] args)
	{
		
		Interface_EX obj =new Interface_EX();
		 obj.display();
		 obj.show();		
		
		
	}
	
}

