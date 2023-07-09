
public class Account{

	private int Eid;
	private String Ename;
	private float Ebal;
	public Account(int eid, String ename, float ebal) {
		super();
		Eid = eid;
		Ename = ename;
		Ebal = ebal;
	}
	public int getEid() {
		return Eid;
	}
	public String getEname() {
		return Ename;
	}
	public float getEbal() {
		return Ebal;
	}
	@Override
	public String toString() {
		return "Account [Eid=" + Eid + ", Ename=" + Ename + ", Ebal=" + Ebal
				+ "]";
	}
	
	
	
	
	





}
