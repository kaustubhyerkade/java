import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;

public class ChatClient {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine().trim();
		
		try {
			ChatInterface client = new Chat(name);
			ChatInterface server = (ChatInterface)Naming.lookup("rmi://localhost/shadab"); 
			String msg = "["+client.getName()+"] got connected";
			server.send(msg);
			System.out.println("[System] Chat Remote Object is ready");
			server.setClient(client);
			while(true)
			{
				 msg = sc.nextLine().trim();
				 msg = "["+client.getName()+"]"+msg;
				server.send(msg);
				
						
			}
		} catch (RemoteException | MalformedURLException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

