import java.util.Scanner;


public class test {
	static int MAX =1000;
	static int MIN =-1000; 
	

	static int minmax(int depth,int nodeIndex, boolean maximizingPlayer,int values[],int alpha,int beta,int h)
	{
		if(depth==h)
		{
			return values[nodeIndex];
		}
		if(maximizingPlayer)
		{
		int best = MIN;	
		
			for(int i=0;i<2;i++)
			{
              int val = minmax(depth+1,nodeIndex*2+ i, false,values, alpha, beta,h);
              
              best =Math.max(best,val);
              alpha=Math.max(alpha, best);
              if(beta<=alpha)
              break;
              
		    }
			return best;
		}
		else
		{
		int best=MAX;
		for(int i=0;i<2;i++)
		{

			int val = minmax(depth+1,nodeIndex * 2+i,true,values,alpha,beta,h);
		    best =Math.min(best, val);
		    beta=Math.min(beta, best);
		    
		    if(beta<=alpha)
		    	break;
		}
		return best;
		}
		
		
}
	
static int log2(int n)
{
	
 return (n==1)?0:1+log2(n/2);
}

public static void main(String args[])
{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Size");
	int n = sc.nextInt();
	int values[]=new int[n];
	int h=log2(n);
	for(int i=0;i<n;i++)
	{
		
	values[i] = sc.nextInt();
	}
	
	System.out.println("Optimal value is : "+ minmax(0,0,true,values,MIN,MAX,h));
	}
	
	
}


