//P_class.java
package p5;
import java.rmi.*;
import java.util.*;
import java.rmi.server.*;
public  class P_Class extends UnicastRemoteObject implements P_Interface {
          public P_Class() throws RemoteException
          {
        	  super();
          }

		@Override
		public boolean palindrome_check(String str) throws RemoteException {
			Scanner sc = new Scanner(System.in);
			System.out.println("choose the type of input");
			System.out.println("1.Integer");
			System.out.println("2.String");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				try 
				{
					int n=Integer.parseInt(str);
					return isPalindrome(n);
				}
				catch(NumberFormatException e)
				{
					System.out.println("Invalid Integer Format");
					return false;
				}
			case 2:
				return isPalindrome(str);
				
			default: 
				System.out.println("Invalid choice ");
						return false;
			}
			
		}

		private boolean isPalindrome(String str) {
			return checkPalindrome(str);
		}

		private boolean isPalindrome(int n) {
			String Number = String.valueOf(n);
			return checkPalindrome(Number);
		}

		private boolean checkPalindrome(String number) {
			int length = number.length();
			for(int i=0;i<length/2;i++)
			{
				if(number.charAt(i) != number.charAt(length-i-1))
				{
					return false;
				}
			}
			return true;
		}

		
}
