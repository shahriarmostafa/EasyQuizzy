package Frames;

import javax.swing.*;
import java.awt.*;

public class Profile extends JFrame{
    JLabel nameLabel, proshongshaLabel;
    ImageIcon profileImage;
    JButton backbtn, logOutButton;
    Color themeColor, themeSubColor;
    JPanel panel, topPanel;
    public Profile(){

    }

    public Profile(String Name){
        super("User Profile");
        this.setSize(950,600);
        this.setLocationRelativeTo(null);

        themeColor = new Color(41, 110, 214);
        themeSubColor = new Color(0, 6, 36);
        panel=new JPanel();
		panel.setLayout(null);
        panel.setBackground(Color.WHITE);

    }
}
