package Frames;

import javax.swing.*;
import java.awt.*;

public class QuizPage extends JFrame{
    JLabel question, option1, option2, option3, option4, totalAnsweredTitle, rightAnsweredTitle, wrongAnsweredTitle, totalNumber, rightNumber, wrongNumber;
    Color bgColor, themeColor, themeSubColor, grayColor, redColor, greenColor;
    JPanel panel, leftpanel, bigLine, questionPanel, optionPanel1, optionPanel2, optionPanel3, optionPanel4;
    ImageIcon icon, sideImage, topImage, bottomImage;
    ButtonGroup optionsGroup;
    JButton nextButton;

    public QuizPage(){

        //basic setup
        super("Quiz");
        this.setSize(950,600);
        this.setLocationRelativeTo(null);

        bgColor = new Color(151, 174, 209);
        themeColor = new Color(41, 110, 214);
        themeSubColor = new Color(0, 6, 36);
        grayColor = new Color(110, 107, 106);
        redColor = new Color(220, 20, 10);
        greenColor = new Color(0, 150, 0);
        Font optionFont = new Font("Arial", Font.BOLD, 20);


        panel=new JPanel();
		panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.add(panel);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        
        

        leftpanel=new JPanel();
		leftpanel.setLayout(null);
        leftpanel.setBounds(0, 0, 380, 600);
        leftpanel.setBackground(Color.WHITE);
        panel.add(leftpanel);




        

        totalAnsweredTitle = new JLabel("Total Answered", SwingConstants.CENTER);
        totalAnsweredTitle.setBounds(0, 60, 380, 18);
        totalAnsweredTitle.setFont(new Font("Arial", Font.BOLD, 18));
        totalAnsweredTitle.setForeground(themeSubColor);
        leftpanel.add(totalAnsweredTitle);

        totalNumber = new JLabel("14/15", SwingConstants.CENTER);
        totalNumber.setBounds(0, 82, 380, 40);
        totalNumber.setFont(new Font("Arial", Font.BOLD, 40));
        totalNumber.setForeground(grayColor);
        leftpanel.add(totalNumber);

        rightAnsweredTitle = new JLabel("Right Answered", SwingConstants.CENTER);
        rightAnsweredTitle.setBounds(0, 140, 380, 18);
        rightAnsweredTitle.setFont(new Font("Arial", Font.BOLD, 18));
        rightAnsweredTitle.setForeground(themeSubColor);
        leftpanel.add(rightAnsweredTitle);

        rightNumber = new JLabel("8", SwingConstants.CENTER);
        rightNumber.setBounds(0, 162, 380, 40);
        rightNumber.setFont(new Font("Arial", Font.BOLD, 40));
        rightNumber.setForeground(greenColor);
        leftpanel.add(rightNumber);

        wrongAnsweredTitle = new JLabel("Wrong Answered", SwingConstants.CENTER);
        wrongAnsweredTitle.setBounds(0, 220, 380, 18);
        wrongAnsweredTitle.setFont(new Font("Arial", Font.BOLD, 18));
        wrongAnsweredTitle.setForeground(themeSubColor);
        leftpanel.add(wrongAnsweredTitle);

        wrongNumber = new JLabel("6", SwingConstants.CENTER);
        wrongNumber.setBounds(0, 242, 380, 40);
        wrongNumber.setFont(new Font("Arial", Font.BOLD, 40));
        wrongNumber.setForeground(redColor);
        leftpanel.add(wrongNumber);


        sideImage = new ImageIcon(getClass().getResource("../Images/quizPage.jpg"));
        Image scaledSideImage = sideImage.getImage().getScaledInstance(
            260, 260, Image.SCALE_SMOOTH
        );
        ImageIcon scaledSideImageFinal = new ImageIcon(scaledSideImage);
        JLabel labelSideImage = new JLabel(scaledSideImageFinal);
        labelSideImage.setBounds(50, 300, 260, 260);
        leftpanel.add(labelSideImage);

        bigLine=new JPanel();
		bigLine.setLayout(null);
        bigLine.setBounds(380, 0, 10, 600);
        bigLine.setBackground(themeSubColor);
        panel.add(bigLine);

        questionPanel=new JPanel();
		questionPanel.setLayout(null);
        questionPanel.setBounds(460, 80, 400, 100);
        questionPanel.setBackground(bgColor);
        panel.add(questionPanel);


        question = new JLabel("<html>Your long text that should wrap sdkjf alskdjf lksdjf lskadjf to the next line automatically....</html>");
        question.setBounds(20, 10, 360, 80); // same size as panel or adjusted
        question.setFont(new Font("Arial", Font.BOLD, 14));
        questionPanel.add(question);


        
        // Create the button group
            optionsGroup = new ButtonGroup();

            // === OPTION 1 ===
            optionPanel1 = new JPanel();
            optionPanel1.setLayout(null);
            optionPanel1.setBounds(460, 210, 400, 50);
            optionPanel1.setBackground(bgColor);
            panel.add(optionPanel1);

            // Option 1
            JRadioButton radioButton1 = new JRadioButton("This is option 1");
            radioButton1.setBounds(10, 0, 400, 50);
            radioButton1.setFont(optionFont);
            radioButton1.setBackground(bgColor);
            radioButton1.setForeground(themeSubColor);
            optionPanel1.add(radioButton1);
            optionsGroup.add(radioButton1);

            // Label for Option 1
            // option1 = new JLabel("This is option 1");
            // option1.setBounds(30, 10, 360, 30);
            // option1.setFont(new Font("Arial", Font.BOLD, 20));
            // option1.setForeground(themeSubColor);
            // optionPanel1.add(option1);

            // === OPTION 2 ===
            optionPanel2 = new JPanel();
            optionPanel2.setLayout(null);
            optionPanel2.setBounds(460, 270, 400, 50);
            optionPanel2.setBackground(bgColor);
            panel.add(optionPanel2);

            // Option 2
            JRadioButton radioButton2 = new JRadioButton("This is option 2");
            radioButton2.setBounds(10, 0, 400, 50);
            radioButton2.setFont(optionFont);
            radioButton2.setBackground(bgColor);
            radioButton2.setForeground(themeSubColor);
            optionPanel2.add(radioButton2);
            optionsGroup.add(radioButton2);

            // JLabel option2 = new JLabel("This is option 2");
            // option2.setBounds(30, 10, 360, 30);
            // option2.setFont(new Font("Arial", Font.BOLD, 20));            
            // option2.setForeground(themeSubColor);
            // optionPanel2.add(option2);

            // === OPTION 3 ===
            optionPanel3 = new JPanel();
            optionPanel3.setLayout(null);
            optionPanel3.setBounds(460, 330, 400, 50);
            optionPanel3.setBackground(bgColor);
            panel.add(optionPanel3);

            JRadioButton radioButton3 = new JRadioButton("This is option 3");
            radioButton3.setBounds(10,0, 400, 50);
            radioButton3.setFont(optionFont);
            radioButton3.setBackground(bgColor);
            radioButton3.setForeground(themeSubColor);
            optionPanel3.add(radioButton3);
            optionsGroup.add(radioButton3);

            // JLabel option3 = new JLabel("This is option 3");
            // option3.setBounds(30, 10, 360, 30);
            // option3.setFont(new Font("Arial", Font.BOLD, 20));
            // option3.setForeground(themeSubColor);

            // optionPanel3.add(option3);

            // === OPTION 4 ===
            optionPanel4 = new JPanel();
            optionPanel4.setLayout(null);
            optionPanel4.setBounds(460, 390, 400, 50);
            optionPanel4.setBackground(bgColor);
            panel.add(optionPanel4);

            // Option 4
            JRadioButton radioButton4 = new JRadioButton("This is option 4");
            radioButton4.setBounds(10, 0, 400, 50);
            radioButton4.setFont(optionFont);
            radioButton4.setBackground(bgColor);
            radioButton4.setForeground(themeSubColor);
            optionPanel4.add(radioButton4);
            optionsGroup.add(radioButton4);

            nextButton = new JButton("Next");
            nextButton.setBounds(760, 460, 100, 40);
            nextButton.setForeground(Color.WHITE);
            nextButton.setBackground(themeSubColor);
            nextButton.setFont(new Font("Arial", Font.BOLD, 14));

            panel.add(nextButton);
    }
}
