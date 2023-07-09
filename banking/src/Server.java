
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import java.text.*;
public class Server extends BankImplementation
{
		public Server() {}
		public static void main(String args[])
		{
				BankImplementation bank;
				BankInterface stub;
				
				try
				{
						// Instantiating the implementation class
						bank = new BankImplementation();
						// Exporting the object of implementation class
						// (here we are exporting the remote object to the stub)
						stub = (BankInterface) UnicastRemoteObject.exportObject(bank, 0);
						// Binding the remote object (stub) in the registry
						 LocateRegistry.createRegistry(1913); 
							Naming.rebind("rmi://localhost:1913/BankInterface", stub); 
						System.err.println("Server ready");
				}
				catch (Exception e)
				{
						System.err.println("Server exception: " + e.toString());
						e.printStackTrace();
				}
		}
}
