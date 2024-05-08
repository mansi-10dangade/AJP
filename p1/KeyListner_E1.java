package p1;
import java.awt.*; 
import java.awt.event.*;


public class KeyListner_E1 extends	WindowAdapter implements KeyListener {
	Label l; TextArea a; Frame f;
	KeyListner_E1()
	{
	f= new Frame(); f.setVisible(true);; f.setSize(500,500); f.setLayout(null); f.setTitle("KeyListener Example"); f.setBackground(Color.green);
	f.setFont(new Font("Arial", Font.BOLD,20)); init();
	add_component();
	 

	}
	public void init()
	{
	l= new Label();
	a= new TextArea();
	}
	public void add_component()
	{
	l.setBounds(200, 50, 150, 30); f.add(l);
	a.setBounds(150, 100, 200, 100); f.add(a); f.addWindowListener(this); a.addKeyListener(this);
	}
	public void windowClosing(WindowEvent e)
	{
	f.dispose();
	}
	public void keyPressed(KeyEvent e)
	{
	l.setText("KeyPressed");
	}
	public void keyReleased(KeyEvent e)
	{
	l.setText("KeyReleased");
	}
	public void keyTyped(KeyEvent e)
	{
	l.setText("KeyTyped");
	}

	public static  void main(String[] args) {
		new KeyListner_E1();

	}

}

