// p_Interface.java
package p5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface P_Interface extends Remote {
    boolean palindrome_check(String str) throws RemoteException;
}
