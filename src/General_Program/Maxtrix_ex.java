package General_Program;

public class Maxtrix_ex {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int a[]={1,2,3};
	    int b[]={4,5,6};
	    // int c[][] = {{1,1,1},{1,1,1},{1,1,1}};
	    //creating another matrix to store the multiplication of two matrices    
	    int c[]=new int[3];  //3 rows and 3 columns  
	    System.out.println("First Maxtrix");
	   for(int i:a)
	   {
		   System.out.print(i+" ");
	   }
	    System.out.println(" ");
	    System.out.println("Second Maxtrix");
	    for(int i:b)
		   {
			   System.out.print(i+" ");
		   }
		    System.out.println();
	    System.out.println("MUl is  Maxtrix");
	 
	    	 for(int j=0;j<3;j++)
	    	 {
	    	   c[j]=c[j]+a[j]*b[j];
	    	  // System.out.print(c[j]+a[j]*b[j]+" ");
	    		 System.out.print(c[j]+" ");
	    	 }
	    
	   

   }
}
