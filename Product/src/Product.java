
public class Product {

	private int prodId;
	private String prodName;
	private double prodPrice;
	
	public Product(int prodId, String prodName, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	public int getProdId() {
		return prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public double getProdPrice() {
		return prodPrice;
	}
	
	
}
