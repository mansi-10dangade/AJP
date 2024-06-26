
package p6;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample  {

public static void main(String[] args) throws UnknownHostException {
InetAddress localhost=InetAddress.getLocalHost();
System.out.println("Localhost" +localhost.getHostAddress());

//InetAddress
InetAddress googleAddress= InetAddress.getByName("www.google.com");
System.out.println("\n Host:" +googleAddress);

//InetAddress object
InetAddress pictAddress= InetAddress.getByName("www.pict.edu");
System.out.println("\n array of addresses: " +InetAddress.getAllByName("www.pict.edu"));

//raw INetAddress
byte[] rawAddress= {10,10,13,18};
InetAddress rawInetAddress = InetAddress.getByAddress(rawAddress);
System.out.println("\n object for raw IP Address: " +rawInetAddress);

//create InetAddress object from a provided host name and IP address
InetAddress CustomInetAddress = InetAddress.getByAddress("PICT", rawAddress);

System.out.println("\n INetAddress based on provided hostname and Ip address:"   +CustomInetAddress);

//get local host name
String localHostName= localhost.getHostName();
System.out.println("\n Hostname: "+localHostName);


//check if two InetAddress objects are equal
boolean isEqual= localhost.equals(googleAddress);
System.out.println("\n Equal or not:" +isEqual);

//check if the InetAddress represent a multicast address
boolean isMulticast = localhost.isMulticastAddress();
System.out.println("\n Is multicast address: " +isMulticast);
}
}
