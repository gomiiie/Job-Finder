import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Editprofile extends JFrame implements  ActionListener

{
	public JPanel panel;
	public Color mycolor,mycolor1,mycolor2;
	public JLabel L1,L2,L3,L4,L5,L6;
	public JTextField u1,u2,u3,u4 ,u5, u6;
	public Font myfont;
	public JButton backbtn,updatebtn;
	private int accNo;
	
	
	public Editprofile(int accNum)
	{
		
		super("Show view profile");
		this.setSize(800,720);
		this.setLocation(100,50);
		accNo = accNum;
		panel=new JPanel();
		panel.setBounds(0,0,800,720);
		panel.setLayout(null);
		
		mycolor=new Color(255,255,255);
		mycolor1=new Color(0,0,0);
		myfont=new Font("Cambria",Font.PLAIN,20);
		
		panel.setBackground(mycolor);
		
		L1=new JLabel("Username:");
		
		L1.setBounds(250,150,120,30);
		L1.setOpaque(true);
		L1.setFont(myfont);
		L1.setForeground(Color.BLACK);
		panel.add(L1);
		
		u1=new JTextField();
		u1.setBounds(380,150,120,30);
		panel.add(u1);
		
		L2=new JLabel("Age:");
		L2.setBounds(250,200,120,30);
		L2.setOpaque(true);
		L2.setFont(myfont);
		L2.setForeground(Color.BLACK);
		panel.add(L2);
		
		u2=new JTextField();
		u2.setBounds(380,200,120,30);
		panel.add(u2);
		
		L3=new JLabel("Email:");
		L3.setBounds(250,250,120,30);
		L3.setOpaque(true);
		L3.setFont(myfont);
		L3.setForeground(Color.BLACK);
		panel.add(L3);
		
		u3=new JTextField();
		u3.setBounds(380,250,120,30);
		panel.add(u3);
		
		L4=new JLabel("Address:");
		L4.setBounds(250,300,120,30);
		L4.setOpaque(true);
		L4.setFont(myfont);
		L4.setForeground(Color.BLACK);
		panel.add(L4);
		
		u4=new JTextField();
		u4.setBounds(380,300,120,30);
		panel.add(u4);
		
		
		L5=new JLabel("Education:");
		L5.setBounds(250,350,120,30);
		L5.setOpaque(true);
		L5.setFont(myfont);
		L5.setForeground(Color.BLACK);
		panel.add(L5);
		
		u5=new JTextField();
		u5.setBounds(380,350,120,30);
		panel.add(u5);
		
		L6=new JLabel("Skills:");
		L6.setBounds(250,400,120,30);
		L6.setOpaque(true);
		L6.setFont(myfont);
		L6.setForeground(Color.BLACK);
		panel.add(L6);
		
		u6=new JTextField();
		u6.setBounds(380,400,120,30);
		panel.add(u6);
		
		
		
		

		
		backbtn=new JButton("Back");
		backbtn.setBounds(50,500,80,30);
		backbtn.setFont(myfont);
		backbtn.setBackground(mycolor1);
		backbtn.setForeground(Color.WHITE);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		updatebtn=new JButton("Update");
		updatebtn.setBounds(600,500,150,30);
		updatebtn.setFont(myfont);
		updatebtn.setBackground(Color.BLACK);
		updatebtn.setForeground(Color.WHITE);
		updatebtn.addActionListener(this);
		panel.add(updatebtn);
		
		
		
		
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == backbtn) {
            this.setVisible(false);
            ViewProfilee v1 = new ViewProfilee(accNo);
			v1.setVisible(true);
			
        }
		else if(ae.getSource()== updatebtn) {
			JOptionPane.showMessageDialog(this, "FEATURE COMING SOON!");

		}
    }

	
	
	
	
}
		


		
		

		

