package p8;
import java.util.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class PrintC  extends UnicastRemoteObject implements PrintI{
     protected PrintC() throws RemoteException
     {
    	 super();
    	 
     }

	@Override
	public String stringOpeations(String input) throws RemoteException {
		String result = "Original string " + input + "\n";
		result += "1. To Uppercase: " + input.toUpperCase() +"\n";
		result += "2. To Lowercase: " + input.toLowerCase() +"\n";
		result += "3. length: " + input.length() +"\n";
		result += "4. Reversed: " +new StringBuilder(input).reverse().toString() +"\n";
		result += "5. concatenated: " + input.concat("College") +"\n";
	    return result;
	}
}
