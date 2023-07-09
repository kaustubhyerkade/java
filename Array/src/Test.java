import java.util.Scanner;


public class Test {

public static void main(String args[])
{
	int a[],n;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("How many nos u want:");
	n = sc.nextInt();
	
	a= new int[n];
	System.out.println("Enter numbers :");
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	System.out.println("Numbers are :");
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
    System.out.println("Reverse Order is :");
	
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
	
}
}
