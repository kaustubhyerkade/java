
public class Manager extends Employee{

	private int Bonus;

	public Manager(int empId, String empName, int empSal, int bonus) {
		super(empId, empName, empSal);
		Bonus = bonus;
	}

	public int getBonus() {
		return Bonus;
	}
	
	@Override
	public boolean equals(Object obj){
		Manager m2= (Manager)obj;
		if(this.getEmpId()==m2.getEmpId()){
			return true;
		}
		return false;
	}
	
	
	
}
