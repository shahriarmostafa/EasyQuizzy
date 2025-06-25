package Frames;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Subject extends JFrame implements ActionListener {
    JPanel panel, subjectPanel1, subjectPanel2, subjectPanel3, subjectPanel4, subjectPanel5, subjectPanel6;
    JButton backButton, subjectButton1, subjectButton2, subjectButton3, subjectButton4, subjectButton5, subjectButton6;
    JLabel pageTitle, subject1, subject2, subject3, subject4, subject5, subject6;
    Color themeColor, themeSubColor, pink, red, orange, yellow, green, gray;
    ImageIcon icon, subject;
    private String username;

    public Subject(String username) {
        super("Select a Subject");
        this.setSize(960, 600);
        this.setLocationRelativeTo(null);
        this.username = username;

        themeColor = new Color(41, 110, 214);
        themeSubColor = new Color(0, 6, 36);
        gray = new Color(110, 107, 106);
        pink = new Color(195, 55, 90);
        red = new Color(235, 101, 72);
        orange = new Color(204, 50, 50);   // ~20% darker
        yellow = new Color(200, 163, 40);  // ~20% darker
        green = new Color(85, 123, 180);   // ~20% darker

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.add(panel);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        pageTitle = new JLabel("Select a Subject", SwingConstants.CENTER);
        pageTitle.setBounds(90, 35, 400, 30);
        pageTitle.setForeground(themeSubColor);
        pageTitle.setFont(new Font("Arial", Font.BOLD, 30));
        panel.add(pageTitle);

        subject = new ImageIcon(getClass().getResource("../Images/sub.jpg"));
        Image scaledImage = subject.getImage().getScaledInstance(360, 360, Image.SCALE_SMOOTH); // smaller image
        JLabel imgLabel = new JLabel(new ImageIcon(scaledImage));
        imgLabel.setBounds(520, 100, 360, 360); 
        panel.add(imgLabel);


        subjectButton1 = new JButton("CSE");
        subjectButton1.setBounds(140, 100, 130, 90);
        subjectButton1.setBackground(gray);
        subjectButton1.setForeground(Color.WHITE);
        subjectButton1.setFont(new Font("Arial", Font.BOLD, 20));
        subjectButton1.addActionListener(this);
        panel.add(subjectButton1);

        subjectButton2 = new JButton("EEE");
        subjectButton2.setBounds(310, 100, 130, 90);
        subjectButton2.setBackground(red);
        subjectButton2.setForeground(Color.WHITE);
        subjectButton2.setFont(new Font("Arial", Font.BOLD, 20));
        subjectButton2.addActionListener(this);
        panel.add(subjectButton2);

        subjectButton3 = new JButton("English");
        subjectButton3.setBounds(140, 230, 130, 90);
        subjectButton3.setBackground(green);
        subjectButton3.setForeground(Color.WHITE);
        subjectButton3.setFont(new Font("Arial", Font.BOLD, 20));
        subjectButton3.addActionListener(this);
        panel.add(subjectButton3);

        subjectButton4 = new JButton("BBA");
        subjectButton4.setBounds(310, 230, 130, 90);
        subjectButton4.setBackground(orange);
        subjectButton4.setForeground(Color.WHITE);
        subjectButton4.setFont(new Font("Arial", Font.BOLD, 20));
        subjectButton4.addActionListener(this);
        panel.add(subjectButton4);

        subjectButton5 = new JButton("Arch");
        subjectButton5.setBounds(140, 360, 130,90);
        subjectButton5.setBackground(yellow);
        subjectButton5.setForeground(Color.WHITE);
        subjectButton5.setFont(new Font("Arial", Font.BOLD, 20)); 
        subjectButton5.addActionListener(this);
        panel.add(subjectButton5);

        subjectButton6 = new JButton("History");
        subjectButton6.setBounds(310, 360, 130, 90);
        subjectButton6.setBackground(pink);
        subjectButton6.setForeground(Color.WHITE);
        subjectButton6.setFont(new Font("Arial", Font.BOLD, 20));
        subjectButton6.addActionListener(this);
        panel.add(subjectButton6);

        backButton = new JButton("Back");
        backButton.setBounds(240, 480, 100, 40);
        backButton.setBackground(themeSubColor);
        backButton.setForeground(Color.WHITE);
        backButton.setFont(new Font("Arial", Font.BOLD, 14));
        backButton.addActionListener(this);
        panel.add(backButton);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == subjectButton1 || ae.getSource() == subjectButton2 || ae.getSource() == subjectButton3 || ae.getSource() == subjectButton4 || ae.getSource() == subjectButton5 || ae.getSource() == subjectButton6) {
            String selectedSubject = ((JButton) ae.getSource()).getText();
            QuizPage q1 = new QuizPage(selectedSubject, username);
            q1.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() == backButton){
            HomePage home = new HomePage(username);
            home.setVisible(true);
            this.setVisible(false);
        }
    }
}
