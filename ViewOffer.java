import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ViewOffer extends JFrame
{
	
	public JPanel panel;
	public JLabel l1, l2,l3, l4, l5,l6, l7, l8,l9,l10,l11,l12, l13, l14;
	public Color mycolor,mycolor1,mycolor2;
	public Font myfont;
	public JButton applybtn ;
	
	
	public ViewOffer()
	{
		super("YOU CAN FIND YOUIR BEST JOB HERE");
		this.setSize(1080,720);
		this.setLocation(100,50);
		
		panel=new JPanel();
		panel.setBounds(0,0, 600, 450);
		
		panel.setLayout(null);
		
		mycolor=new Color(0,79,79);
		mycolor1=new Color(222,181,164);
		myfont=new Font("Cambria",Font.PLAIN,20);
		
		panel.setBackground(mycolor);
		
		l1=new JLabel("Job Title        :");
		l1.setBounds(100,50,250,20);
		l1.setBackground(Color.WHITE);
		l1.setOpaque(true);
		l1.setFont(myfont);
		l1.setForeground(Color.BLACK);
		panel.add(l1);
		
		l2=new JLabel("Open Position    :");
		l2.setBounds(100,80,250,20);
		l2.setBackground(Color.WHITE);
		l2.setOpaque(true);
		l2.setFont(myfont);
		l2.setForeground(Color.BLACK);
		panel.add(l2);
		
		l3=new JLabel("Company          :");
		l3.setBounds(100,110,250,20);
		l3.setBackground(Color.WHITE);
		l3.setOpaque(true);
		l3.setFont(myfont);
		l3.setForeground(Color.BLACK);
		panel.add(l3);
		
		l4=new JLabel("Position        :");
		l4.setBounds(100,140,250,20);
		l4.setBackground(Color.WHITE);
		l4.setOpaque(true);
		l4.setFont(myfont);
		l4.setForeground(Color.BLACK);
		panel.add(l4);
		
		l5=new JLabel("Salary          :");
		l5.setBounds(100,170,250,20);
		l5.setBackground(Color.WHITE);
		l5.setOpaque(true);
		l5.setFont(myfont);
		l5.setForeground(Color.BLACK);
		panel.add(l5);
		
		l6=new JLabel("Working Hours   :");
		l6.setBounds(100,200,250,20);
		l6.setBackground(Color.WHITE);
		l6.setOpaque(true);
		l6.setFont(myfont);
		l6.setForeground(Color.BLACK);
		panel.add(l6);
		
		l7=new JLabel("Requirements    :");
		l7.setBounds(100,230,250,20);
		l7.setBackground(Color.WHITE);
		l7.setOpaque(true);
		l7.setFont(myfont);
		l7.setForeground(Color.BLACK);
		panel.add(l7);
		
		l8=new JLabel("Private Job");
		l8.setBounds(350,50,250,20);
		l8.setBackground(Color.WHITE);
		l8.setOpaque(true);
		l8.setFont(myfont);
		l8.setForeground(Color.BLACK);
		panel.add(l8);
		
		l9=new JLabel("Teacher");
		l9.setBounds(350,80,250,20);
		l9.setBackground(Color.WHITE);
		l9.setOpaque(true);
		l9.setFont(myfont);
		l9.setForeground(Color.BLACK);
		panel.add(l9);
		
		l10=new JLabel("AIUB");
		l10.setBounds(350,110,250,20);
		l10.setBackground(Color.WHITE);
		l10.setOpaque(true);
		l10.setFont(myfont);
		l10.setForeground(Color.BLACK);
		panel.add(l10);
		
		l11=new JLabel("10");
		l11.setBounds(350,140,250,20);
		l11.setBackground(Color.WHITE);
		l11.setOpaque(true);
		l11.setFont(myfont);
		l11.setForeground(Color.BLACK);
		panel.add(l11);
		
		l12=new JLabel("70000");
		l12.setBounds(350,170,250,20);
		l12.setBackground(Color.WHITE);
		l12.setOpaque(true);
		l12.setFont(myfont);
		l12.setForeground(Color.BLACK);
		panel.add(l12);
		
		l13=new JLabel("8 ");
		l13.setBounds(350,200,250,20);
		l13.setBackground(Color.WHITE);
		l13.setOpaque(true);
		l13.setFont(myfont);
		l13.setForeground(Color.BLACK);
		panel.add(l13);
		
		l14=new JLabel("Graduated ");
		l14.setBounds(350,230,250,20);
		l14.setBackground(Color.WHITE);
		l14.setOpaque(true);
		l14.setFont(myfont);
		l14.setForeground(Color.BLACK);
		panel.add(l14);
		
		applybtn=new JButton("Apply");
		applybtn.setBounds(500,300,130,50);
		applybtn.setFont(myfont);
		applybtn.setBackground(mycolor1);
		panel.add(applybtn);
		
		
		
		
		this.add(panel);
	}
	
}