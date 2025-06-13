package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class AdminPage extends JFrame {

    JLabel namelbl,tstuNum,tStudents,welcomLabel;
	JTextField namefld;
	JButton logOutButton,addQButton,upQButton,delQButton,seeResButton,showStuDeatilsButton;
    Color themeColor;
    ImageIcon icon,adminIcon,addQ,totalStu,qnA;
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
        // logOutButton.addMouseListener(this);
        // logOutButton.addActionListener(this);
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

       welcomLabel = new JLabel("Welcome to Admin Dashboard");
       welcomLabel.setBounds(200, 150, 500, 50);
       welcomLabel.setFont(new Font("Arial", Font.BOLD, 24));
       welcomLabel.setForeground(new Color(14, 22, 79));
       panel.add(welcomLabel);

        midPanel1 = new JPanel();
        midPanel1.setLayout(null);
        midPanel1.setBounds(250, 350, 200, 150);
        midPanel1.setBackground(new Color(14, 22, 79));
        panel.add(midPanel1);

       tstuNum = new JLabel("455");
       tstuNum.setBounds(60, 15, 100, 50);
       tstuNum.setFont(new Font("Arial", Font.BOLD, 56));
       tstuNum.setForeground(Color.WHITE);
       midPanel1.add(tstuNum);

        totalStu = new ImageIcon(getClass().getResource("../Images/TotalStu.png"));
        Image scaledAddQImage = totalStu.getImage().getScaledInstance(
            100, 100, Image.SCALE_SMOOTH
        );
        ImageIcon scaledAddQIcon = new ImageIcon(scaledAddQImage);
        JLabel totalSJLabel = new JLabel(scaledAddQIcon);
        totalSJLabel.setBounds(50, 75, 100, 100);
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
        
        // Icon setup for Q&A
        qnA = new ImageIcon(getClass().getResource("../Images/Q&A.png"));
        Image scaledQAImage = qnA.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledQAIcon = new ImageIcon(scaledQAImage);
        JLabel qaLbl = new JLabel(scaledQAIcon);
        qaLbl.setBounds(50, 75, 100, 100);
        midPanel2.add(qaLbl);
        
        // Number Label (e.g., "123")
        JLabel tqaNum = new JLabel("123"); // You can change this number as needed
        tqaNum.setBounds(60, 15, 100, 50);
        tqaNum.setFont(new Font("Arial", Font.BOLD, 56));
        tqaNum.setForeground(Color.WHITE);
        midPanel2.add(tqaNum);
        
        // Description label below midPanel2
        JLabel qnaLabel = new JLabel("Set of Question & Answer");
        qnaLabel.setBounds(610, 500, 350, 50); // Adjust as needed
        qnaLabel.setFont(new Font("Arial", Font.BOLD, 24));
        qnaLabel.setForeground(new Color(14, 22, 79));
        panel.add(qnaLabel);



        // midPanel3= new JPanel();
        // midPanel3.setLayout(null);
        // midPanel3.setBounds(250, 350, 200, 150);
        // midPanel3.setBackground(new Color(14, 22, 79));
        // panel.add(midPanel3);


        // midPanel4 = new JPanel();
        // midPanel4.setLayout(null);
        // midPanel4.setBounds(650, 350, 200, 150);
        // midPanel4.setBackground(new Color(14, 22, 79));
        // panel.add(midPanel4);





       // add q
        // addQ = new ImageIcon(getClass().getResource("../Images/addQ.png"));
        // Image scaledAddQImage = addQ.getImage().getScaledInstance(
        //     38, 38, Image.SCALE_SMOOTH
        // );
        // ImageIcon scaledAddQIcon = new ImageIcon(scaledAddQImage);
        // JLabel addQlbl = new JLabel(scaledAddQIcon);
        // addQlbl.setBounds(0, 7, 38, 38);
        // sidePanel.add(addQlbl);

        addQButton = new JButton("Add Question");
        addQButton.setBounds(0, 0, 185, 60);
        addQButton.setForeground(new Color(14, 22, 79));
        addQButton.setBackground(themeColor);
        addQButton.setFont(new Font("Arial", Font.BOLD, 22));
        // addQButton.addMouseListener(this);
        // addQButton.addActionListener(this);
        sidePanel.add(addQButton);

       upQButton = new JButton("Update Question");
       upQButton.setBounds(0, 75, 185, 25);
       upQButton.setForeground(Color.WHITE);
       upQButton.setBackground(Color.BLUE);
       upQButton.setFont(new Font("Arial", Font.PLAIN, 20));
    //    upQButton.addMouseListener(this);
    //    upQButton.addActionListener(this);
        sidePanel.add(upQButton);


       delQButton = new JButton("Delete Question");
       delQButton.setBounds(0, 135, 185, 25);
       delQButton.setForeground(Color.WHITE);
       delQButton.setBackground(Color.BLUE);
       delQButton.setFont(new Font("Arial", Font.PLAIN, 20));
    // delQButton.addMouseListener(this);
    // delQButton.addActionListener(this);
        sidePanel.add(delQButton);

       seeResButton = new JButton("See Result");
       seeResButton.setBounds(0, 195, 185, 25);
       seeResButton.setForeground(Color.WHITE);
       seeResButton.setBackground(Color.BLUE);
       seeResButton.setFont(new Font("Arial", Font.PLAIN, 20));
    // seeResButton.addMouseListener(this);
    // seeResButton.addActionListener(this);
        sidePanel.add(seeResButton);

       showStuDeatilsButton = new JButton("Show Details");
       showStuDeatilsButton.setBounds(0, 255, 185, 25);
       showStuDeatilsButton.setForeground(Color.WHITE);
       showStuDeatilsButton.setBackground(Color.BLUE);
       showStuDeatilsButton.setFont(new Font("Arial", Font.PLAIN, 20));
    // showStuDeatilsButton.addMouseListener(this);
    // showStuDeatilsButton.addActionListener(this);
        sidePanel.add(showStuDeatilsButton);



        this.add(panel);


    }


    
}
