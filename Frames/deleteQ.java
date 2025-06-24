package Frames;

import java.lang.*;
import javax.swing.*;

import Entities.*;

import java.awt.*;
import java.awt.event.*;

public class deleteQ extends JFrame implements ActionListener{

    JLabel namelbl, deleteQLabel, qLabel, optionALabel, optionBLabel, optionCLabel, optionDLabel;
    JTextField qField, optionAField, optionBField, optionCField, optionDField;
    JComboBox combo;
    JButton logOutButton, backButton, addQButton, upQButton, delQButton, seeResButton, showStuDeatilsButton, delButton;
    JPanel panel, topPanel, sidePanel;
    ImageIcon icon, adminIcon, deleteQIcon;

    public deleteQ() {
        super("Delete Questions");
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
        upQButton.setForeground(Color.WHITE);
        upQButton.setBackground(Color.BLUE);
        upQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(upQButton);

        delQButton = new JButton("Delete Question");
        delQButton.setBounds(0, 135, 185, 25);
        delQButton.setForeground(Color.BLUE);
        delQButton.setBackground(Color.WHITE);
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

        // Mid part - delete icon
        deleteQIcon = new ImageIcon(getClass().getResource("../Images/deleteQ.png"));
        Image scaledDeleteQImage = deleteQIcon.getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
        ImageIcon scaledDeleteQIconFinal = new ImageIcon(scaledDeleteQImage);
        JLabel deleteQJLabel = new JLabel(scaledDeleteQIconFinal);
        deleteQJLabel.setBounds(450, 60, 140, 140);
        panel.add(deleteQJLabel);

        // Delete Question text
        deleteQLabel = new JLabel("Delete Question");
        deleteQLabel.setBounds(430, 185, 200, 50);
        deleteQLabel.setFont(new Font("Arial", Font.BOLD, 24));
        deleteQLabel.setForeground(new Color(197, 68, 68));
        panel.add(deleteQLabel);

        // Question Label and Field
        qLabel = new JLabel("Question:");
        qLabel.setBounds(200, 220, 100, 50);
        qLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(qLabel);

        qField = new JTextField();
        qField.setBounds(200, 260, 500, 45);
        qField.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(qField);

        // Combo Box for department
        String items[] = new String[]{"CSE", "CS", "CSSE", "SE", "CIS"};
        combo = new JComboBox(items);
        combo.setBounds(750, 260, 100, 30);
        combo.setFont(new Font("Arial", Font.BOLD, 14));
        combo.setBackground(Color.WHITE);
        combo.setForeground(Color.BLUE);
        panel.add(combo);

        // // Option A
        // optionALabel = new JLabel("Option A:");
        // optionALabel.setBounds(200, 320, 100, 30);
        // optionALabel.setFont(new Font("Arial", Font.BOLD, 16));
        // panel.add(optionALabel);

        // optionAField = new JTextField();
        // optionAField.setBounds(300, 320, 400, 30);
        // optionAField.setFont(new Font("Arial", Font.PLAIN, 15));
        // panel.add(optionAField);

        // // Option B
        // optionBLabel = new JLabel("Option B:");
        // optionBLabel.setBounds(200, 360, 100, 30);
        // optionBLabel.setFont(new Font("Arial", Font.BOLD, 16));
        // panel.add(optionBLabel);

        // optionBField = new JTextField();
        // optionBField.setBounds(300, 360, 400, 30);
        // optionBField.setFont(new Font("Arial", Font.PLAIN, 15));
        // panel.add(optionBField);

        // // Option C
        // optionCLabel = new JLabel("Option C:");
        // optionCLabel.setBounds(200, 400, 100, 30);
        // optionCLabel.setFont(new Font("Arial", Font.BOLD, 16));
        // panel.add(optionCLabel);

        // optionCField = new JTextField();
        // optionCField.setBounds(300, 400, 400, 30);
        // optionCField.setFont(new Font("Arial", Font.PLAIN, 15));
        // panel.add(optionCField);

        // // Option D
        // optionDLabel = new JLabel("Option D:");
        // optionDLabel.setBounds(200, 440, 100, 30);
        // optionDLabel.setFont(new Font("Arial", Font.BOLD, 16));
        // panel.add(optionDLabel);

        // optionDField = new JTextField();
        // optionDField.setBounds(300, 440, 400, 30);
        // optionDField.setFont(new Font("Arial", Font.PLAIN, 15));
        // panel.add(optionDField);

        // Delete button
        delButton = new JButton("Delete");
        delButton.setBounds(200, 350, 140, 45);
        delButton.setForeground(Color.RED);
        delButton.setBackground(Color.WHITE);
        delButton.setFont(new Font("Arial", Font.BOLD, 24));
        delButton.addActionListener(this);
        panel.add(delButton);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae) {
        String question = qField.getText().trim();

        if (question.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    

        Question q = new Question();
        q.deleteQuestion(question);

        JOptionPane.showMessageDialog(null, "Question Deleted successfully!");

        qField.setText("");
        
    }
}
