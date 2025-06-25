package Frames;
import java.lang.*;
import javax.swing.*;
import Entities.*;
import java.awt.*;
import java.awt.event.*;

public class deleteQ extends JFrame implements ActionListener,MouseListener{

    JLabel namelbl, deleteQLabel, qLabel, optionALabel, optionBLabel, optionCLabel, optionDLabel;
    JTextField qField, optionAField, optionBField, optionCField, optionDField;
    JComboBox combo;
    JButton logOutButton, backButton, addQButton, upQButton, delQButton, seeResButton, showStuDeatilsButton, delButton;
    JPanel panel, topPanel, sidePanel;
    Color themeColor;
    ImageIcon icon, adminIcon, deleteQIcon;

    public deleteQ() {
        super("Delete Questions");
        this.setSize(950, 600);
        this.setLocationRelativeTo(null);

        themeColor = new Color(41, 110, 214);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        adminIcon = new ImageIcon(getClass().getResource("../Images/adminIcon.png"));
        Image scaledImageRlogo = adminIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon scaledImageRlogoFinal = new ImageIcon(scaledImageRlogo);
        JLabel adminLbl = new JLabel(scaledImageRlogoFinal);
        adminLbl.setBounds(190, 7, 40, 40);
        panel.add(adminLbl);

        backButton = new JButton("Back");
        backButton.setBounds(700, 7, 100, 30);
        backButton.setForeground(Color.BLUE);
        backButton.setBackground(Color.WHITE);
        backButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(backButton);

        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(805, 7, 100, 30);
        logOutButton.setForeground(Color.BLUE);
        logOutButton.setBackground(Color.WHITE);
        logOutButton.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(logOutButton);

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
        upQButton.setBackground(themeColor);
        upQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(upQButton);
        
        delQButton = new JButton("Delete Question");
        delQButton.setBounds(0, 120, 185, 60); // 60 + 60
        delQButton.setForeground(Color.WHITE);
        delQButton.setBackground(new Color(14, 22, 79));
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

        deleteQIcon = new ImageIcon(getClass().getResource("../Images/deleteQ.png"));
        Image scaledDeleteQImage = deleteQIcon.getImage().getScaledInstance(140,140, Image.SCALE_SMOOTH);
        ImageIcon scaledDeleteQIconFinal = new ImageIcon(scaledDeleteQImage);
        JLabel deleteQJLabel = new JLabel(scaledDeleteQIconFinal);
        deleteQJLabel.setBounds(450, 60, 140, 140);
        panel.add(deleteQJLabel);

        deleteQLabel = new JLabel("Delete Question");
        deleteQLabel.setBounds(430, 185, 200, 50);
        deleteQLabel.setFont(new Font("Arial", Font.BOLD, 24));
        deleteQLabel.setForeground(new Color(197, 68, 68));
        panel.add(deleteQLabel);

        qLabel = new JLabel("Question:");
        qLabel.setBounds(200, 220, 100, 50);
        qLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(qLabel);

        qField = new JTextField();
        qField.setBounds(200, 260, 500, 45);
        qField.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(qField);

        

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
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {}
    public void mouseReleased(MouseEvent me) {}
    public void mouseEntered(MouseEvent me) {
    if (me.getSource() == addQButton) {
        addQButton.setBackground(new Color(14, 22, 79));
        addQButton.setForeground(Color.WHITE);
    }
    else if (me.getSource() == upQButton) {
        upQButton.setBackground(new Color(14, 22, 79));
        upQButton.setForeground(Color.WHITE);
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
    
    else if (me.getSource() == upQButton) {
        upQButton.setBackground(themeColor);
        upQButton.setForeground(Color.WHITE);
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
        {
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
    else if (ae.getSource() == upQButton)
    {
        this.setVisible(false);
        UpQuestions uq = new UpQuestions();
        uq.setVisible(true);
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
       
    else if(ae.getSource() == delButton){
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

 }
}
