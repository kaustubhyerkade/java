package pracInheritance;

public class Single {

	void print1()
	{
		System.out.println("priyanka");
	}
	
	
}
   class singletwo extends Single {
	
	   void print2()
	   {
		   System.out.println("kaustubh");
	   }
}

class Inheritence{
	public static void main(String args[])      
	{
		singletwo obj=new singletwo();
		obj.print1();
		obj.print2();
	}
}