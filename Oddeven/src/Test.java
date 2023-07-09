import java.util.Scanner;


public class Test {
	public static void main(String args[])
	{
		int n, a[];
		int odd=0,Even=0;
        Scanner sc =new Scanner(System.in);
        
        
		System.out.println("Enter count of no:");
		n=sc.nextInt();
		
		a=new int[n];
        
		System.out.println("Enter no:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int earr[] =new int[a.length];
		int oarr[] =new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{	
				Even++;
				earr[i]= a[i];
			}
			else
			{
				odd++;
				oarr[i]=a[i];	
			}	
		}
		
		
		
		
		
		
		System.out.println("Odd numbers  :"+odd);
		System.out.println("Even numbers :"+Even);
		
		System.out.println("Even numbers are:");
		for(int i=0;i<earr.length;i++)
		{
			System.out.print("\t"+earr[i]);
		}
		System.out.println("\n\n..............................");
		System.out.println("Even numbers are:");
		for(int i=0;i<earr.length;i++)
		{
			System.out.print("\t"+oarr[i]);
			
		}
	}
	

}
