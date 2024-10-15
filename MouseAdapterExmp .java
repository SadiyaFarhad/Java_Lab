import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseAdapterExmp extends MouseAdapter implements MouseListener
  {
	JFrame f;
	JLabel msg;
	MouseAdapterExmp()
                    {
		Font myFont = new Font("Verdana",Font.BOLD, 30);
		f = new JFrame("Mouse Tracking");
		msg = new JLabel("Mouse Events");
		
		f.addMouseListener(this);
		
		msg.setFont(myFont);
		msg.setBounds(200,200,300,40);
 		f.setLayout(null);
		f.add(msg);
		
		f.setSize(500, 500);
		f.setVisible(true);
	 }
	
	
             public void mouseClicked(MouseEvent me) 
                    {
		msg.setText("Mouse Clicked");		
	          }
	
	public void mouseEntered(MouseEvent me) 
                    {
		msg.setText("Mouse Entered");
 	         f.getContentPane().setBackground(Color.pink);
	          }
	
	public void mouseExited(MouseEvent me) 
                    {
		msg.setText("Mouse Exited");
		f.getContentPane().setBackground(Color.white);
	          }
         // Even if any Method or Methodss  are not overridden compile      
         // time errors are not generated
	/*public void mousePressed(MouseEvent me) 
                    {
		msg.setText("Mouse Pressed");
	}
	
	public void mouseReleased(MouseEvent me)
                   {
		msg.setText("Mouse Released");
		f.getContentPane().setBackground(Color.blue);
	}*/

	public static void main(String[] args)
	 {
		new MouseAdapterExmp();
	}

}
