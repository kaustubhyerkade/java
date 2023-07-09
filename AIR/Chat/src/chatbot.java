import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.*;

public class chatbot{
	
	Map<String,String>nouns=new HashMap<String, String>();
	Map<String,String>welcome=new HashMap<String, String>();
	Map<String,String>farewell=new HashMap<String, String>();
	
	
	public chatbot()
	{
        welcome.put("hi","HII, how can i help you?");
        welcome.put("hey","heyy how can i help you?");
        welcome.put("hoo","hoo how i help you?");
        
        
        farewell.put("bye", "bye");
        farewell.put("go", "go");
        farewell.put("exit","exit");
	}
	
	
	public static void main(String[] args)
	{
      Scanner s = new Scanner(System.in);
      chatbot c =new chatbot();
      
      while(true)
      {
    	  String input=s.nextLine();
    	  String output=c.giveAns(input);
    
    	  System.out.println(output);
    	  if(output=="exit")
    	  {
    		  System.exit(0);
    	  
    	  }
		
      }
	}
	
	
	public String giveAns(String input)
	{
		String tokens[] = input.split("\\s");
		
		for(int i=0;i<tokens.length;i++)
		{
			if(welcome.containsKey(tokens[i].toLowerCase()))
			{
				return welcome.get(tokens[i]);
			}
			else if(farewell.containsKey(tokens[i].toLowerCase()))
			{
                return farewell.get(tokens[i]);
                
                
			}	
			else if(nouns.containsKey(tokens[i].toLowerCase()))
			{
             return nouns.get(tokens[i]);
            		 
			}
		}
		return ("Sorry i didnt get this");
		//return input;
        
	}
	
	
}	