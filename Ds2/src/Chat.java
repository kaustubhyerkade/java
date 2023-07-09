import java.rmi.*;
import java.rmi.server.*;
public class Chat extends UnicastRemoteObject implements ChatInterface {

	public String name;
	public ChatInterface client = null;
	
	public Chat(String n) throws RemoteException
	{
		this.name = n;
	}
	@Override
	public String getName() throws RemoteException{
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void send(String msg) throws RemoteException{
		System.out.println(msg);
		
	}

	@Override
	public void setClient(ChatInterface c) {
		client=c;
		
	}

	@Override
	public ChatInterface getClient() {
		// TODO Auto-generated method stub
		return client;
	}

}
