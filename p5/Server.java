// Server.java
package p5;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) throws RemoteException, java.rmi.AlreadyBoundException {
        try {
            // Create or obtain the registry
            Registry r1 = LocateRegistry.getRegistry(3000);

            // Bind the object to the registry
            P_Class obj = new P_Class();
            r1.rebind("Palindrome", obj);

            System.out.println("Server started");
        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
