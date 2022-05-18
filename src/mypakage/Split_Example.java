package mypakage;

public class Split_Example {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str = "I am Rahul";
		
        String[] str1 = str.split(" ");
        String revw=" ";
        int cnt=0;
        
        for(int i=str1.length-1;i>=0;i--)
        {
        	//System.out.println(str1[i]);
        	revw=revw+str1[i]+" ";
        	cnt=cnt+1;
        }
        System.out.println(revw);
        System.out.println("Number of word is "+cnt);
      }

}
