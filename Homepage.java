import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class Homepage extends JFrame implements MouseListener, ComponentListener, ActionListener {

    private JPanel sidePanel, topPanel, mainPanel, mainCPanel, adPanel, wrapperPanel;
    private JButton homeBtn, settingsBtn, pflBtn, outBtn;
    private JLabel title1, title2, t1, lbl;;
    private SpringLayout layout;
    private Color sidePanelColor, buttonColor;
    private int sidePanelWidth = 180;
    private int sidePanelHeight = 30;
    private Font titleFont = new Font("Garamond", Font.PLAIN, 20);
    private JPanel titlePane, buttonPane;
    private JTextField sFld;
    private ImageIcon pfp;
    private Image img;
    private JButton viewPfl;
    private ImageIcon adGif;
    private JButton adBtn;
    private JScrollPane scroller;
    private JPanel posts;
    private JButton p1[];
    private Account a1;
    private int accNo;
    //private String[] company = new String[10];
    


    public Homepage(int accNum)  {

        super("Hello");
        accNo = accNum;
        this.setLayout(new BorderLayout());
        this.setSize(1080,720);
        this.setLocation(120,20);
        this.addComponentListener(this);
        sidePanel = new JPanel();
        sidePanel.setLayout(new BorderLayout());
        sidePanelColor = Color.decode("#212e45");
        buttonColor = Color.decode("#151D2B");
        sidePanel.setBackground(sidePanelColor);

        Account a1 = new Account();
        titlePane = new JPanel();
        titlePane.setLayout(new BoxLayout(titlePane,BoxLayout.Y_AXIS));
        titlePane.setBackground(sidePanelColor);

        t1 = new JLabel("                 ");
        t1.setPreferredSize(new Dimension(sidePanelWidth,10));
        t1.setBackground(sidePanelColor);
        t1.setAlignmentX(CENTER_ALIGNMENT);
        titlePane.add(t1);
        titlePane.add(Box.createVerticalStrut(20));

        title1 = new JLabel("Chakri",JLabel.CENTER);
        title1.setFont(titleFont);
        title1.setBackground(sidePanelColor);
        title1.setForeground(Color.WHITE);
        title1.setAlignmentX(CENTER_ALIGNMENT);
        titlePane.add(title1);
        titlePane.add(Box.createVerticalStrut(10));

        title2 = new JLabel("    Lagbe?", JLabel.CENTER);
        title2.setFont(titleFont);
        title2.setBackground(sidePanelColor);
        title2.setForeground(Color.WHITE);
        title2.setAlignmentX(CENTER_ALIGNMENT);
        titlePane.add(title2);
        titlePane.add(Box.createVerticalStrut(30));

        buttonPane = new JPanel();
        buttonPane.setLayout(null);
        buttonPane.setBackground(buttonColor);

        homeBtn = new JButton("            Home");
        homeBtn.setBounds(0, 40, 180, 40);
        homeBtn.setBackground(buttonColor);
        homeBtn.setForeground(Color.WHITE);
        homeBtn.setHorizontalAlignment(SwingConstants.LEFT);
        homeBtn.setBorder(null);
        homeBtn.addMouseListener(this);
        buttonPane.add(homeBtn);

        JLabel lbl = new JLabel("________________________________");
        lbl.setForeground(Color.decode("#111824"));
        lbl.setFont(lbl.getFont().deriveFont(10));
        lbl.setBounds(0,67,200,15);
        buttonPane.add(lbl);

        pflBtn = new JButton("            Profile");
        pflBtn.setBounds(0, 85, 180, 40);
        pflBtn.setBorder(null);
        pflBtn.setBackground(buttonColor);
        pflBtn.setForeground(Color.WHITE);
        pflBtn.setHorizontalAlignment(SwingConstants.LEFT);
        pflBtn.addMouseListener(this);
        pflBtn.addActionListener(this);
        buttonPane.add(pflBtn);

        lbl = new JLabel("________________________________");
        lbl.setForeground(Color.decode("#111824"));
        lbl.setFont(lbl.getFont().deriveFont(10));
        lbl.setBounds(0,112,200,15);
        buttonPane.add(lbl);

        settingsBtn = new JButton("            Settings");
        settingsBtn.setBorder(null);
        settingsBtn.setBounds(0,130, 180, 40);
        settingsBtn.setBackground(buttonColor);
        settingsBtn.setForeground(Color.WHITE);
        settingsBtn.setHorizontalAlignment(SwingConstants.LEFT);
        settingsBtn.addMouseListener(this);
        buttonPane.add(settingsBtn);

        lbl = new JLabel("________________________________");
        lbl.setForeground(Color.decode("#111824"));
        lbl.setFont(lbl.getFont().deriveFont(10));
        lbl.setBounds(0,157,200,15);
        buttonPane.add(lbl);

        outBtn = new JButton("            Log out");
        outBtn.setBorder(null);
        outBtn.setForeground(Color.WHITE);
        outBtn.setBackground(buttonColor);
        outBtn.setBounds(0,175, 180, 40);
        outBtn.setHorizontalAlignment(SwingConstants.LEFT);
        outBtn.addMouseListener(this);
        outBtn.addActionListener(this);
        buttonPane.add(outBtn);

        lbl = new JLabel("________________________________");
        lbl.setForeground(Color.decode("#111824"));
        lbl.setFont(lbl.getFont().deriveFont(10));
        lbl.setBounds(0,202,200,15);
        //buttonPane.add(lbl);
    

        sidePanel.add(titlePane, BorderLayout.NORTH);
        sidePanel.add(buttonPane, BorderLayout.CENTER);

    
        
        //sidePanel.add(buttonPane);
        this.add(sidePanel, BorderLayout.WEST);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);


        topPanel = new JPanel();
        topPanel.setLayout(null);
        topPanel.setPreferredSize(new Dimension(getWidth(), 120));
        topPanel.setBackground(Color.decode("#74DBFF"));

        sFld = new JTextField("       Search for postings....");
        sFld.setBounds(70,45, 550, 40);
        sFld.setBorder(null);

        ImageIcon pfp = new ImageIcon("./Images/ProfileIcon.png");
        Image img = pfp.getImage();
        img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        pfp = new ImageIcon(img);

        viewPfl = new JButton(pfp);
        viewPfl.setBounds(700 , 25, 200, 80);
        viewPfl.setText(a1.returnInfo(accNo, 1));
        viewPfl.setContentAreaFilled(false);
        viewPfl.setHorizontalAlignment(SwingConstants.LEFT);
        viewPfl.setBorder(null);
        topPanel.add(viewPfl);
        topPanel.add(sFld);    
        mainPanel.add(topPanel, BorderLayout.NORTH);


        adPanel = new JPanel();
        adPanel.setLayout(null);
        adPanel.setBackground(Color.decode("#f4f2ee"));
        adPanel.setPreferredSize(new Dimension(250, getHeight()));

        ImageIcon adGif = new ImageIcon("./Images/Ad.png");
        img = adGif.getImage();
        img = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        adGif = new ImageIcon(img);

        adBtn = new JButton(adGif);
        adBtn.setBounds(20,20, 200, 200);
        adBtn.setContentAreaFilled(false);
        adBtn.setBorder(null);
        adPanel.add(adBtn);

        adGif = new ImageIcon("./Images/Ad2.png");
        img = adGif.getImage();
        img = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        adGif = new ImageIcon(img);

        adBtn = new JButton(adGif);
        adBtn.setBounds(20,240,200,200);
        adBtn.setContentAreaFilled(false);
        adBtn.setBorder(null);
        adPanel.add(adBtn);

        mainPanel.add(adPanel, BorderLayout.EAST);

        mainPanel.add(topPanel, BorderLayout.NORTH);

        //mainCPanel = new JPanel();
       // mainCPanel.setBackground(Color.decode("#f4f2ee"));

        posts = new JPanel();
        posts.setLayout(new BoxLayout(posts, BoxLayout.Y_AXIS));
        posts.setBackground(Color.decode("#f4f2ee"));

        lbl = new JLabel("Yo");
        lbl.setBounds(20,20, 100, 20);
        lbl.setBackground(Color.BLACK);

        adGif = new ImageIcon("./Images/TempImage.png");
        img = adGif.getImage();
        img = img.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
        adGif = new ImageIcon(img);

        p1 = new JButton[10];

        posts.add(Box.createVerticalStrut(30));

        

        for (int i = 0; i < 10; i++) {

            adGif = new ImageIcon("./Images/J1"+(i+1)+".jpg");
            img = adGif.getImage();
            img = img.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
            adGif = new ImageIcon(img);

            posts.add(Box.createHorizontalStrut(25));
            p1[i] = new JButton(adGif);
            //p1[i].setBounds(25, 60 + (110*i), 580, 100);
            p1[i].setPreferredSize(new Dimension(580, 100));
            p1[i].setBackground(Color.WHITE);
            p1[i].setForeground(Color.BLACK);
            p1[i].setBorder(null);
            p1[i].setText("<html> \tCompany:" +i+ " <br> \tSalary: " +(20*i)+ "k$/yr<br> \tTime: 40 hrs/week <br> \tDescription: ");
            p1[i].setHorizontalAlignment(SwingConstants.LEFT);
            p1[i].addActionListener(this);
            posts.add(p1[i]);
            posts.add(Box.createVerticalStrut(10));
        }

        posts.add(Box.createHorizontalStrut(25));

        //posts.add(lbl);
        JScrollPane scroller = new JScrollPane(posts);
        scroller.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setBorder(null);
        scroller.setBackground(Color.decode("#f4f2ee"));
        scroller.getVerticalScrollBar().setBackground(Color.decode("#f4f2ee"));
        scroller.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = sidePanelColor;
            }
        });
        //mainCPanel.add(scroller);
        mainPanel.add(scroller, BorderLayout.CENTER);


        this.add(mainPanel, BorderLayout.CENTER);

        
    }

    public void actionPerformed(ActionEvent ae){

        if (ae.getSource()==homeBtn) {
            homeBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (ae.getSource()==pflBtn) {
            pflBtn.setBackground(Color.decode("#0C111A"));
            this.setVisible(false);
            ViewProfilee v1 = new ViewProfilee(accNo);
            v1.setVisible(true);
        }
        else if (ae.getSource()==settingsBtn) {
            settingsBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (ae.getSource()==outBtn) {
            outBtn.setBackground(Color.decode("#0C111A"));
            this.setVisible(false);
            Login logFrame = new Login();
            logFrame.setVisible(true);
        }
        else if (ae.getSource()==p1[0]||ae.getSource()==p1[1]||ae.getSource()==p1[2]||ae.getSource()==p1[3]||ae.getSource()==p1[4]||ae.getSource()==p1[5]||ae.getSource()==p1[6]||ae.getSource()==p1[7]||ae.getSource()==p1[8]){
            this.setVisible(false);
            Application a1 = new Application(accNo);
            a1.setVisible(true);
        }

    }

    public void mouseClicked(MouseEvent me){
        if (me.getSource()==homeBtn) {
            homeBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (me.getSource()==pflBtn) {
            pflBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (me.getSource()==settingsBtn) {
            settingsBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (me.getSource()==outBtn) {
            outBtn.setBackground(Color.decode("#0C111A"));
        }
    }

    public void mouseEntered(MouseEvent me){
        if (me.getSource()==homeBtn) {
            homeBtn.setBackground(sidePanelColor);
        }
        else if (me.getSource()==pflBtn) {
            pflBtn.setBackground(sidePanelColor);
        }
        else if (me.getSource()==settingsBtn) {
            settingsBtn.setBackground(sidePanelColor);
        }
        else if (me.getSource()==outBtn) {
            outBtn.setBackground(sidePanelColor);
        }
    }
    public void mouseExited(MouseEvent me){
        if (me.getSource()==homeBtn) {
            homeBtn.setBackground(buttonColor);
        }
        else if (me.getSource()==pflBtn) {
            pflBtn.setBackground(buttonColor);
        }
        else if (me.getSource()==settingsBtn) {
            settingsBtn.setBackground(buttonColor);
        }
        else if (me.getSource()==outBtn) {
            outBtn.setBackground(buttonColor);
        }
    }

    public void mousePressed(MouseEvent me){
        if (me.getSource()==homeBtn) {
            homeBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (me.getSource()==pflBtn) {
            pflBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (me.getSource()==settingsBtn) {
            settingsBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (me.getSource()==outBtn) {
            outBtn.setBackground(Color.decode("#0C111A"));
        }
           
    }
    public void mouseReleased(MouseEvent me){
        if (me.getSource()==homeBtn) {
            homeBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (me.getSource()==pflBtn) {
            pflBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (me.getSource()==settingsBtn) {
            settingsBtn.setBackground(Color.decode("#0C111A"));
        }
        else if (me.getSource()==outBtn) {
            outBtn.setBackground(Color.decode("#0C111A"));
        }
    }

    public void componentShown(ComponentEvent ce){}
    public void componentHidden(ComponentEvent ce){}
    public void componentMoved(ComponentEvent ce){}
    public void componentResized(ComponentEvent ce){

        sidePanelWidth = (int)(0.1875*getWidth());
        t1.setPreferredSize(new Dimension(sidePanelWidth,10));
        t1.repaint();
        sidePanel.repaint();

    }

}
