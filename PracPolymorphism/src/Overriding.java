
class Overriding {
	
	void print()
	{
		System.out.println("Over class");
	}

}

class Sub1 extends Overriding{
	
	void print()
	{
		System.out.println("Sub 1 class");
	}
}



class Sub2 extends Overriding{
	
	void print()
	{
		System.out.println("Sub 2 class");
	}
}

class MainOver{
	public static void main(String args[])
	{
	
	  Overriding o ;
	 // o.print();
	  
	  o = new Sub1();
	  o.print();
	   
	  
	  o = new Sub2();
	  o.print();
	   
     
	}
	
}