package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ShowDetails extends JFrame implements ActionListener,MouseListener{

    JPanel panel, topPanel, sidePanel;
    JLabel namelbl;
    JButton backButton, logOutButton, addQButton, upQButton, delQButton, seeResButton, showStuDeatilsButton;
    ImageIcon icon, adminIcon, showDetailsIcon;
    Color themeColor;

    public ShowDetails() {
        super("Admin Details");
        this.setSize(950, 600);
        this.setLocationRelativeTo(null);
        

        themeColor = new Color(41, 110, 214);

        // Panel setup
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.setContentPane(panel);

        // Frame icon
        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        // Admin icon
        adminIcon = new ImageIcon(getClass().getResource("../Images/adminIcon.png"));
        Image scaledAdmin = adminIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        JLabel adminLbl = new JLabel(new ImageIcon(scaledAdmin));
        adminLbl.setBounds(190, 7, 40, 40);
        panel.add(adminLbl);
        // Back button
        backButton = new JButton("Back");
        backButton.setBounds(700, 7, 100, 30);
        backButton.setForeground(Color.BLUE);
        backButton.setBackground(Color.WHITE);
        backButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(backButton);

        // Log Out button
        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(805, 7, 100, 30);
        logOutButton.setForeground(Color.BLUE);
        logOutButton.setBackground(Color.WHITE);
        logOutButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(logOutButton);

        // Top panel
        topPanel = new JPanel();
        topPanel.setLayout(null);
        topPanel.setBounds(185, 0, 950, 50);
        topPanel.setBackground(new Color(29, 29, 54));
        panel.add(topPanel);

        namelbl = new JLabel("ADMIN DASHBOARD");
        namelbl.setBounds(50, 6, 200, 40);
        namelbl.setFont(new Font("Arial", Font.BOLD, 16));
        namelbl.setForeground(Color.WHITE);
        topPanel.add(namelbl);

        // Side panel
        sidePanel = new JPanel();
        sidePanel.setLayout(null);
        sidePanel.setBounds(0, 0, 185, 600);
        sidePanel.setBackground(themeColor);
        panel.add(sidePanel);

        addQButton = new JButton("Add Question");
        addQButton.setBounds(0, 0, 185, 60);
        addQButton.setForeground(Color.WHITE);
        addQButton.setBackground(themeColor);
        addQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(addQButton);
        
        upQButton = new JButton("Update Question");
        upQButton.setBounds(0, 60, 185, 60); // 0 + 60
        upQButton.setForeground(Color.WHITE);
        upQButton.setBackground(themeColor);
        upQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(upQButton);
        
        delQButton = new JButton("Delete Question");
        delQButton.setBounds(0, 120, 185, 60); // 60 + 60
        delQButton.setForeground(Color.WHITE);
        delQButton.setBackground(themeColor);
        delQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(delQButton);
        
        seeResButton = new JButton("See Result");
        seeResButton.setBounds(0, 180, 185, 60); // 120 + 60
        seeResButton.setForeground(Color.WHITE);
        seeResButton.setBackground(themeColor);
        seeResButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(seeResButton);
        
        showStuDeatilsButton = new JButton("Show Details");
        showStuDeatilsButton.setBounds(0, 240, 185, 60); // 180 + 60
        showStuDeatilsButton.setForeground(Color.WHITE);
        showStuDeatilsButton.setBackground(new Color(14, 22, 79));
        showStuDeatilsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(showStuDeatilsButton);

        backButton.addMouseListener(this);
        logOutButton.addMouseListener(this);
        addQButton.addMouseListener(this);
        upQButton.addMouseListener(this);
        delQButton.addMouseListener(this);
        seeResButton.addMouseListener(this);
        showStuDeatilsButton.addMouseListener(this);


        backButton.addActionListener(this);
        logOutButton.addActionListener(this);
        addQButton.addActionListener(this);
        upQButton.addActionListener(this);
        delQButton.addActionListener(this);
        seeResButton.addActionListener(this);
        showStuDeatilsButton.addActionListener(this);
        // Mid part
        showDetailsIcon = new ImageIcon(getClass().getResource("../Images/showDetails.png"));
        Image scaledImage = showDetailsIcon.getImage().getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        JLabel imgLabel = new JLabel(new ImageIcon(scaledImage));
        imgLabel.setBounds(500, 60, 140, 140);
        panel.add(imgLabel);

        JLabel textLabel = new JLabel("Admin Details",SwingConstants.CENTER);
        textLabel.setBounds(190, 185, 760, 50);
        textLabel.setFont(new Font("Arial", Font.BOLD, 24));
        textLabel.setForeground(new Color(70, 138, 59));
        panel.add(textLabel);

        JLabel admindtls = new JLabel("<html><body style='text-align:center;'>As an admin, you have full control over the platform.<br> You can add, update, or delete questions, manage content, <br>and view important app details and statistics <br>from the admin panel.<body/><html/>",SwingConstants.CENTER);
        admindtls.setBounds(190, 260, 760, 100);
        admindtls.setFont(new Font("Arial", Font.BOLD, 22));
        admindtls.setForeground(Color.BLACK);
        panel.add(admindtls);
    }
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {
    if (me.getSource() == addQButton) {
        addQButton.setBackground(new Color(14, 22, 79));
        addQButton.setForeground(Color.WHITE);
    }
    else if (me.getSource() == upQButton) {
        upQButton.setBackground(new Color(14, 22, 79));
        upQButton.setForeground(Color.WHITE);
    }
    else if (me.getSource() == delQButton) {
        delQButton.setBackground(new Color(14, 22, 79));
        delQButton.setForeground(Color.WHITE);
    }
    else if (me.getSource() == seeResButton) {
        seeResButton.setBackground(new Color(14, 22, 79));
        seeResButton.setForeground(Color.WHITE);
    }
    else if (me.getSource() == logOutButton)
    {
        logOutButton.setBackground(themeColor);
        logOutButton.setForeground(Color.WHITE);
    }
    else if (me.getSource()==backButton)
    {
        backButton.setBackground(themeColor);
        backButton.setForeground(Color.WHITE);
    }

}

public void mouseExited(MouseEvent me) {
    if (me.getSource() == addQButton) {
        addQButton.setBackground(themeColor);
        addQButton.setForeground(Color.WHITE);
    }
    else if (me.getSource() == upQButton) {
        upQButton.setBackground(themeColor);
        upQButton.setForeground(Color.WHITE);
    }
    else if (me.getSource() == delQButton) {
        delQButton.setBackground(themeColor);
        delQButton.setForeground(Color.WHITE);
    }
    else if (me.getSource() == seeResButton) {
        seeResButton.setBackground(themeColor);
        seeResButton.setForeground(Color.WHITE);
    }
    else if(me.getSource()==logOutButton)
    {
        logOutButton.setBackground(Color.WHITE);
        logOutButton.setForeground(Color.BLUE);
    }
    else if (me.getSource()==backButton)
    {
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(themeColor);
    }
}
public void actionPerformed(ActionEvent ae)
{
    if (ae.getSource() == logOutButton)
    {
        this.setVisible(false);
        Sign_in si = new Sign_in();
        si.setVisible(true);
    }
    else if (ae.getSource() == addQButton)
    {
        this.setVisible(false);
        AddQuestions aq = new AddQuestions();
        aq.setVisible(true);
    }
    else if (ae.getSource() == upQButton)
    {
        this.setVisible(false);
        UpQuestions uq = new UpQuestions();
        uq.setVisible(true);
    }
    else if (ae.getSource() == delQButton)
    {
        this.setVisible(false);
        deleteQ dq = new deleteQ();
        dq.setVisible(true);
    }
    else if (ae.getSource() == seeResButton)
    {
        this.setVisible(false);
        SeeResult sr = new SeeResult();
        sr.setVisible(true);
    }
    else if (ae.getSource()==backButton)
    {
        this.setVisible(false);
        AdminPage a1 = new AdminPage();
        a1.setVisible(true);
    }
    
}

}
