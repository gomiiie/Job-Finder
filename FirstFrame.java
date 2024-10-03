import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FirstFrame extends JFrame implements MouseListener, ActionListener{

    public JPanel panel;
    public Color c1,c2,c3;
    public JButton b1;
    public Font f1;
    public JLabel imglbl;

    public ImageIcon img;

    public FirstFrame()
    {
        super("Chakri Lagbe?");
        this.setSize(1080,720);
		this.setLocation(120,20);

        panel=new JPanel();
		panel.setLayout(null);

        c1 =new Color(97,207,240);
        c2 =new Color(97,207,240);
        c3 =new Color(36,82,119);
        f1=new Font("Cambria",Font.PLAIN,24);

        img=new ImageIcon("./Images/rsz_job2.jpg");

        panel.setBackground(c1);

        b1 =new JButton("Start");
        b1.setBounds(420,300,160,70);
        b1.setBackground(c2);
        b1.setBorder(null);
        b1.setFont(f1);
        b1.setForeground(Color.BLACK);
        b1.addMouseListener(this);
        b1.addActionListener(this);
        panel.add(b1);

        imglbl=new JLabel(img);
		imglbl.setBounds(0,0,1080,720);
		panel.add(imglbl);

        this.add(panel);
    }
    
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==b1)
		{
			b1.setBackground(c3);
            //b1.setForeground(Color.GREEN);
		}
    }
    public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==b1)
		{
			b1.setBackground(c1);
            //b1.setForeground(Color.BLACK);
		}
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== b1) {
            this.setVisible(false);
            Login l1 = new Login();
            l1.setVisible(true);
        }
    }
    
    

}
