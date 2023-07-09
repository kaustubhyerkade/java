import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;

@SuppressWarnings("unused")
public class ChatServer {
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine().trim();
		
		try {
			Chat server = new Chat(name);
			Naming.rebind("rmi://localhost/shadab",server);
			System.out.println("[System] Chat Remote Object is ready");
			
			while(true)
			{
				String msg = sc.nextLine().trim();
				if(server.getClient()!=null)
				{
					ChatInterface client = server.getClient();
					msg = "["+server.getName()+"]"+msg;
					client.send(msg);
				}
						
			}
		} catch (RemoteException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
