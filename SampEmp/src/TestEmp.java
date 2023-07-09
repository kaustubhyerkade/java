
public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address[] arr= new Address[4];
		
		Address a1=new Address("pune",411043);
		Address a2=new Address("Mumbai",111111);
		Address a3=new Address("nsk",111);	
		Address a4=new Address("nagpur",111111);


		arr[0]=a1;
		arr[1]=a2;
		arr[2]=a3;
		arr[3]=a4;
		Employee e1= new Employee(111,"kaustubh",40000,arr);

		display(e1);


	}

	public static void display(Employee emp)
	{
		System.out.println("---------------Details------------------");
		System.out.println("Employee id: "+emp.getEmpId());
		System.out.println("Employee Name: "+emp.getEmpName());
		System.out.println("Employee salary:"+emp.getEmpSal());
		System.out.println("\n---------------Address------------------");

		Address arr[] = emp.getA1();
		for(Address a1:arr)
		{
            System.out.println("Permanent Address :");
			System.out.println("Employee City:"+a1.getAddrCity());
			System.out.println("Employee city pin:"+a1.getAddrPin());
            
			System.out.println("Local Address : ");
		}
	}

}
