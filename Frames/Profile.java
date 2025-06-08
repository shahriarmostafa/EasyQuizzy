package Frames;

import javax.swing.*;
import java.awt.*;

public class Profile extends JFrame{
    JLabel nameLabel, proshongshaLabel, labelProfileImage, titleLabel, labelPeopleImage, motivationLabel1, motivationLabel2, boxTitile1, boxTitile2, boxTitile3, boxTitile4, boxNumber1, boxNumber2, boxNumber3, boxNumber4;
    ImageIcon profileImage, icon, scaledImageProfilelogoFinal, peopleImage, scaledImagePeopleFinal, roundLogo;
    JButton backbtn, logOutButton;
    Color themeColor, themeSubColor, creameColor;
    JPanel panel, topPanel, leftpanel, boxPanel1,boxPanel2, boxPanel3, boxPanel4;
    public Profile(){

    }

    public Profile(String Name){
        super("User Profile");
        this.setSize(950,600);
        this.setLocationRelativeTo(null);

        themeColor = new Color(41, 110, 214);
        themeSubColor = new Color(0, 6, 36);
        creameColor = new Color(255, 253, 208);

        panel=new JPanel();
		panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.add(panel);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        profileImage = new ImageIcon(getClass().getResource("../Images/profile-blue.png"));
        Image scaledImageProfilelogo = profileImage.getImage().getScaledInstance(
            150, 150, Image.SCALE_SMOOTH
        );
        scaledImageProfilelogoFinal = new ImageIcon(scaledImageProfilelogo);
        labelProfileImage = new JLabel(scaledImageProfilelogoFinal);
        labelProfileImage.setBounds(115, 40, 150, 150);
        panel.add(labelProfileImage);

        //mid part
        nameLabel = new JLabel(Name, SwingConstants.CENTER);
        nameLabel.setBounds(0, 190, 380, 30);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 30));
        // hiNameLabel.setForeground(Color.WHITE);
        panel.add(nameLabel);

        titleLabel = new JLabel("STUDENT IN EASYQUIZZY", SwingConstants.CENTER);
        titleLabel.setBounds(0, 225, 380, 10);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 10));
        titleLabel.setForeground(themeColor);
        panel.add(titleLabel);


        peopleImage = new ImageIcon(getClass().getResource("../Images/profilebottom.png"));
        Image scaledImagePeople = peopleImage.getImage().getScaledInstance(
            288, 255, Image.SCALE_SMOOTH
        );
        scaledImagePeopleFinal = new ImageIcon(scaledImagePeople);
        labelPeopleImage = new JLabel(scaledImagePeopleFinal);
        labelPeopleImage.setBounds(46, 280, 288, 255);
        panel.add(labelPeopleImage);

        leftpanel = new JPanel();
        leftpanel.setBounds(0, 0, 380, 600);
        leftpanel.setBackground(creameColor);
        panel.add(leftpanel);


        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(805, 40, 100, 40);
        logOutButton.setForeground(Color.WHITE);
        logOutButton.setBackground(themeColor);
        logOutButton.setFont(new Font("Arial", Font.BOLD, 14));
        // logOutButton.addMouseListener(this);
        // logOutButton.addActionListener(this);
        panel.add(logOutButton);

        backbtn = new JButton("Back");
        backbtn.setBounds(690, 40, 100, 40);
        backbtn.setForeground(Color.WHITE);
        backbtn.setBackground(themeColor);
        backbtn.setFont(new Font("Arial", Font.BOLD, 14));
        // logOutButton.addMouseListener(this);
        // logOutButton.addActionListener(this);
        panel.add(backbtn);


        
        roundLogo = new ImageIcon(getClass().getResource("../Images/logo2.png"));
        Image scaledImageRlogo = roundLogo.getImage().getScaledInstance(
            82, 62, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageRlogoFinal = new ImageIcon(scaledImageRlogo);
        JLabel labelRoundLogo = new JLabel(scaledImageRlogoFinal);
        labelRoundLogo.setBounds(420, 29, 82, 62);
        panel.add(labelRoundLogo);



        // topPanel = new JPanel();
        // topPanel.setBounds(380, 0, 570, 70);
        // topPanel.setBackground(themeColor);
        // panel.add(topPanel);

        boxPanel1 = new JPanel();
        boxPanel1.setLayout(null);
        boxPanel1.setBounds(436, 120, 200, 150);
        boxPanel1.setBackground(themeSubColor);
        panel.add(boxPanel1);

        boxPanel2 = new JPanel();
        boxPanel2.setLayout(null);
        boxPanel2.setBounds(692, 120, 200, 150);
        boxPanel2.setBackground(themeSubColor);
        panel.add(boxPanel2);

        boxPanel3 = new JPanel();
        boxPanel3.setLayout(null);
        boxPanel3.setBounds(436, 320, 200, 150);
        boxPanel3.setBackground(themeSubColor);
        panel.add(boxPanel3);

        boxPanel4 = new JPanel();
        boxPanel4.setLayout(null);
        boxPanel4.setBounds(692, 320, 200, 150);
        boxPanel4.setBackground(themeSubColor);
        panel.add(boxPanel4);


        boxTitile1 = new JLabel("Username", SwingConstants.CENTER);
        boxTitile1.setBounds(0, 45, 200, 18);
        boxTitile1.setFont(new Font("Arial", Font.BOLD, 18));
        boxTitile1.setForeground(themeColor);
        boxPanel1.add(boxTitile1);

        boxNumber1 = new JLabel("shihab123", SwingConstants.CENTER);
        boxNumber1.setBounds(0,70, 200, 40);
        boxNumber1.setFont(new Font("Arial", Font.BOLD, 25));
        boxNumber1.setForeground(Color.WHITE);
        boxPanel1.add(boxNumber1);

        boxTitile2 = new JLabel("Quiz Attended", SwingConstants.CENTER);
        boxTitile2.setBounds(0, 45, 200, 18);
        boxTitile2.setFont(new Font("Arial", Font.BOLD, 18));
        boxTitile2.setForeground(themeColor);
        boxPanel2.add(boxTitile2);

        boxNumber2 = new JLabel("12", SwingConstants.CENTER);
        boxNumber2.setBounds(0,70, 200, 40);
        boxNumber2.setFont(new Font("Arial", Font.BOLD, 40));
        boxNumber2.setForeground(Color.WHITE);
        boxPanel2.add(boxNumber2);

        boxTitile3 = new JLabel("Right Answered", SwingConstants.CENTER);
        boxTitile3.setBounds(0, 45, 200, 18);
        boxTitile3.setFont(new Font("Arial", Font.BOLD, 18));
        boxTitile3.setForeground(themeColor);
        boxPanel3.add(boxTitile3);

        boxNumber3 = new JLabel("12", SwingConstants.CENTER);
        boxNumber3.setBounds(0,70, 200, 40);
        boxNumber3.setFont(new Font("Arial", Font.BOLD, 40));
        boxNumber3.setForeground(Color.WHITE);
        boxPanel3.add(boxNumber3);

        boxTitile4 = new JLabel("Last Quiz Marks", SwingConstants.CENTER);
        boxTitile4.setBounds(0, 45, 200, 18);
        boxTitile4.setFont(new Font("Arial", Font.BOLD, 18));
        boxTitile4.setForeground(themeColor);
        boxPanel4.add(boxTitile4);

        boxNumber4 = new JLabel("25", SwingConstants.CENTER);
        boxNumber4.setBounds(0,70, 200, 40);
        boxNumber4.setFont(new Font("Arial", Font.BOLD, 40));
        boxNumber4.setForeground(Color.WHITE);
        boxPanel4.add(boxNumber4);

        //mid part
        motivationLabel1 = new JLabel("Every question you answer brings you one step closer to your goals.", SwingConstants.CENTER);
        motivationLabel1.setBounds(380, 500, 570, 12);
        motivationLabel1.setFont(new Font("Arial", Font.BOLD, 12));
        motivationLabel1.setForeground(themeColor);
        panel.add(motivationLabel1);
        
        motivationLabel2 = new JLabel("Keep pushing, keep learning, and success will follow!", SwingConstants.CENTER);
        motivationLabel2.setBounds(380, 515, 570, 12);
        motivationLabel2.setFont(new Font("Arial", Font.BOLD, 12));
        panel.add(motivationLabel2);
        


        

        



    }
}
