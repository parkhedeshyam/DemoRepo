package General_Program;

public class Maxtrix_Multiplication {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int a[][]={{1,2,3},{1,2,3},{1,2,3}};
	    int b[][]={{1,1,1},{2,2,2},{3,3,3}};
	    // int c[][] = {{1,1,1},{1,1,1},{1,1,1}};
	    //creating another matrix to store the multiplication of two matrices    
	    int c[][]=new int[3][3];  //3 rows and 3 columns  
	    System.out.println("First Maxtrix");
	    for(int i=0;i<3;i++)
	    {
	    	 for(int j=0;j<3;j++)
	    	 {
	    	   System.out.print(a[i][j]+" ");
	    	 }
	    	 System.out.println();
	    }
	    
	    System.out.println("Second Maxtrix");
	    for(int i=0;i<3;i++)
	    {
	    	 for(int j=0;j<3;j++)
	    	 {
	    	   System.out.print(b[i][j]+" ");
	    	 }
	    	 System.out.println();
	    }
	    System.out.println("MUl is  Maxtrix");
	    for(int i=0;i<3;i++)
	    {
	    	 for(int j=0;j<3;j++)
	    	 {
	    	   c[i][j]=c[i][j]+a[i][j]*b[i][j];
	    	 }
	    }
	    for(int i=0;i<3;i++)
	    {
	    	 for(int j=0;j<3;j++)
	    	 {
	    	   System.out.print(c[i][j]+" ");
	    	 }
	    	 System.out.println();
	    }

   }
}
