//Polymorphism with overloading and overriding
class AdditionFun
{
	static void sum(int a, int b) //poly 2
	{
		int ans=a+b;
		System.out.println("Addition is : "+ans+"congratulations");
	}
	static void sum(int a,int b,int c) //poly 1
	{

		int ans=a+b+c;
		System.out.println(""+ans);
	}

	static void sum(String a ,String b) //operator overload
	{
		String s= a+b;
		System.out.println("concatinated String : "+s);
	}


	public static void main(String args[])
	{


		int a=10,b=20,c=30;


		sum(a,b);
		sum(a,b,c);
		sum("kaustubh","yerkade");
}
}