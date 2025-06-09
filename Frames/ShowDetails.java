package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class ShowDetails extends JFrame {

    JPanel panel, topPanel, sidePanel;
    JLabel namelbl;
    JButton backButton, logOutButton, addQButton, upQButton, delQButton, seeResButton, showStuDetailsButton, showDetailsButton;
    ImageIcon icon, adminIcon, showDetailsIcon;

    public ShowDetails() {
        super("Show Student Details");
        this.setSize(950, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        // Log Out button
        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(805, 7, 100, 30);
        logOutButton.setForeground(Color.BLUE);
        logOutButton.setBackground(Color.WHITE);
        logOutButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(logOutButton);

        // Back button
        backButton = new JButton("Back");
        backButton.setBounds(700, 7, 100, 30);
        backButton.setForeground(Color.BLUE);
        backButton.setBackground(Color.WHITE);
        backButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(backButton);

        // Side panel
        sidePanel = new JPanel();
        sidePanel.setLayout(null);
        sidePanel.setBounds(0, 0, 185, 600);
        sidePanel.setBackground(Color.BLUE);
        panel.add(sidePanel);

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

        showStuDetailsButton = new JButton("Show Details");
        showStuDetailsButton.setBounds(0, 255, 185, 25);
        showStuDetailsButton.setForeground(Color.BLUE);
        showStuDetailsButton.setBackground(Color.WHITE);
        showStuDetailsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(showStuDetailsButton);

        // Mid part
        showDetailsIcon = new ImageIcon(getClass().getResource("../Images/showDetails.png"));
        Image scaledImage = showDetailsIcon.getImage().getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        JLabel imgLabel = new JLabel(new ImageIcon(scaledImage));
        imgLabel.setBounds(450, 60, 140, 140);
        panel.add(imgLabel);

        JLabel textLabel = new JLabel("Show Student Details");
        textLabel.setBounds(380, 185, 300, 50);
        textLabel.setFont(new Font("Arial", Font.BOLD, 24));
        textLabel.setForeground(new Color(70, 138, 59));
        panel.add(textLabel);

        // showDetailsButton = new JButton("Show Details");
        // showDetailsButton.setBounds(400, 290, 150, 35);
        // showDetailsButton.setForeground(new Color(70, 138, 59));
        // showDetailsButton.setBackground(Color.WHITE);
        // showDetailsButton.setFont(new Font("Arial", Font.BOLD, 16));
        // panel.add(showDetailsButton);
    }
}
