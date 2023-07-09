
public class VariArgu {

	void getString(String ...unm)   //var args
	{
		for(String s:unm)
		{ 
			System.out.println(s); //print array
		}
		
	}
	void getSum(int ...x)   //getting array values from main
	{  
		 int sum=0;
		System.out.println("Length of Array is:"+x.length);
	    for(int i:x)
	    {
	    	System.out.println(i);
	    	sum=sum+i;
	    }
	    System.out.println("Sum of"+x.length+"numbers is "+sum);
	}
	void getSum2(double d1,int ...x)
	{
		System.out.println("doublee value is"+d1);
		System.out.println("Length of Array is in second function : "+x.length);
	    
	}
	
		
	public static void main(String args[])
	{
	   VariArgu c =new VariArgu();
	   c.getString("kaustubh");
	   c.getString("Kaustubh","Yerkade");
	   c.getString("Kaustubh","Devanand","Yerkade");
	   
	   c.getSum();
	   c.getSum(10,20);
	   c.getSum(10,20,30);
	   c.getSum2(1.0,1);   //counts only array ie 1 and count will be one only 
	   
	}
}