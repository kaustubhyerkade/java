
public class TestShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1=new Product(100,"apple",30);
		Product p2=new Product(101,"Orange",25);
		Product[] arr = new Product[2];
		
		arr[0]=p1;
		arr[1]=p2;
        Customer c1=new Customer(111,"kos",arr);
        display(c1);
        
        
	}
	
	public static void display(Customer cust)
	{
		System.out.println("\n............Customer Details.............");
	    System.out.println("Customer id:"+cust.getCustId());
	    System.out.println("Customer Name :"+cust.getCustName());
	    System.out.println("\n............Product Details.............");
	    int i=0;
	    //for(int p1:cust.getP1()
	   
	    Product arr[]=cust.getP1();
	    for(Product p1:arr)
	    {
	    System.out.println("Product "+(i+1)+" Details");	
	    System.out.println("Product id:"+p1.getProdId());
	    System.out.println("Product Name:"+p1.getProdName());
	    System.out.println("Product price:"+p1.getProdPrice());
	    System.out.println("_________________________________");
	    i++;
	    }
	    
	}
		

}

