package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class UpQuestions extends JFrame {

    JLabel namelbl, addQLabel, qLabel, optionALabel, optionBLabel, optionCLabel, optionDLabel,ansLabel,oldQLabel;
    JTextField qField, optionAField, optionBField, optionCField, optionDField,ansField,oldQField;
    JComboBox  combo;
    JButton logOutButton, backButton, addQButton, upQButton, delQButton, seeResButton, showStuDeatilsButton, upButton;
    JPanel panel, topPanel, sidePanel;
    ImageIcon icon, adminIcon, upQIcon;

    public UpQuestions() {
        super("Update Questions");
        this.setSize(950, 600);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        // Admin icon
        adminIcon = new ImageIcon(getClass().getResource("../Images/adminIcon.png"));
        Image scaledImageRlogo = adminIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon scaledImageRlogoFinal = new ImageIcon(scaledImageRlogo);
        JLabel adminLbl = new JLabel(scaledImageRlogoFinal);
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
        sidePanel.setBackground(Color.BLUE);
        panel.add(sidePanel);

        // Sidebar buttons
        addQButton = new JButton("Add Question");
        addQButton.setBounds(0, 15, 185, 25);
        addQButton.setForeground(Color.WHITE);
        addQButton.setBackground(Color.BLUE);
        addQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(addQButton);

        upQButton = new JButton("Update Question");
        upQButton.setBounds(0, 75, 185, 25);
        upQButton.setForeground(Color.BLUE);
        upQButton.setBackground(Color.WHITE);
        upQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(upQButton);

        delQButton = new JButton("Delete Question");
        delQButton.setBounds(0, 135, 185, 25);
        delQButton.setForeground(Color.WHITE);
        delQButton.setBackground(Color.BLUE);
        delQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(delQButton);

        seeResButton = new JButton("See Result");
        seeResButton.setBounds(0, 195, 185, 25);
        seeResButton.setForeground(Color.WHITE);
        seeResButton.setBackground(Color.BLUE);
        seeResButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(seeResButton);

        showStuDeatilsButton = new JButton("Show Details");
        showStuDeatilsButton.setBounds(0, 255, 185, 25);
        showStuDeatilsButton.setForeground(Color.WHITE);
        showStuDeatilsButton.setBackground(Color.BLUE);
        showStuDeatilsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(showStuDeatilsButton);

        // Mid part - update icon
        upQIcon = new ImageIcon(getClass().getResource("../Images/upQ.png"));
        Image scaledUpQImage = upQIcon.getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
        ImageIcon scaledUpQIconFinal = new ImageIcon(scaledUpQImage);
        JLabel upQJLabel = new JLabel(scaledUpQIconFinal);
        upQJLabel.setBounds(450, 50, 140, 140);
        panel.add(upQJLabel);

        // Update Question text
        addQLabel = new JLabel("Update Question");
        addQLabel.setBounds(430, 170, 200, 50);
        addQLabel.setFont(new Font("Arial", Font.BOLD, 24));
        addQLabel.setForeground(new Color(70, 138, 59));
        panel.add(addQLabel);

        //old q
        oldQLabel = new JLabel("Old Question:");
        oldQLabel.setBounds(200, 200, 200, 50);
        oldQLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(oldQLabel);

        oldQField = new JTextField();
        oldQField.setBounds(200, 240, 500, 30);
        oldQField.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(oldQField);



        // Question Label and Field
        qLabel = new JLabel("Question:");
        qLabel.setBounds(200, 260, 100, 50);
        qLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(qLabel);

        qField = new JTextField();
        qField.setBounds(200, 300, 500, 30);
        qField.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(qField);

        // Combo Box for department
        String[] items = {"CSE", "CS", "CSSE", "SE", "CIS"};
        combo = new JComboBox<>(items);
        combo.setBounds(750, 240, 100, 30);
        combo.setFont(new Font("Arial", Font.BOLD, 14));
        combo.setBackground(Color.WHITE);
        combo.setForeground(Color.BLUE);
        panel.add(combo);

        // Option A
        optionALabel = new JLabel("Option A:");
        optionALabel.setBounds(200, 340, 100, 30);
        optionALabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(optionALabel);

        optionAField = new JTextField();
        optionAField.setBounds(300, 340, 400, 30);
        optionAField.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(optionAField);

        // Option B
        optionBLabel = new JLabel("Option B:");
        optionBLabel.setBounds(200, 380, 100, 30);
        optionBLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(optionBLabel);

        optionBField = new JTextField();
        optionBField.setBounds(300, 380, 400, 30);
        optionBField.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(optionBField);

        // Option C
        optionCLabel = new JLabel("Option C:");
        optionCLabel.setBounds(200, 420, 100, 30);
        optionCLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(optionCLabel);

        optionCField = new JTextField();
        optionCField.setBounds(300, 420, 400, 30);
        optionCField.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(optionCField);

        // Option D
        optionDLabel = new JLabel("Option D:");
        optionDLabel.setBounds(200, 460, 100, 30);
        optionDLabel.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(optionDLabel);

        optionDField = new JTextField();
        optionDField.setBounds(300, 460, 400, 30);
        optionDField.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(optionDField);
        //ans
       ansLabel = new JLabel("Answer:");
       ansLabel.setBounds(200, 520, 100, 30);
       ansLabel.setForeground(new Color(70, 138, 59));
       ansLabel.setFont(new Font("Arial", Font.BOLD, 16));
       panel.add(ansLabel);
       
       ansField = new JTextField();
       ansField.setBounds(300, 520, 400, 30);
       ansField.setFont(new Font("Arial", Font.PLAIN, 15));
       panel.add(ansField);


       upButton = new JButton("Update");
       upButton.setBounds(750, 520, 100, 30);
       upButton.setForeground(new Color(70, 138, 59));
       upButton.setBackground(Color.WHITE);
       upButton.setFont(new Font("Arial", Font.BOLD, 16));
       // upButton.addActionListener(this);
       panel.add(upButton);

        this.add(panel);
    }


}
