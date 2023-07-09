
public class TestClass {
	

	public  static void main(String[] args)
	{
		System.out.println(Str+"Salary"+e.getEmpSal());
		
		System.out.println("____________________________
	  Employee e= new Employee(111,"kaustubh",40000);
	  Manager m=new Manager(101,"kos",11111,1111);
	  Display(m,"Manager");
	  
	  Devloper d =new Devloper(122,"xyz",1111,22);
	  Display(d,"Devloper");	 
	}
	
	
	public static void Display(Employee e, String Str)
	{
		//System.out.println(e);
		System.out.println(Str+"Id"+e.getEmpId());
		System.out.println(Str+"Name"+e.getEmpName());____");
		
		if(e instanceof Manager)
		{
			Manager m=(Manager)e; // e is converted to manager
			System.out.println("Manger Bonus:"+m.getBonus());
		}
		
		if(e instanceof Devloper)
		{
			Devloper d=(Devloper)e;
			System.out.println("No of Hrs"+d.getOfhr());
		}
	
	}

}
