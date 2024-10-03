import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Login extends JFrame implements MouseListener, ActionListener{

    public JPanel p1, p2;
    public JLabel l1, l2, l3, imglbl, l4, l5, l6, l7, l8, l9, l10;
    public Color c1, c2;
    public JTextField eFld;
    public JPasswordField pwFld;
    public JButton b1, b2, b3;
    public JButton registerButton;
    public Font loginFont;
    public ImageIcon img;

    public Cursor clickHand = new Cursor(Cursor.HAND_CURSOR);

    public int screenWidth = 72;
    public int screenHeight;
    public int monitorWidth;
    public int monitorHeight;

    int width = 1080;
    int height = 720;

    public Login() {


        super("Chakri Lagbe?");
        this.setSize(890, 640);
        this.setLocation(240, 60);
        //this.setUndecorated(true);

        c1 = new Color(46, 207, 235);
        c2 = new Color(198, 244, 255);
        //loginFont = new Font()
        img = new ImageIcon("./Images/LoginScreen.png");
        Image LoginImage = img.getImage();
        LoginImage = LoginImage.getScaledInstance(445, 640, Image.SCALE_SMOOTH);
        img = new ImageIcon(LoginImage);

        p1 = new JPanel();
        p1.setBounds(0, 0, 445, 640);
        p1.setLayout(null);
        p1.setBackground(c1);

        p2 = new JPanel();
        p2.setBounds(445, 0, 445, 640);
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
        

        l1 = new JLabel("Email: ");
        l1.setBounds(547, 200, 80, 20);
        //l1.setFont(new Font("Dialog", Font.BOLD, 10));
        //l1.setForeground(Color.GRAY);
        p2.add(l1);

        eFld = new JTextField();
        eFld.setBounds(547, 225, 150, 20); //587, 225, 150, 20 ; 587 for all of them
        eFld.setBorder(null);
        eFld.setOpaque(false);
        eFld.setCaretColor(Color.BLACK);
        p2.add(eFld);

        JLabel l8 = new JLabel("____________________________________");
        l8.setForeground(Color.GRAY);
        l8.setBounds(547, 235, 250, 20); //587, 234, 150, 20
        p2.add(l8);

        l2 = new JLabel("Password: ");
        l2.setBounds(547, 280, 80, 20); // 587, 260, 80, 20
        p2.add(l2);

        pwFld = new JPasswordField();
        pwFld.setBounds(547, 305, 200, 20); // 587, 285, 150, 20
        pwFld.setBorder(null);
        pwFld.setOpaque(false);
        pwFld.setCaretColor(Color.BLACK);
        pwFld.setEchoChar('*');
        p2.add(pwFld);

        JLabel l9 = new JLabel("____________________________________"); //______________________
        l9.setForeground(Color.GRAY);
        l9.setBounds(547, 315, 250, 20); // 587, 295, 150, 20
        p2.add(l9);

        imglbl = new JLabel();
        imglbl.setIcon(img);
        imglbl.setBounds(0, 0, 445 , 640); 
        p1.add(imglbl);

        b1 = new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        //b1.setBorder(new RoundedBorder(10));
        b1.setBorderPainted(false);
        b1.setBounds(547, 380, 250, 30); //587, 350, 150, 30
        b1.setCursor(clickHand);
        b1.addMouseListener(this);
        b1.addMouseListener(this);
        b1.addActionListener(this);
        p2.add(b1);

        l5 = new JLabel("Sign in");
        l5.setBounds(627, 100, 250, 55);
        Font labelFont = l5.getFont().deriveFont(22.0F);
        l5.setFont(labelFont);
        p2.add(l5);

        l7 = new JLabel("Don't have an account?");
        l7.setBounds(547, 415, 140, 20);
        l7.setForeground(Color.GRAY);
        p2.add(l7);

        registerButton = new JButton("Register");
        registerButton.setBounds(710, 415, 85, 20);
        registerButton.setBorder(null);
        registerButton.setOpaque(false);
        registerButton.setContentAreaFilled(false);
        registerButton.setCursor(clickHand);
        registerButton.addActionListener(this);
        p2.add(registerButton);
        

        this.add(p1);
        this.add(p2);
    
    }

    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){
        if (me.getSource() == b1) {
            b1.setBackground(new Color(40,40,40));
        }
    }
	public void mouseReleased(MouseEvent me){
        if (me.getSource() == b1) {
            b1.setBackground(Color.BLACK);
        }
    }
	public void mouseEntered(MouseEvent me){
        if (me.getSource() == b1) {
            b1.setBackground(new Color(69, 69, 69));
        }
    }
    public void mouseExited(MouseEvent me){
        if (me.getSource() == b1) {
            b1.setBackground(Color.BLACK);
        }
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == b1) {
            String e = eFld.getText();
            String pw = pwFld.getText();
            Account acc = new Account();
            if(acc.checkAccount(e, pw)==true) {
                JOptionPane.showMessageDialog(this,"You have successfully logged in.");
                this.setVisible(false);
                Homepage h1 = new Homepage(acc.returnAccNum(e, pw));
                h1.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(this, "Incorrect login info. Please try again.");
            }
            
        }

        else if (ae.getSource() == registerButton) {
            this.setVisible(false);
            Registration r1 = new Registration();
            r1.setVisible(true);
        }
    }

}