import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;

public class Application extends JFrame implements MouseListener,ActionListener
{
    JButton b1,b2,b3;
    Color c1;
    Font f1;
    JPanel p1;
    JLabel imglbl,l1,l2,l3,l4,l5;
    ImageIcon img;
    private int accNo;


    public Application(int accNum)
    {
        super("Application");
        this.setSize(1080,720);
        this.setLocation(120,30);
        accNo = accNum;
        c1 =new Color(97,207,240);

        f1=new Font("Cambria",Font.PLAIN,20);

        p1 = new JPanel();
        p1.setBounds(800, 0, 600, 720);
        p1.setLayout(null);
        p1.setBackground(c1);

        img = new ImageIcon("./Images/rsz_hiring.jpg");
        imglbl=new JLabel(img);
		imglbl.setBounds(0,0,540,720);
		p1.add(imglbl);

        l2 =new JLabel("Job Details:");
        l2.setBounds(580, 80, 200, 30);
        l2.setFont(f1);
        p1.add(l2);
        
        l1 = new JLabel("Company: Tesla");
        l1.setBounds(580, 150, 150, 30);
        l1.setFont(f1);
        p1.add(l1);

        l3 = new JLabel("Salary: 80k$/year");
        l3.setBounds(580, 200, 250, 30);
        l3.setFont(f1);
        p1.add(l3);

        l4 = new JLabel("Time: 8 hours/day, 40hrs/ week, 10 days off");
        l4.setBounds(580, 250, 300, 30);
        l4.setFont(f1);
        p1.add(l4);

        l5 = new JLabel("Details: Looking for idligent worker");
        l5.setBounds(580, 300, 300, 30);
        l5.setFont(f1);
        p1.add(l5);

        b2 = new JButton("Back");
        b2.setBounds(10,10,70,30);
        b2.setBackground(c1);
        b2.addMouseListener(this);
        b2.addActionListener(this);
        p1.add(b2);

        b3 = new JButton("Apply");
        b3.setBounds(600,400,150,30);
        b3.setFont(f1);
        b3.setBackground(Color.GREEN);
        b3.addActionListener(this);
        p1.add(b3);


        this.add(p1);
    }
    
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}

    public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			Homepage h1=new Homepage(accNo);
			h1.setVisible(true);
			this.setVisible(false);
		}
        else if (ae.getSource()==b3) {
            JOptionPane.showMessageDialog(this, "You have successfully applied.");
        }
		
		
	
	}


}
