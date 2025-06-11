package Frames;

import Entities.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class QuizPage extends JFrame implements ActionListener{
    JLabel question, totalAnsweredTitle, rightAnsweredTitle, wrongAnsweredTitle, totalNumber, rightNumber, wrongNumber;
    Color bgColor, themeColor, themeSubColor, grayColor, redColor, greenColor;
    JPanel panel, leftpanel, bigLine, questionPanel, optionPanel1, optionPanel2, optionPanel3, optionPanel4;
    ImageIcon icon, sideImage;
    ButtonGroup optionsGroup;
    JButton nextButton;

    String username;

    // Radio buttons as fields so we can update text later
    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;

    // Array of filtered questions
    Question[] questions;
    int currentIndex = 0;

    // Stats counters
    int totalAnswered = 0;
    int rightAnswered = 0;
    int wrongAnswered = 0;

    public QuizPage(){}

    public QuizPage(String selectedDepartment, String username) {

        // Basic setup
        super("Quiz");
        this.setSize(950, 600);
        this.setLocationRelativeTo(null);

        this.username = username;

        questions = loadQuestions("Questions.txt", selectedDepartment);


        if (questions.length == 0) {
            JOptionPane.showMessageDialog(null, "No questions available for " + selectedDepartment);
            nextButton.setEnabled(false);
            this.setVisible(false);
            return;
        }

        bgColor = new Color(151, 174, 209);
        themeColor = new Color(41, 110, 214);
        themeSubColor = new Color(0, 6, 36);
        grayColor = new Color(110, 107, 106);
        redColor = new Color(220, 20, 10);
        greenColor = new Color(0, 150, 0);
        Font optionFont = new Font("Arial", Font.BOLD, 20);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);
        this.add(panel);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        leftpanel = new JPanel();
        leftpanel.setLayout(null);
        leftpanel.setBounds(0, 0, 380, 600);
        leftpanel.setBackground(Color.WHITE);
        panel.add(leftpanel);

        totalAnsweredTitle = new JLabel("Total Answered", SwingConstants.CENTER);
        totalAnsweredTitle.setBounds(0, 60, 380, 18);
        totalAnsweredTitle.setFont(new Font("Arial", Font.BOLD, 18));
        totalAnsweredTitle.setForeground(themeSubColor);
        leftpanel.add(totalAnsweredTitle);

        totalNumber = new JLabel("0/15", SwingConstants.CENTER);
        totalNumber.setBounds(0, 82, 380, 40);
        totalNumber.setFont(new Font("Arial", Font.BOLD, 40));
        totalNumber.setForeground(grayColor);
        leftpanel.add(totalNumber);

        rightAnsweredTitle = new JLabel("Right Answered", SwingConstants.CENTER);
        rightAnsweredTitle.setBounds(0, 140, 380, 18);
        rightAnsweredTitle.setFont(new Font("Arial", Font.BOLD, 18));
        rightAnsweredTitle.setForeground(themeSubColor);
        leftpanel.add(rightAnsweredTitle);

        rightNumber = new JLabel("0", SwingConstants.CENTER);
        rightNumber.setBounds(0, 162, 380, 40);
        rightNumber.setFont(new Font("Arial", Font.BOLD, 40));
        rightNumber.setForeground(greenColor);
        leftpanel.add(rightNumber);

        wrongAnsweredTitle = new JLabel("Wrong Answered", SwingConstants.CENTER);
        wrongAnsweredTitle.setBounds(0, 220, 380, 18);
        wrongAnsweredTitle.setFont(new Font("Arial", Font.BOLD, 18));
        wrongAnsweredTitle.setForeground(themeSubColor);
        leftpanel.add(wrongAnsweredTitle);

        wrongNumber = new JLabel("0", SwingConstants.CENTER);
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

        bigLine = new JPanel();
        bigLine.setLayout(null);
        bigLine.setBounds(380, 0, 10, 600);
        bigLine.setBackground(themeSubColor);
        panel.add(bigLine);

        questionPanel = new JPanel();
        questionPanel.setLayout(null);
        questionPanel.setBounds(460, 80, 400, 100);
        questionPanel.setBackground(bgColor);
        panel.add(questionPanel);

        question = new JLabel("Question here...");
        question.setBounds(20, 10, 360, 80);
        question.setFont(new Font("Arial", Font.BOLD, 14));
        questionPanel.add(question);

        optionsGroup = new ButtonGroup();

        // Option 1
        optionPanel1 = new JPanel();
        optionPanel1.setLayout(null);
        optionPanel1.setBounds(460, 210, 400, 50);
        optionPanel1.setBackground(bgColor);
        panel.add(optionPanel1);

        radioButton1 = new JRadioButton("Option 1");
        radioButton1.setBounds(10, 0, 400, 50);
        radioButton1.setFont(optionFont);
        radioButton1.setBackground(bgColor);
        radioButton1.setForeground(themeSubColor);
        optionPanel1.add(radioButton1);
        optionsGroup.add(radioButton1);

        // Option 2
        optionPanel2 = new JPanel();
        optionPanel2.setLayout(null);
        optionPanel2.setBounds(460, 270, 400, 50);
        optionPanel2.setBackground(bgColor);
        panel.add(optionPanel2);

        radioButton2 = new JRadioButton("Option 2");
        radioButton2.setBounds(10, 0, 400, 50);
        radioButton2.setFont(optionFont);
        radioButton2.setBackground(bgColor);
        radioButton2.setForeground(themeSubColor);
        optionPanel2.add(radioButton2);
        optionsGroup.add(radioButton2);

        // Option 3
        optionPanel3 = new JPanel();
        optionPanel3.setLayout(null);
        optionPanel3.setBounds(460, 330, 400, 50);
        optionPanel3.setBackground(bgColor);
        panel.add(optionPanel3);

        radioButton3 = new JRadioButton("Option 3");
        radioButton3.setBounds(10, 0, 400, 50);
        radioButton3.setFont(optionFont);
        radioButton3.setBackground(bgColor);
        radioButton3.setForeground(themeSubColor);
        optionPanel3.add(radioButton3);
        optionsGroup.add(radioButton3);

        // Option 4
        optionPanel4 = new JPanel();
        optionPanel4.setLayout(null);
        optionPanel4.setBounds(460, 390, 400, 50);
        optionPanel4.setBackground(bgColor);
        panel.add(optionPanel4);

        radioButton4 = new JRadioButton("Option 4");
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
        nextButton.addActionListener(this);
        panel.add(nextButton);

        // questions



        

        // Show the first question
        showQuestion(currentIndex);
            
    }


    public void actionPerformed(ActionEvent ae) {
                if (optionsGroup.getSelection() == null) {
                    JOptionPane.showMessageDialog(QuizPage.this, "Please select an answer before continuing.");
                    return;
                }

                totalAnswered++;
                totalNumber.setText(totalAnswered + "/15");

                // Get selected option text
                String selectedAnswer = null;
                if (radioButton1.isSelected()) selectedAnswer = radioButton1.getText();
                else if (radioButton2.isSelected()) selectedAnswer = radioButton2.getText();
                else if (radioButton3.isSelected()) selectedAnswer = radioButton3.getText();
                else if (radioButton4.isSelected()) selectedAnswer = radioButton4.getText();

                // Check answer correctness
                if (selectedAnswer != null && selectedAnswer.equals(questions[currentIndex].getCorrectAnswer())){
                    rightAnswered++;
                    rightNumber.setText(String.valueOf(rightAnswered));
                } else {
                    wrongAnswered++;
                    wrongNumber.setText(String.valueOf(wrongAnswered));
                }

                currentIndex++;
                if(currentIndex > 15){
                    this.setVisible(false);
                    Result see1 = new Result(rightAnswered, username);
                    see1.setVisible(true);
                    return;
                }
                if (currentIndex < questions.length) {
                    showQuestion(currentIndex);
                } else {
                    this.setVisible(false);
                    Result see1 = new Result(rightAnswered, username);
                    see1.setVisible(true);
                    return;
                }
            }
    private void showQuestion(int index) {
        Question q = questions[index];
        question.setText("<html>" + q.getQuestionText() + "</html>");
        radioButton1.setText(q.getOptionA());
        radioButton2.setText(q.getOptionB());
        radioButton3.setText(q.getOptionC());
        radioButton4.setText(q.getOptionD());

        optionsGroup.clearSelection();
    }

    private Question[] loadQuestions(String filePath, String department) {
    int count = 0;
    // First pass: count how many matching questions
    try{
        Scanner sc = new Scanner(new File(filePath));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split("\t");
            if (parts[6].equals(department)) {
                count++;
            }
           
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error reading question file: " + e.getMessage());
        return new Question[0];
    }

    // Second pass: actually store the matching questions
    Question[] questions = new Question[count];
    int index = 0;

    try{
        Scanner sc = new Scanner(new File(filePath));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split("\t");
            if (parts[6].equals(department)) {
                questions[index] = new Question(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
                index++;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error ");
    }

    return questions;
}

}
