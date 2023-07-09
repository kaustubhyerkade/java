import java.rmi.*; 
public class ClientRequest 
{ 
	public static void main(String args[]) 
	{ 
		String answer,value="Reflection in Java"; 
		try
		{ 
			Search access = (Search)Naming.lookup("rmi://localhost:1900"+ "/shadab"); 
			answer = access.query(value); 
			System.out.println("Article on " + value + " " + answer+" at Wiki"); 
		} 
		catch(Exception ae) 
		{ 
			System.out.println(ae); 
		} 
	} 
} 
