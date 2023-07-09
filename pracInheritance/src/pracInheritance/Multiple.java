package pracInheritance;

public class Multiple {

	void print1()
	{
		System.out.println("priyanka");
	}


}
class singletwo extends Multiple {

	void print2()
	{
		System.out.println("kaustubh");
	}
}

class singlethree extends singletwo{
	
	void print3()
	{
		System.out.println("pune");
	}
}

class Inheritence
{
	public static void main(String args[])      
	{
		singlethree obj=new singlethree();
		obj.print1();
		obj.print2();
		obj.print3();
	}
}