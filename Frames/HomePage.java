package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

public class HomePage extends JFrame {


    JLabel namelbl, hiNameLabel, attendExamLabel;
	JTextField namefld;
	JButton backbtn, logOutButton, attendQuiz;
    Color themeColor;
    ImageIcon icon, roundLogo;
	JPanel panel, topPanel;
    
    public HomePage(){

    }

    public HomePage(String fullName)
    {

        //basic setup
        super("Homepage");
        this.setSize(950,600);
        this.setLocationRelativeTo(null);

        themeColor = new Color(41, 110, 214);

        panel=new JPanel();
		panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());


        

        roundLogo = new ImageIcon(getClass().getResource("../Images/roundLogo.png"));
        Image scaledImageRlogo = roundLogo.getImage().getScaledInstance(
            60, 60, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageRlogoFinal = new ImageIcon(scaledImageRlogo);
        JLabel labelRoundLogo = new JLabel(scaledImageRlogoFinal);
        labelRoundLogo.setBounds(30, 15, 60, 60);
        panel.add(labelRoundLogo);

        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(805, 25, 100, 40);
        logOutButton.setForeground(themeColor);
        logOutButton.setBackground(Color.WHITE);
        logOutButton.setFont(new Font("Arial", Font.BOLD, 14));
        // logOutButton.addMouseListener(this);
        // logOutButton.addActionListener(this);
        panel.add(logOutButton);
        

        //top part
        topPanel = new JPanel();
        topPanel.setBounds(0, 0, 950, 90);
        topPanel.setBackground(themeColor);
        panel.add(topPanel);


        //mid part
        hiNameLabel = new JLabel("Hi, " + fullName, SwingConstants.CENTER);
        hiNameLabel.setBounds(0, 150, 950, 30);
        hiNameLabel.setFont(new Font("Arial", Font.BOLD, 30));
        hiNameLabel.setForeground(themeColor);
        panel.add(hiNameLabel);

        attendExamLabel = new JLabel("Attend the latest Quiz?", SwingConstants.CENTER);
        attendExamLabel.setBounds(0, 180, 950, 30);
        attendExamLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(attendExamLabel);

        attendQuiz = new JButton("Attend Now!");
        attendQuiz.setBounds(415, 215, 120, 45);
        attendQuiz.setForeground(Color.BLACK);
        attendQuiz.setBackground(themeColor);
        attendQuiz.setFont(new Font("Arial", Font.BOLD, 14));
        // logOutButton.addMouseListener(this);
        // logOutButton.addActionListener(this);
        panel.add(attendQuiz);

        

        


        this.add(panel);


    }
    
}
