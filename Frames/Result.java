package Frames;

import javax.swing.*;
import java.awt.*;

public class Result extends JFrame{
    JLabel congratulationTitle, name, result, resultTitle, resultMotivation;
    ImageIcon icon, resultFrame, cornerDecoration, cornerDecoration2;
    Color themeColor, themeSubColor, pink, orange, red, green;
    JButton home;
    JPanel panel;

    public Result(){
        super("Quiz Result");
        this.setSize(950, 600);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.add(panel);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());


        themeColor = new Color(41, 110, 214);
        themeSubColor = new Color(0, 6, 36);
        pink = new Color(195, 55, 90);
        orange = new Color(204, 50, 50);   // ~20% darker
        red = new Color(255, 10, 15);
        green  = new Color(100, 255, 5);    // ~20% darker

        congratulationTitle = new JLabel("CONGRATULATIONS", SwingConstants.CENTER);
        congratulationTitle.setBounds(0, 70, 950, 25);
        congratulationTitle.setFont(new Font("Arial", Font.BOLD, 25));
        congratulationTitle.setForeground(orange);
        panel.add(congratulationTitle);


        name = new JLabel(("SHIHAB UDDIN BHUIYAN").toUpperCase(), SwingConstants.CENTER);
        name.setBounds(0, 100, 950, 35);
        name.setFont(new Font("Arial", Font.BOLD, 35));
        name.setForeground(themeSubColor);
        panel.add(name);

       

        

        resultTitle = new JLabel("YOUR SCORE", SwingConstants.CENTER);
        resultTitle.setBounds(0, 315, 950, 14);
        resultTitle.setFont(new Font("", Font.BOLD, 14));
        resultTitle.setForeground(red);
        panel.add(resultTitle);

        result = new JLabel("12", SwingConstants.CENTER);
        result.setBounds(0, 268, 950, 45);
        result.setFont(new Font("Arial", Font.BOLD, 45));
        result.setForeground(green);
        panel.add(result);


        resultFrame = new ImageIcon(getClass().getResource("../Images/resultFrame.png"));
        Image scaledImageRFrame = resultFrame.getImage().getScaledInstance(
            250, 250, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageRFrameFinal = new ImageIcon(scaledImageRFrame);
        JLabel labelResultFrame = new JLabel(scaledImageRFrameFinal);
        labelResultFrame.setBounds(348, 170, 250, 250);
        panel.add(labelResultFrame);


        home = new JButton("Go Home");
        home.setBounds(410, 500, 120, 40);
        home.setBackground(green);
        home.setForeground(Color.WHITE);
        home.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(home);


        resultMotivation = new JLabel("<html> <body style='text-align:center;''>Great job! Every quiz is a step closer to mastery—keep going,<br> you are doing amazing!</body></html>", SwingConstants.CENTER);
        resultMotivation.setBounds(0, 440, 950, 35);
        resultMotivation.setFont(new Font("Arial", Font.BOLD, 15));
        resultMotivation.setForeground(themeSubColor);
        panel.add(resultMotivation);

        cornerDecoration = new ImageIcon(getClass().getResource("../Images/cornerFlowerLeft.jpg"));
        Image scaledImageCDecoration = cornerDecoration.getImage().getScaledInstance(
            350, 350, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageDecorationFinal = new ImageIcon(scaledImageCDecoration);
        JLabel labelCDecoration = new JLabel(scaledImageDecorationFinal);
        labelCDecoration.setBounds(0, 235, 350, 350);
        panel.add(labelCDecoration);

        cornerDecoration2 = new ImageIcon(getClass().getResource("../Images/cornerFlowerRight.jpg"));
        Image scaledImageCDecoration2 = cornerDecoration2.getImage().getScaledInstance(
            350, 350, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageDecorationFinal2 = new ImageIcon(scaledImageCDecoration2);
        JLabel labelCDecoration2 = new JLabel(scaledImageDecorationFinal2);
        labelCDecoration2.setBounds(600, 235, 350, 350);
        panel.add(labelCDecoration2);


    }
}
