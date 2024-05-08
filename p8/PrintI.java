package p8;
import java.rmi.*;


public interface PrintI  extends Remote{

	String stringOpeations(String input)throws RemoteException;
}
