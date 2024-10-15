import javax.swing.*;    
import java.awt.event.*;    
import java.awt.*;
class ImgTrafficsignal extends JFrame implements ActionListener
{    
 JRadioButton rb1,rb2,rb3;    
 JButton b;   
 JLabel l,l1,l2,l3; 
 ImageIcon off,red,yl,gr;
ImgTrafficsignal()
{      
 off=new ImageIcon("OFF.png");
 red=new ImageIcon("RED.png");
 yl=new ImageIcon("YELLOW.png");
 gr=new ImageIcon("GREEN.png");
 rb1=new JRadioButton("Red");    
 rb1.setBounds(50,50,100,30);      

rb2=new JRadioButton("Yellow");    
rb2.setBounds(50,100,100,30);    

rb3=new JRadioButton("Green");    
rb3.setBounds(50,150,100,30);  

ButtonGroup bg=new ButtonGroup();    
bg.add(rb1);bg.add(rb2);  bg.add(rb3);  

b=new JButton("Submit");    
b.setBounds(100,250,80,30);   
l=new JLabel(off); 
l1=new JLabel(red);
l2=new JLabel(yl);
l3=new JLabel(gr);
l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);   
l.setBounds(200,0,100,300);
l1.setBounds(200,0,100,300);
l2.setBounds(200,0,100,300);
l3.setBounds(200,0,100,300);
b.addActionListener(this);    
add(rb1);
add(rb2);
add(rb3);
add(b);  
add(l);  
add(l1);
add(l2);
add(l3);
setSize(700,700);    
setLayout(null);    
setVisible(true);    
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}    
public void actionPerformed(ActionEvent e)
{    
if(rb1.isSelected())
{    
  rb1.setForeground(Color.RED);  
   rb2.setForeground(Color.BLACK);
   rb3.setForeground(Color.BLACK);
    l.setVisible(false);
    l1.setVisible(true);
}    
if(rb2.isSelected())
{    
 rb2.setForeground(Color.YELLOW);
 rb3.setForeground(Color.BLACK);
rb1.setForeground(Color.BLACK);

   l2.setVisible(true);
   l1.setVisible(false);
 
}  
if(rb3.isSelected())
{    
rb3.setForeground(Color.GREEN);
rb2.setForeground(Color.BLACK);
rb1.setForeground(Color.BLACK);
l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(true);   
}    
}
public static void main(String arg[])
{
   new ImgTrafficsignal();   
}   
}

