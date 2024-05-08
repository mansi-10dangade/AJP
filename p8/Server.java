package p8;
import java.rmi.*;
import java.rmi.registry.*;
import java.util.*;
import java.rmi.RemoteException;

public class Server {

	public static void main(String[] args) {
		try {
			
			PrintC obj2 = (PrintC) Naming.lookup("rmi://localhost:1024/PrintService");
			Registry r2 = LocateRegistry.getRegistry("localhost", 1024);
		    r2.rebind("PrintService",obj2);
		    System.out.println("Server is ready to accept requests");
		}
		catch(Exception e)
		{
			System.out.println("Server exception " +e.toString());
			e.printStackTrace();
		}

	}

}
