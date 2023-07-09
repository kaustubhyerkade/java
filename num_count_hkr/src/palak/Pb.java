package palak;

public class Pb {
	public static void main(String args[])
	{
		int t,o,g,d;
		int per = 0;
		
		for(t=0;t<10;t++)
		{

			for(o=0;o<10;o++)
			{
		          	for(g=0;g<10;g++)
		          	{
		          		for(d=0;d<10;d++)
		          		{
		          			if(!(t==o || g==o)&& !(t==o||t==g||t==d||o==g || o==g || o==d)&&1000*g-400*t+66*o+d==0)
		          			{
		          				System.out.println("t="+t+" o="+o+" g="+g+" d="+d);
		          				per++; 
		          	
		          			}
		          		}
		          	}
			}
		}
	  	System.out.println("per"+per);
	}

}
