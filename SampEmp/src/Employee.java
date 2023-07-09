
public class Employee {
	
	private int empId;
	private String empName;
	private double EmpSal;
	Address[] arr;
	private Address[] a1;

	public Employee(int empId, String empName, double empSal, Address[] a1) {
		super();
		this.empId = empId;
		this.empName = empName;
		EmpSal = empSal;
		this.arr = a1;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSal() {
		return EmpSal;
	}

	public Address[] getA1() {
		//return a1;
		return arr;
		
	}
	
	

}
