package Frames;

import java.awt.*;

import javax.swing.*;

public class Subject extends JFrame{
        JPanel panel, subjectPanel1, subjectPanel2, subjectPanel3, subjectPanel4, subjectPanel5, subjectPanel6;
        JButton backButton, subjectButton1, subjectButton2, subjectButton3, subjectButton4, subjectButton5, subjectButton6;
        JLabel pageTitle, subject1, subject2, subject3, subject4, subject5, subject6;
        Color themeColor, themeSubColor, pink, red, orange, yellow, green, gray;
        ImageIcon icon;

        public Subject(){
            super("Select a Subject");
            this.setSize(400,700);
            this.setLocationRelativeTo(null);

            themeColor = new Color(41, 110, 214);
            themeSubColor = new Color(0, 6, 36);
            gray = new Color(110, 107, 106);
            pink = new Color(195, 55, 90);
            red = new Color(235, 101, 72);
            orange = new Color(204, 50, 50);   // ~20% darker
            yellow = new Color(200, 163, 40);   // ~20% darker
            green  = new Color(85, 123, 180);    // ~20% darker


            panel=new JPanel();
            panel.setLayout(null);
            panel.setBackground(Color.WHITE);
            this.add(panel);

            icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
            this.setIconImage(icon.getImage());

            pageTitle = new JLabel("Select a Subject", SwingConstants.CENTER);
            pageTitle.setBounds(0, 35, 400, 30);
            pageTitle.setForeground(themeSubColor);
            pageTitle.setFont(new  Font("Arial", Font.BOLD, 30));
            panel.add(pageTitle);


            subjectButton1 = new JButton("Math");
            subjectButton1.setBounds(43, 100, 130, 120);
            subjectButton1.setBackground(gray);
            subjectButton1.setForeground(Color.WHITE);
            subjectButton1.setFont(new Font("Arial", Font.BOLD, 18));
            panel.add(subjectButton1);

            subjectButton2 = new JButton("English");
            subjectButton2.setBounds(216, 100, 130, 120);
            subjectButton2.setBackground(red);
            subjectButton2.setForeground(Color.WHITE);
            subjectButton2.setFont(new Font("Arial", Font.BOLD, 18));
            panel.add(subjectButton2);

            subjectButton3 = new JButton("Physics");
            subjectButton3.setBounds(43, 273, 130, 120);
            subjectButton3.setBackground(green);
            subjectButton3.setForeground(Color.WHITE);
            subjectButton3.setFont(new Font("Arial", Font.BOLD, 18));
            panel.add(subjectButton3);

            subjectButton4 = new JButton("Chemistry");
            subjectButton4.setBounds(216, 273, 130, 120);
            subjectButton4.setBackground(orange);
            subjectButton4.setForeground(Color.WHITE);
            subjectButton4.setFont(new Font("Arial", Font.BOLD, 18));
            panel.add(subjectButton4);

            subjectButton5 = new JButton("Biology");
            subjectButton5.setBounds(43, 446, 130, 120);
            subjectButton5.setBackground(yellow);
            subjectButton5.setForeground(Color.WHITE);
            subjectButton5.setFont(new Font("Arial", Font.BOLD, 18));
            panel.add(subjectButton5);

            subjectButton6 = new JButton("History");
            subjectButton6.setBounds(216, 446, 130, 120);
            subjectButton6.setBackground(pink);
            subjectButton6.setForeground(Color.WHITE);
            subjectButton6.setFont(new Font("Arial", Font.BOLD, 18));
            panel.add(subjectButton6);

            backButton = new JButton("Back");
            backButton.setBounds(150, 595, 100, 40);
            backButton.setBackground(themeSubColor);
            backButton.setForeground(Color.WHITE);
            backButton.setFont(new Font("Arial", Font.BOLD, 14));
            panel.add(backButton);







        }
}
