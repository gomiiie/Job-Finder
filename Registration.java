import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements MouseListener, ActionListener{
    
    public JPanel p1,p2;
    public JButton b1,b2,b3;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    public Color c1;
    public ImageIcon img;
    public JLabel imglbl;
    public JTextField nFld,aFld,eFld,addFld,eduFld,expFld, sFld;
    public Font f1;
    public JPasswordField psFld;


    public Registration()
    {
        super("Registration");
        this.setSize(1080,720);
		this.setLocation(120,20);

        c1 = new Color(46, 207, 235);

        f1=new Font("Cambria",Font.PLAIN,24);

        p2 = new JPanel();
        p2.setBounds(800, 0, 600, 720);
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);

        img = new ImageIcon("./Images/Regi.jpg");

        imglbl=new JLabel(img);
		imglbl.setBounds(0,0,540,720);
		p2.add(imglbl);

        l9 =new JLabel("Enter details for Registration");
        l9.setBounds(620, 80, 300, 30);
        l9.setFont(f1);
        p2.add(l9);

        l1 = new JLabel("Full Name:");
        l1.setBounds(560, 150, 120, 30);
        l1.setFont(f1);
        p2.add(l1);

        nFld = new JTextField();
        nFld.setBounds(700,150, 280, 30);
        nFld.setBackground(c1);
        this.add(nFld);

        l2 = new JLabel("Password:");
        l2.setBounds(560, 200, 120, 30);
        l2.setFont(f1);
        p2.add(l2);

        psFld = new JPasswordField();
        psFld.setBounds(700,200, 280, 30);
        psFld.setBackground(c1);
        psFld.setEchoChar('*');
        this.add(psFld);

        l3 = new JLabel("Age:");
        l3.setBounds(560, 250, 120, 30);
        l3.setFont(f1);
        p2.add(l3);

        aFld = new JTextField();
        aFld.setBounds(700,250, 280, 30);
        aFld.setBackground(c1);
        this.add(aFld);

        l4 = new JLabel("Email:");
        l4.setBounds(560, 300, 120, 30);
        l4.setFont(f1);
        p2.add(l4);

        eFld = new JTextField();
        eFld.setBounds(700,300, 280, 30);
        eFld.setBackground(c1);
        this.add(eFld);

        l5 = new JLabel("Address:");
        l5.setBounds(560, 350, 120, 30);
        l5.setFont(f1);
        p2.add(l5);

        addFld = new JTextField();
        addFld.setBounds(700,350, 280, 30);
        addFld.setBackground(c1);
        this.add(addFld);

        l6 = new JLabel("Education:");
        l6.setBounds(560, 400, 120, 30);
        l6.setFont(f1);
        p2.add(l6);

        eduFld = new JTextField();
        eduFld.setBounds(700,400, 280, 30);
        eduFld.setBackground(c1);
        this.add(eduFld);

        l7 = new JLabel("Experience:");
        l7.setBounds(560, 450, 130, 30);
        l7.setFont(f1);
        p2.add(l7);

        l7 = new JLabel("Skills:");
        l7.setBounds(560, 500, 130, 30);
        l7.setFont(f1);
        p2.add(l7);

        expFld = new JTextField();
        expFld.setBounds(700,450, 280, 30);
        expFld.setBackground(c1);
        this.add(expFld);

        sFld = new JTextField();
        sFld.setBounds(700, 500, 280, 30);
        sFld.setBackground(c1);
        this.add(sFld);

        l8 = new JLabel("Already have an account? ");
        l8.setBounds(600, 600, 300, 30);
        l8.setForeground(Color.BLACK);
        l8.setFont(f1);
        p2.add(l8);

        b1 = new JButton("Login");
        b1.setBounds(870,600,120,30);
        b1.setFont(f1);
        b1.setBackground(c1);
        b1.setForeground(Color.BLACK);
        b1.addMouseListener(this);
        b1.addActionListener(this);
        p2.add(b1);

        b3 = new JButton("Submit");
        b3.setBounds(720,550,200,30);
        b3.setFont(f1);
        b3.setBackground(Color.GREEN);
        b3.addActionListener(this);
        p2.add(b3);

        b2 = new JButton("Back");
        b2.setBounds(10,10,70,30);
        b2.setBackground(c1);
        b2.addMouseListener(this);
        b2.addActionListener(this);
        p2.add(b2);

        this.add(p2);
    }

    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource()==b1)
		{
			b1.setBackground(Color.GREEN);
		}

        else if (me.getSource()==b2)
		{
			b2.setBackground(Color.RED);
			b2.setForeground(Color.WHITE);
		}

    }
    public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==b1)
		{
			b1.setBackground(c1);
			b1.setForeground(Color.BLACK);
		}

        if(me.getSource()==b2)
		{
			b2.setBackground(c1);
			b2.setForeground(Color.BLACK);
		}
    }
	public void actionPerformed(ActionEvent ae)
    {
		String name=nFld.getText();
		String pass=psFld.getText();
		String age=aFld.getText();
        String email=eFld.getText();
        String address=addFld.getText();
        String edu=eduFld.getText();
        String exp=expFld.getText();
        String skill=sFld.getText();
		
		if(ae.getSource()==b2)
		{
            this.setVisible(false);
			Login f1=new Login();
			f1.setVisible(true);
		}
		
		else if(ae.getSource()==b3)
		{
            Account a1 = new Account();
			if((name.isEmpty()||pass.isEmpty()||age.isEmpty()||email.isEmpty()||address.isEmpty()||edu.isEmpty()||skill.isEmpty()||exp.isEmpty()))
			{
				JOptionPane.showMessageDialog(this,"Some fields are empty. Please fill all the fields.");
			}
            else if(pass.length()<=8) {
                JOptionPane.showMessageDialog(this, "Password isn't long enough. Please make sure it's 8 characters long");
            }
            else if(!a1.checkEmail(email)) {
                JOptionPane.showMessageDialog(this, "Account already exists with the same email");
            }
			else
			{
				JOptionPane.showMessageDialog(this,"You have successfully registered. Welcome to Chakti Lagbe!");
				
				
				Account acc=new Account(email,pass, name, address, age, edu, exp, skill);
				acc.addAcount();
				
				
				Login f1=new Login();
				f1.setVisible(true);
				this.setVisible(false);
				
				eFld.setText("");
				psFld.setText("");
		
			}
		}
	
        else if(ae.getSource()==b1){
            this.setVisible(false);
            Login l1 = new Login();
            l1.setVisible(true);
        }
    }
}

