package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class AddQuestions extends JFrame implements ActionListener,MouseListener{

    JLabel namelbl,addQLabel,qLabel,optionALabel, optionBLabel, optionCLabel, optionDLabel,ansLabel;
    JTextField qField,optionAField, optionBField, optionCField, optionDField,ansField;
    JButton logOutButton, backButton, addQButton, upQButton, delQButton, seeResButton, showStuDeatilsButton,addButton;
    Color themeColor;
    ImageIcon icon, adminIcon,addQIcon;
    JPanel panel, topPanel, sidePanel;
    JComboBox combo;


    public AddQuestions() {
        super("Add Questions");
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

        // Back button
        backButton = new JButton("Back");
        backButton.setBounds(700, 7, 100, 30);
        backButton.setForeground(Color.BLUE);
        backButton.setBackground(Color.WHITE);
        backButton.setFont(new Font("Arial", Font.BOLD, 16));
        // backButton.addActionListener(this);
        panel.add(backButton);

        // Log Out button
        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(805, 7, 100, 30);
        logOutButton.setForeground(Color.BLUE);
        logOutButton.setBackground(Color.WHITE);
        logOutButton.setFont(new Font("Arial", Font.BOLD, 16));
        // logOutButton.addActionListener(this);
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
        addQButton.setBackground(new Color(14, 22, 79));
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

        addQButton.addMouseListener(this);
        upQButton.addMouseListener(this);
        delQButton.addMouseListener(this);
        seeResButton.addMouseListener(this);
        showStuDeatilsButton.addMouseListener(this);

        addQButton.addActionListener(this);
        upQButton.addActionListener(this);
        delQButton.addActionListener(this);
        seeResButton.addActionListener(this);
        showStuDeatilsButton.addActionListener(this);


        
        //mid part
        addQIcon = new ImageIcon(getClass().getResource("../Images/addQ.png"));
        Image scaledAddQImage = addQIcon.getImage().getScaledInstance(
            140, 140, Image.SCALE_SMOOTH);
        ImageIcon scaledAddQIcon = new ImageIcon(scaledAddQImage);
        JLabel addQLabel = new JLabel(scaledAddQIcon);
        addQLabel.setBounds(450, 60, 140, 140);
        panel.add(addQLabel);

        //Add Qestion text
        addQLabel = new JLabel("Add Question");
        addQLabel.setBounds(450, 180, 200, 50);
        addQLabel.setFont(new Font("Arial", Font.BOLD, 24));
        addQLabel.setForeground(new Color(70, 138, 59));
        panel.add(addQLabel);

        //Queston:
        qLabel=new JLabel("Qestion: ");
        qLabel.setBounds(200,220,100,50);
        qLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(qLabel);


        qField=new JTextField();
        qField.setBounds(200,260,500,45);
        qField.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(qField);

       String items[] = {"CSE", "EEE", "CS", "BBA", "English", "Architechture"};
       combo = new JComboBox(items);
       combo.setBounds(750, 260, 100, 30);
       combo.setFont(new Font("Arial", Font.BOLD, 14));
       combo.setBackground(Color.WHITE);
       combo.setForeground(Color.BLUE);
       panel.add(combo);


       // Option A
       optionALabel = new JLabel("Option A:");
       optionALabel.setBounds(200, 320, 100, 30);
       optionALabel.setFont(new Font("Arial", Font.BOLD, 16));
       panel.add(optionALabel);
       
       optionAField = new JTextField();
       optionAField.setBounds(300, 320, 400, 30);
       optionAField.setFont(new Font("Arial", Font.PLAIN, 15));
       panel.add(optionAField);
       
       // Option B
       optionBLabel = new JLabel("Option B:");
       optionBLabel.setBounds(200, 360, 100, 30);
       optionBLabel.setFont(new Font("Arial", Font.BOLD, 16));
       panel.add(optionBLabel);
       
       optionBField = new JTextField();
       optionBField.setBounds(300, 360, 400, 30);
       optionBField.setFont(new Font("Arial", Font.PLAIN, 15));
       panel.add(optionBField);
       
       // Option C
       optionCLabel = new JLabel("Option C:");
       optionCLabel.setBounds(200, 400, 100, 30);
       optionCLabel.setFont(new Font("Arial", Font.BOLD, 16));
       panel.add(optionCLabel);
       
       optionCField = new JTextField();
       optionCField.setBounds(300, 400, 400, 30);
       optionCField.setFont(new Font("Arial", Font.PLAIN, 15));
       panel.add(optionCField);
       
       // Option D
       optionDLabel = new JLabel("Option D:");
       optionDLabel.setBounds(200, 440, 100, 30);
       optionDLabel.setFont(new Font("Arial", Font.BOLD, 16));
       panel.add(optionDLabel);
       
       optionDField = new JTextField();
       optionDField.setBounds(300, 440, 400, 30);
       optionDField.setFont(new Font("Arial", Font.PLAIN, 15));
       panel.add(optionDField);

       //ans
       ansLabel = new JLabel("Answer:");
       ansLabel.setBounds(200, 500, 100, 30);
       ansLabel.setForeground(new Color(70, 138, 59));
       ansLabel.setFont(new Font("Arial", Font.BOLD, 16));
       panel.add(ansLabel);
       
       ansField = new JTextField();
       ansField.setBounds(300, 500, 400, 30);
       ansField.setFont(new Font("Arial", Font.PLAIN, 15));
       panel.add(ansField);


       addButton = new JButton("Add");
       addButton.setBounds(750, 500, 100, 30);
       addButton.setForeground(Color.RED);
       addButton.setBackground(Color.WHITE);
       addButton.setFont(new Font("Arial", Font.BOLD, 16));
       addButton.addActionListener(this);
       panel.add(addButton);


    

        

    
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
        logOutButton.setForeground(Color.BLUE);
    }
}
public void actionPerformed(ActionEvent ae)
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
        AddQuestions aq = new AddQuestions();
        aq.setVisible(true);
    }
    else if (ae.getSource() == upQButton)
    {
        this.setVisible(false);
        UpQuestions uq = new UpQuestions();
        uq.setVisible(true);
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
    else if(ae.getSource() == addButton){
        String question = qField.getText().trim();
        String optionA = optionAField.getText().trim();
        String optionB = optionBField.getText().trim();
        String optionC = optionCField.getText().trim();
        String optionD = optionDField.getText().trim();
        String answer = ansField.getText().trim();
        String department = (String) combo.getSelectedItem();

        if (question.isEmpty() || optionA.isEmpty() || optionB.isEmpty() || optionC.isEmpty() || optionD.isEmpty() || answer.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    

        // Create Question object and add to file
        Question q = new Question(question, optionA, optionB, optionC, optionD, answer, department);
        q.addQuestion();

        JOptionPane.showMessageDialog(null, "Question added successfully!");

        // Clear input fields
        qField.setText("");
        optionAField.setText("");
        optionBField.setText("");
        optionCField.setText("");
        optionDField.setText("");
        ansField.setText("");
    }
}





}
