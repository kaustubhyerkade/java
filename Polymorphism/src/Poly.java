public class Poly {


	
	public int sum(int x,int y)
	{
         return (x+y);
	}
	
	public int sum(int x,int y,int z)
	{
		return (x+y+z);
	}
	
	public double sum(double x,double y)
	{
		return (x+y);
	}
	
	public static void main(String args[])
	{
		Poly p =new Poly();
		
		
		
		System.out.println(p.sum(10.30, 22.44));
		System.out.println(p.sum(33, 5, 66));
		System.out.println(p.sum(10,20));
		
	}
}
