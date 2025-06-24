package Frames;
import java.lang.*;
import javax.swing.*;
import Entities.*;
import java.awt.*;
import java.awt.event.*;

public class UpQuestions extends JFrame implements ActionListener,MouseListener{

    JLabel namelbl, addQLabel, qLabel, optionALabel, optionBLabel, optionCLabel, optionDLabel,ansLabel,oldQLabel;
    JTextField qField, optionAField, optionBField, optionCField, optionDField,ansField,oldQField;
    JComboBox  combo;
    Color themeColor;
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

        themeColor = new Color(41, 110, 214);

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
        sidePanel.setBackground(themeColor);
        panel.add(sidePanel);

        addQButton = new JButton("Add Question");
        addQButton.setBounds(0, 0, 185, 60);
        addQButton.setForeground(Color.WHITE);
        addQButton.setBackground(themeColor);
        addQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(addQButton);
        
        upQButton = new JButton("Update Question");
        upQButton.setBounds(0, 60, 185, 60); // 0 + 60
        upQButton.setForeground(Color.WHITE);
        upQButton.setBackground(new Color(14, 22, 79));
        upQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(upQButton);
        
        delQButton = new JButton("Delete Question");
        delQButton.setBounds(0, 120, 185, 60); // 60 + 60
        delQButton.setForeground(Color.WHITE);
        delQButton.setBackground(themeColor);
        delQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(delQButton);
        
        seeResButton = new JButton("See Result");
        seeResButton.setBounds(0, 180, 185, 60); // 120 + 60
        seeResButton.setForeground(Color.WHITE);
        seeResButton.setBackground(themeColor);
        seeResButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(seeResButton);
        
        showStuDeatilsButton = new JButton("Show Details");
        showStuDeatilsButton.setBounds(0, 240, 185, 60); // 180 + 60
        showStuDeatilsButton.setForeground(Color.WHITE);
        showStuDeatilsButton.setBackground(themeColor);
        showStuDeatilsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(showStuDeatilsButton);


        backButton.addMouseListener(this);
        logOutButton.addMouseListener(this);
        addQButton.addMouseListener(this);
        upQButton.addMouseListener(this);
        delQButton.addMouseListener(this);
        seeResButton.addMouseListener(this);
        showStuDeatilsButton.addMouseListener(this);


        backButton.addActionListener(this);
        logOutButton.addActionListener(this);
        addQButton.addActionListener(this);
        upQButton.addActionListener(this);
        delQButton.addActionListener(this);
        seeResButton.addActionListener(this);
        showStuDeatilsButton.addActionListener(this);

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
        String[] items = new String[]{"CSE", "EEE", "CS", "BBA", "English", "Architechture"};
        combo = new JComboBox(items);
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
       upButton.addActionListener(this);
       panel.add(upButton);

        this.add(panel);
    }
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == addQButton) {
            addQButton.setBackground(new Color(14, 22, 79));
            addQButton.setForeground(Color.WHITE);
        }
        else if (me.getSource() == delQButton) {
            delQButton.setBackground(new Color(14, 22, 79));
            delQButton.setForeground(Color.WHITE);
        }
        else if (me.getSource() == seeResButton) {
            seeResButton.setBackground(new Color(14, 22, 79));
            seeResButton.setForeground(Color.WHITE);
        }
        else if (me.getSource() == showStuDeatilsButton) {
            showStuDeatilsButton.setBackground(new Color(14, 22, 79));
            showStuDeatilsButton.setForeground(Color.WHITE);
        }
        else if (me.getSource() == logOutButton)
        {
            logOutButton.setBackground(themeColor);
            logOutButton.setForeground(Color.WHITE);
        }
        else if(me.getSource() == backButton)
        {
            backButton.setBackground(themeColor);
            backButton.setForeground(Color.WHITE);
        }
    }
    public void mouseExited(MouseEvent me) {
        if (me.getSource() == addQButton) {
            addQButton.setBackground(themeColor);
            addQButton.setForeground(Color.WHITE);
        }
        else if (me.getSource() == delQButton) {
            delQButton.setBackground(themeColor);
            delQButton.setForeground(Color.WHITE);
        }
        else if (me.getSource() == seeResButton) {
            seeResButton.setBackground(themeColor);
            seeResButton.setForeground(Color.WHITE);
        }
        else if (me.getSource() == showStuDeatilsButton) {
            showStuDeatilsButton.setBackground(themeColor);
            showStuDeatilsButton.setForeground(Color.WHITE);
        }
        else if(me.getSource()==logOutButton)
        {
            logOutButton.setBackground(Color.WHITE);
            logOutButton.setForeground(themeColor);
        }
        else if (me.getSource()==backButton)
        {
            backButton.setBackground(Color.WHITE);
            backButton.setForeground(themeColor);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == logOutButton)
        {
            this.setVisible(false);
            Sign_in si = new Sign_in();
            si.setVisible(true);
        }
        else if (ae.getSource() == addQButton)
        {
            this.setVisible(false);
            AddQuestions ad =new AddQuestions();
            ad.setVisible(true);
        }
        else if (ae.getSource() == delQButton)
        {
            this.setVisible(false);
            deleteQ dq = new deleteQ();
            dq.setVisible(true);
        }
        else if (ae.getSource() == seeResButton)
        {
            this.setVisible(false);
            SeeResult sr = new SeeResult();
            sr.setVisible(true);
        }
        else if (ae.getSource() == showStuDeatilsButton)
        {
            this.setVisible(false);
            ShowDetails sd = new ShowDetails();
            sd.setVisible(true);
        }
        else if (ae.getSource()==backButton)
        {
            this.setVisible(false);
            AdminPage a1 = new AdminPage();
            a1.setVisible(true);
        }
        else if(ae.getSource() == upButton){
            String oldQuestionText = oldQField.getText(); // this field holds the original question text before update
            String question = qField.getText();
            String optionA = optionAField.getText();
            String optionB = optionBField.getText();
            String optionC = optionCField.getText();
            String optionD = optionDField.getText();
            String answer = ansField.getText();
            String department = combo.getSelectedItem().toString();
            Question q = new Question(question, optionA, optionB, optionC, optionD, answer, department);
            boolean success = q.updateQuestion(oldQuestionText);
            if(success) {
                JOptionPane.showMessageDialog(null, "Question updated successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Question not found or failed to update.");
            }
        }
    }


}




