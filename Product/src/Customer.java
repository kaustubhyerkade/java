
public class Customer {
	
	private int custId;
	private String custName;
	Product[] arr;
	private Product[] p1;

	public Customer(int custId, String custName, Product[] p1) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.arr = p1;
	}

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public Product[] getP1() {
		//return p1;
		return arr;
	}
	
	

}
