package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class SeeResult extends JFrame {

    JLabel namelbl, seeResultLabel;
    JButton logOutButton, backButton, addQButton, upQButton, delQButton, seeResButton, showStuDeatilsButton, seeResultBtn;
    JPanel panel, topPanel, sidePanel;
    ImageIcon icon, adminIcon, seeResultIcon;

    public SeeResult() {
        super("See Result");
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
        delQButton.setForeground(Color.WHITE);
        delQButton.setBackground(Color.BLUE);
        delQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(delQButton);

        seeResButton = new JButton("See Result");
        seeResButton.setBounds(0, 195, 185, 25);
        seeResButton.setForeground(Color.BLUE);
        seeResButton.setBackground(Color.WHITE);
        seeResButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(seeResButton);

        showStuDeatilsButton = new JButton("Show Details");
        showStuDeatilsButton.setBounds(0, 255, 185, 25);
        showStuDeatilsButton.setForeground(Color.WHITE);
        showStuDeatilsButton.setBackground(Color.BLUE);
        showStuDeatilsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(showStuDeatilsButton);

        // Middle part - See Result Image
        seeResultIcon = new ImageIcon(getClass().getResource("../Images/seeResult.png"));
        Image scaledSeeImage = seeResultIcon.getImage().getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        ImageIcon scaledSeeImageFinal = new ImageIcon(scaledSeeImage);
        JLabel seeResultImgLabel = new JLabel(scaledSeeImageFinal);
        seeResultImgLabel.setBounds(450, 60, 140, 140);
        panel.add(seeResultImgLabel);

        // "See Result" text
        seeResultLabel = new JLabel("See Result");
        seeResultLabel.setBounds(445, 200, 200, 50);
        seeResultLabel.setFont(new Font("Arial", Font.BOLD, 24));
        seeResultLabel.setForeground(new Color(70, 138, 59));
        panel.add(seeResultLabel);

        // // See Result Button
        // seeResultBtn = new JButton("See Result");
        // seeResultBtn.setBounds(450, 260, 140, 40);
        // seeResultBtn.setForeground(new Color(70, 138, 59));
        // seeResultBtn.setBackground(Color.WHITE);
        // seeResultBtn.setFont(new Font("Arial", Font.BOLD, 16));
        // panel.add(seeResultBtn);

        this.add(panel);
    }

    
}
