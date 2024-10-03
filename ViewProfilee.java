import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.View;

import java.awt.*;

public class ViewProfilee extends JFrame implements ActionListener {

    private JPanel p1, p2;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l10;
    private JButton skills[],backbtn,editbtn;
    private ImageIcon img;
    private Image i1;
	private Font myfont,myfont1,myfont2;
	private Color mycolor1;
    private int accNo;
	private Account a1;
 
    public ViewProfilee(int accNum) {

        super("Hello");
        a1 = new Account();
        this.setSize(1080,720);
        this.setLocation(120,20);
        accNo = accNum;
        p1 = new JPanel(null);
        p1.setBackground(Color.WHITE);
		
		myfont=new Font("Arial Black",Font.PLAIN,15);
		myfont1=new Font("Arial",Font.PLAIN,12);
		myfont2=new Font("Arial",Font.PLAIN,10);
		
		mycolor1=new Color(0,0,0);

        img = new ImageIcon("./Images/ProfileIcon.png");
        i1 = img.getImage();
        i1 = i1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        img = new ImageIcon(i1); 

        l1 = new JLabel(img);
        l1.setBounds(30,30, 150,150);
        p1.add(l1);

        

        l1 = new JLabel(a1.returnInfo(accNo, 1));
        l1.setBounds(200, 50, 300, 40);
        l1.setFont(l1.getFont().deriveFont(25.0F));
        p1.add(l1);

        l1 = new JLabel(a1.returnInfo(accNo, 0));
        l1.setBounds(200, 90, 300, 40);
        l1.setForeground(Color.LIGHT_GRAY);
        l1.setFont(l1.getFont().deriveFont(15.0F));
        p1.add(l1);
        
        l1 = new JLabel("About me");
        l1.setBounds(40, 210, 100, 20);
        l1.setFont(l1.getFont().deriveFont(15.0F));
        p1.add(l1);

        l1 = new JLabel("<html> I'm passionate about both learning and working, always excited to take on new challenges. I thrive on growing, improving, and tackling every task with dedication and a positive attitude. Whether I'm learning something new or getting things done, I approach everything with energy and focus! </html>");
        l1.setBounds(40, 230, 600, 60);
        l1.setFont(l1.getFont().deriveFont(11.0F));
        p1.add(l1);

        l1 = new JLabel("Skills");
        l1.setBounds(40, 310, 100, 20);
        l1.setFont(l1.getFont().deriveFont(15.0F));
        p1.add(l1);

        skills = new JButton[5];

        for (int i = 0; i < 5; i++) {
            skills[i] = new JButton("C++");
            skills[i].setBounds(40 + (120*i), 345, 100, 30);
            skills[i].setOpaque(true);
            skills[i].setBorder(null);
            skills[i].setBackground(Color.BLACK);
            skills[i].setForeground(Color.WHITE);
            p1.add(skills[i]);
        }

        img = new ImageIcon("./Images/Location.jpg");
        i1 = img.getImage();
        i1 = i1.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        img = new ImageIcon(i1); 

        l1 = new JLabel(img);
        l1.setText("Dhaka, Bangladesh");
        l1.setBounds(700, 60, 200,25);
        p1.add(l1);

        img = new ImageIcon("./Images/SpeechIcon.png");
        i1 = img.getImage();
        i1 = i1.getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        img = new ImageIcon(i1);

        l1 = new JLabel(img);
        l1.setText("Bengali, English, German");
        l1.setBounds(667, 120, 300, 25);
        p1.add(l1);
		
		
		l2=new JLabel("Education");
		
		l2.setBounds(40,400,100,25);
		l2.setOpaque(true);
		l2.setFont(myfont);
		l2.setForeground(Color.BLACK);
		p1.add(l2);
		
		l3=new JLabel("University of Califonia, Berkeley");
		
		l3.setBounds(40,430,200,25);
		l3.setOpaque(true);
		l3.setFont(myfont1);
		l3.setForeground(Color.BLACK);
		p1.add(l3);
		
		l4=new JLabel("Doctor of Philosophy - Phd, Computer Science");
		
		l4.setBounds(40,450,250,25);
		l4.setOpaque(true);
		l4.setFont(myfont2);
		l4.setForeground(Color.GRAY);
		p1.add(l4);
		
		l5=new JLabel("Experience");
		
		l5.setBounds(480,400,100,25);
		l5.setOpaque(true);
		l5.setFont(myfont);
		l5.setForeground(Color.BLACK);
		p1.add(l5);
		
		l6=new JLabel("Founder");
		l6.setFont(l1.getFont().deriveFont(13.0F));
		
		l6.setBounds(480,430,250,25);
		l6.setOpaque(true);
		//l6.setFont(myfont);
		l6.setForeground(Color.BLACK);
		p1.add(l6);
		
		l7=new JLabel("DeepLearning.AI");
		
		l7.setBounds(480,450,100,25);
		l7.setOpaque(true);
		l7.setFont(myfont1);
		l7.setForeground(Color.BLACK);
		p1.add(l7);
		
		l8=new JLabel("June 2017 - Present - 7 yrs 4 mas");
		
		l8.setBounds(480,470,250,25);
		l8.setOpaque(true);
		l8.setFont(myfont2);
		l8.setForeground(Color.GRAY);
		p1.add(l8);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(30,600,80,40);
        backbtn.addActionListener(this);
		//backbtn.setFont(myfont1);
		backbtn.setFont(l1.getFont().deriveFont(13.0F));
		
		backbtn.setForeground(Color.WHITE);
		backbtn.setBackground(mycolor1);
		p1.add(backbtn);
		
		editbtn=new JButton("Edit");
		editbtn.setBounds(950,600,80,40);
        editbtn.setBackground(Color.BLACK);
		editbtn.addActionListener(this);
		editbtn.setFont(l1.getFont().deriveFont(13.0F));
		
		editbtn.setForeground(Color.WHITE);
		editbtn.setBackground(mycolor1);
		p1.add(editbtn);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

        

        this.add(p1);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==backbtn) {
            this.setVisible(false);
            Homepage h1 = new Homepage(accNo);
            h1.setVisible(true);
        }
        else if (ae.getSource()==editbtn) {
            this.setVisible(false);
            Editprofile e1 = new Editprofile(accNo);
            e1.setVisible(true);
        }
    }
    
}
