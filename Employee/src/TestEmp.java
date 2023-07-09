
public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employe e1=new Employe(111,"kos",40000);
		
		Address a1=new Address("Trimurti","pune",411043,e1);
		
		display(e1);
		

	}
	
	public static void display(Employe emp)
	{
		System.out.println("Employee id"+emp.getEmpId());
		System.out.println("Employee Name"+emp.getEmpName());
		System.out.println("Employee salary"+emp.getEmpSal());
		System.out.println("---------------------------------");
		//System.out.println("Employee Adress"+emp.getE1.getAddrStreet);
		
	}
	

}
