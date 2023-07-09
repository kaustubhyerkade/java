
public class Devloper extends Employee {
	
	
	private int ofhr;

	public Devloper(int empId, String empName, int empSal, int ofhr) {
		super(empId, empName, empSal);
		this.ofhr = ofhr;
	}

	public int getOfhr() {
		return ofhr;
	}
	
	@Override
	public String toString(){
		return "Devloper Id : "+getEmpId()+"Devloper Name: "+ getEmpName();
				
	}
	
	
	

}
