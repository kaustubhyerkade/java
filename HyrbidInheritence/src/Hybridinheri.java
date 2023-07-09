class Hybridinheri
{
	public void disp()
	{
		System.out.println("C");
	}
}

class A extends Hybridinheri
{
	public void disp()
	{
		System.out.println("A");
	}
}

class B extends Hybridinheri
{
	public void disp()
	{
		System.out.println("B");
	}

}

class D extends A
{
	public void disp()
	{
		System.out.println("D");
	}

}

class Main
{
	public static void main(String args[])
	{

		D obj = new D();
		obj.disp();
	}
}