package Frames;
import java.lang.*;
import javax.swing.*;

import Entities.Account;
import Entities.Question;

import java.awt.event.*;
import java.awt.*;

public class AdminPage extends JFrame implements MouseListener,ActionListener{

    JLabel namelbl,tstuNum,tStudents,welcomLabel;
	JTextField namefld;
	JButton logOutButton,addQButton,upQButton,delQButton,seeResButton,showStuDeatilsButton;
    Color themeColor;
    ImageIcon icon,adminIcon,addQ,totalStu,qnA,adminimg1Icon,adminimg2Icon;
	JPanel panel,topPanel,sidePanel,midPanel1,midPanel2;

    public AdminPage()
    {
        super("Admin Dashboard");
        this.setSize(950,600);
        this.setLocationRelativeTo(null);

        themeColor = new Color(41, 110, 214);


        panel=new JPanel();
		panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        adminIcon = new ImageIcon(getClass().getResource("../Images/adminIcon.png"));
        Image scaledImageRlogo = adminIcon.getImage().getScaledInstance(
            40, 40, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageRlogoFinal = new ImageIcon(scaledImageRlogo);
        JLabel adminLbl = new JLabel(scaledImageRlogoFinal);
        adminLbl.setBounds(190, 7, 40, 40);
        panel.add(adminLbl);

        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(805, 7, 100, 30);
        logOutButton.setForeground(Color.BLUE);
        logOutButton.setBackground(Color.WHITE);
        logOutButton.setFont(new Font("Arial", Font.BOLD, 16));
        logOutButton.addMouseListener(this);
        logOutButton.addActionListener(this);
        panel.add(logOutButton);

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

        sidePanel = new JPanel();
        sidePanel.setLayout(null);
        sidePanel.setBounds(0, 0, 185, 600);
        sidePanel.setBackground(themeColor);
        panel.add(sidePanel);
        
        adminimg1Icon = new ImageIcon(getClass().getResource("../Images/admin_3.png"));
        Image scaledAdminImg = adminimg1Icon.getImage().getScaledInstance
        (200, 200, Image.SCALE_SMOOTH);
        JLabel admin1JLabel = new JLabel(new ImageIcon(scaledAdminImg));
        admin1JLabel.setBounds(450, 45, 200, 200);
        panel.add(admin1JLabel);

       welcomLabel = new JLabel("Welcome to Admin Dashboard");
       welcomLabel.setBounds(315, 230, 500, 50);
       welcomLabel.setFont(new Font("Arial", Font.BOLD, 34));
       welcomLabel.setForeground(new Color(14, 22, 79));
       panel.add(welcomLabel);
       
        adminimg2Icon = new ImageIcon(getClass().getResource("../Images/admin_2.png"));
        Image scaledAdmin2Img = adminimg2Icon.getImage().getScaledInstance
        (100, 100, Image.SCALE_SMOOTH);
        JLabel admin2JLabel = new JLabel(new ImageIcon(scaledAdmin2Img));
        admin2JLabel.setBounds(820, 220, 100, 100);
        panel.add(admin2JLabel);

        midPanel1 = new JPanel();
        midPanel1.setLayout(null);
        midPanel1.setBounds(250, 350, 200, 150);
        midPanel1.setBackground(new Color(14, 22, 79));
        panel.add(midPanel1);

        tstuNum = new JLabel(String.valueOf(new Account().getTotalStudents()));
        // tstuNum = new JLabel("24");
        tstuNum.setBounds(60, 15, 100, 50);
        tstuNum.setFont(new Font("Arial", Font.BOLD, 56));
        tstuNum.setForeground(Color.WHITE);
        midPanel1.add(tstuNum);

        totalStu = new ImageIcon(getClass().getResource("../Images/TotalStu.png"));
        Image scaledAddQImage = totalStu.getImage().getScaledInstance(
            60, 60, Image.SCALE_SMOOTH
        );
        ImageIcon scaledAddQIcon = new ImageIcon(scaledAddQImage);
        JLabel totalSJLabel = new JLabel(scaledAddQIcon);
        totalSJLabel.setBounds(75, 70, 60, 60);
        midPanel1.add(totalSJLabel);

       tStudents = new JLabel("Total Students");
       tStudents.setBounds(265, 500, 250, 50);
       tStudents.setFont(new Font("Arial", Font.BOLD, 24));
       tStudents.setForeground(new Color(14, 22, 79));
       panel.add(tStudents);



        midPanel2 = new JPanel();
        midPanel2.setLayout(null);
        midPanel2.setBounds(650, 350, 200, 150);
        midPanel2.setBackground(new Color(14, 22, 79));
        panel.add(midPanel2);
        
        qnA = new ImageIcon(getClass().getResource("../Images/Q&A.png"));
        Image scaledQAImage = qnA.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon scaledQAIcon = new ImageIcon(scaledQAImage);
        JLabel qaLbl = new JLabel(scaledQAIcon);
        qaLbl.setBounds(75, 70, 60, 60);
        midPanel2.add(qaLbl);
        
        // JLabel tqaNum = new JLabel(String.valueOf(new Question().getTotalQuestions())); 
        JLabel tqaNum = new JLabel("75"); 
        tqaNum.setBounds(60, 15, 100, 50);
        tqaNum.setFont(new Font("Arial", Font.BOLD, 56));
        tqaNum.setForeground(Color.WHITE);
        midPanel2.add(tqaNum);
        
        JLabel qnaLabel = new JLabel("Total Question & Answer");
        qnaLabel.setBounds(610, 500, 350, 50); 
        qnaLabel.setFont(new Font("Arial", Font.BOLD, 24));
        qnaLabel.setForeground(new Color(14, 22, 79));
        panel.add(qnaLabel);




        

        addQButton = new JButton("Add Question");
        addQButton.setBounds(0, 0, 185, 60);
        addQButton.setForeground(Color.WHITE);
        addQButton.setBackground(themeColor);
        addQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(addQButton);
        
        upQButton = new JButton("Update Question");
        upQButton.setBounds(0, 60, 185, 60);
        upQButton.setForeground(Color.WHITE);
        upQButton.setBackground(themeColor);
        upQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(upQButton);
        
        delQButton = new JButton("Delete Question");
        delQButton.setBounds(0, 120, 185, 60);
        delQButton.setForeground(Color.WHITE);
        delQButton.setBackground(themeColor);
        delQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(delQButton);
        
        seeResButton = new JButton("See Result");
        seeResButton.setBounds(0, 180, 185, 60);
        seeResButton.setForeground(Color.WHITE);
        seeResButton.setBackground(themeColor);
        seeResButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(seeResButton);
        
        showStuDeatilsButton = new JButton("Show Details");
        showStuDeatilsButton.setBounds(0, 240, 185, 60);
        showStuDeatilsButton.setForeground(Color.WHITE);
        showStuDeatilsButton.setBackground(themeColor);
        showStuDeatilsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(showStuDeatilsButton);

        addQButton.addMouseListener(this);
        upQButton.addMouseListener(this);
        delQButton.addMouseListener(this);
        seeResButton.addMouseListener(this);
        showStuDeatilsButton.addMouseListener(this);

        addQButton.addActionListener(this);
        upQButton.addActionListener(this);
        delQButton.addActionListener(this);
        seeResButton.addActionListener(this);
        showStuDeatilsButton.addActionListener(this);






        this.add(panel);


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
    else if (me.getSource() == showStuDeatilsButton) {
        showStuDeatilsButton.setBackground(new Color(14, 22, 79));
        showStuDeatilsButton.setForeground(Color.WHITE);
    }
    else if (me.getSource() == logOutButton)
    {
        logOutButton.setBackground(themeColor);
        logOutButton.setForeground(Color.WHITE);
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
    else if (me.getSource() == showStuDeatilsButton) {
        showStuDeatilsButton.setBackground(themeColor);
        showStuDeatilsButton.setForeground(Color.WHITE);
    }
    else if(me.getSource()==logOutButton)
    {
        logOutButton.setBackground(Color.WHITE);
        logOutButton.setForeground(Color.BLUE);
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
    else if (ae.getSource() == showStuDeatilsButton)
    {
        this.setVisible(false);
        ShowDetails sd = new ShowDetails();
        sd.setVisible(true);
    }
}


    
}
