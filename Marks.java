package e3;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class Display_marks extends WindowAdapter implements ActionListener 
{ 
	JFrame f; 
	JLabel l1,l2,l3,l4,l5,l6,l7,l8; 
	JTextField tf1,tf2,tf3,tf4,tf5, tf6,tf7; 
	JButton b1, b2; 
	Display_marks() 
	{ 
	     f=new JFrame(); 
		f.setVisible(true); 
		f.setSize(500,500); 
		f.setLayout(null); 
		f.setTitle("Student report card"); 
		init(); 
		addComponent(); 
		b1.addActionListener(this); 
		b2.addActionListener(this); 
	}
   void init() 
		{ 
		   l1=new JLabel("Ajp"); 
		   l1.setBounds(40, 250, 70, 20); 
		  l2=new JLabel("CN"); 
		  l2.setBounds(130, 250, 70, 20); 
		  l3=new JLabel("PDC"); 
		  l3.setBounds(220, 250, 70, 20); 
		  l4=new JLabel("MP"); 
		  l4.setBounds(310, 250, 70, 20); 
		  l5=new JLabel("Enter your name"); 
		  l5.setBounds(60, 30, 160, 20); 
		  l6=new  JLabel("Enter your branch"); 
		  l6.setBounds(60, 80, 160, 20); 
		  l7=new  JLabel("Enter your RollNo"); 
		  l7.setBounds(60, 130, 160, 20); 
		  tf1=new JTextField(); 
		  tf1.setBounds(40, 270, 70, 20); 
		  tf2=new JTextField(); 
		  tf2.setBounds(130, 270, 70, 20); 
		  tf3=new JTextField(); 
		  tf3.setBounds(220, 270, 70, 20); 
		  tf4=new JTextField(); 
		  tf4.setBounds(310, 270, 70, 20); 
		  tf5=new JTextField(); 
		  tf5.setBounds(60, 150, 150, 20); 
		  tf6=new JTextField(); 
		  tf6.setBounds(60, 100, 150, 20); 
		  tf7=new JTextField(); 
		  tf7.setBounds(60, 50, 150, 20); 
		  l8=new JLabel("Enter marks of following subjects"); 
		  l8.setBounds(40,200,200,50); 
		  b1=new JButton("Result"); 
		  b1.setBounds(130,300,70,30); 
		  b2=new JButton("Cancel"); 
		  b2.setBounds(220,300,90,30);  
		 } 
	void addComponent() 
	   {
		  f.add(l1); 
		  f.add(tf1); 
		  f.add(tf2); 
		  f.add(tf3); 
		  f.add(tf4); 
		  f.add(tf5); 
		  f.add(tf6); 
		  f.add(tf7); 
		  f.add(l2); 
		  f.add(l3); 
		  f.add(l4); 
		  f.add(l5); 
		  f.add(l6); 
		  f.add(l7); 
		  f.add(l8); 
		  f.add(b1); 
		  f.add(b2); 
	 } 
	  public void actionPerformed(ActionEvent e) 
		 { 
		  boolean check=true,flag=true; 
		   Object ob=e.getSource(); 
		   if(ob==b1) 
		  { 
			   String s1=tf7.getText(); 
			   for(int i=0; i<s1.length();  i++) 
		       { 
			    char c=s1.charAt(i); 
			  if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) 
			    { 
			     check=true; 
			    } 
		      else { 
			    check=false; 
			    break; 
		    } 
		   } 
		   if(!check) 
		   { 
		     flag=false; 
		     JOptionPane.showMessageDialog(f, "Invalid Entry","Wrong", 0); 
		   } 
		   if(s1.length()==0) 
		   { 
		     String m="Name is empty"; 
		     flag=false; 
		     JOptionPane.showMessageDialog(f, m,"Error", 0); 
		   } 
		   
		   String s2=tf6.getText(); 
		   for(int i=0; i<s2.length();  i++) 
		   { 
		    char c=s2.charAt(i); 
		     
		    if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) 
		    { 
		     check=true; 
		    } 
		    else { 
		    check=false; 
		    break; 
		    } 
		   } 
		   if(!check) 
		   { 
		     flag=false; 
		     JOptionPane.showMessageDialog(f, "Invalid Entry","Wrong", 0); 
		   } 
		   if(s2.length()==0) 
		   { 
		     String m="Branch is empty"; 
		     flag=false; 
		     JOptionPane.showMessageDialog(f, m,"Error", 0); 
		   } 
		   String s3=tf5.getText(); 
		   if(s3.isEmpty()) 
		   { 
		     String m="RollNo is empty"; 
		     flag=false; 
		     JOptionPane.showMessageDialog(f, m,"Error", 0); 
		   } 
		   try { 
			   int ROll_no=Integer.parseInt(s3); 
		   } 
		      catch(NumberFormatException obj) 
		   { 
		      String m="Invalid Entry of Roll No"; 
		      flag=false; 
		      JOptionPane.showMessageDialog(f, m,"Error", 0); 
		   } 
			   String s4=tf1.getText(); 
			   String s5=tf2.getText(); 
			   String s6=tf3.getText(); 
			   String s7=tf4.getText(); 
			   if(s4.length()>2||s5.length()>2||s6.length()>2||s7.length()>2) 
		   { 
			    String m="Please Enter Marks in two digits only"; 
			    flag=false; 
			    JOptionPane.showMessageDialog(f, m,"Error", 0); 
		   } 
		   String message=""; 
		   try { 
			   int n1=Integer.parseInt(s4); 
			   int n2=Integer.parseInt(s5); 
			   int n3=Integer.parseInt(s6); 
			   int n4=Integer.parseInt(s7); 
			   int sum=n1+n2+n3+n4; 
			   double avg=sum/4; 
			   message="Name of Student: "+s1+"\n"+"Branch: "+s2+"\n"+"Roll No: "+s3+"\n"+"Total: "+sum+"\n"+"Average: "+avg+"\n"; 
		   } 
		 
		   catch(NumberFormatException objj){ 
		      String m="Invalid Entry of Marks"; 
		       flag=false; 
		       JOptionPane.showMessageDialog(f, m,"Error", 0); 
		   } 
		  if(flag) 
		   { 
		     f.setVisible(false); 
		     JOptionPane.showMessageDialog(f, message,"RESULT", 1 ); 
		   } 
		  } 
		 else if(ob==b2) 
		  { 
		     f.setVisible(false); 
		  } 
		 } 
		} 


public class Marks {

	public static void main(String[] args) 
	{
		new Display_marks();

	}

}
