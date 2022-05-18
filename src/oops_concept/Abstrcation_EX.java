package oops_concept;

 abstract class Animal 
{    
	int x=10;
    public abstract void makeNoise();
    public void normalMethod()
    {
        //method body
    	System.out.println("Simple mtd");
    }
}

 class Cat extends Animal 
{
	
    @Override
    
    public void makeNoise() 
    {  x=x+10;
       System.out.println("cat ........"+(x+2));
    }
}
 class Dog extends Animal 
{
    @Override
    public void makeNoise() 
    {
    	System.out.println("DOg ........");
    }
}

public class Abstrcation_EX 
{
	public static void main(String[] args) 
    {
        Animal a1 = new Cat();
        a1.makeNoise();
 
        Animal a2 = new Dog();
        a2.makeNoise();
        a2.normalMethod();
    }
	

}
