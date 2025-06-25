package Frames;
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeeResult extends JFrame implements ActionListener,MouseListener {

    JLabel namelbl, seeResultLabel;
    JButton logOutButton, backButton, addQButton, upQButton, delQButton, seeResButton, showStuDeatilsButton, seeResultBtn;
    JPanel panel, topPanel, sidePanel;
    ImageIcon icon, adminIcon, seeResultIcon;
    String[][] allResults;
    Color themeColor;
    JPanel resultTablePanel;
    int currentSubject;
    void updateResultTable(String subject) {
        resultTablePanel.removeAll();

        JLabel nameHeader = new JLabel("Name");
        nameHeader.setBounds(20, 5, 150, 30);
        nameHeader.setFont(new Font("Arial", Font.BOLD, 14));
        resultTablePanel.add(nameHeader);

        JLabel resultHeader = new JLabel("Result");
        resultHeader.setBounds(200, 5, 150, 30);
        resultHeader.setFont(new Font("Arial", Font.BOLD, 14));
        resultTablePanel.add(resultHeader);

        int yValue = 35;
        for (String[] entry : allResults) {
            if (entry[2].equals(subject)) {

                JLabel nameLbl = new JLabel(entry[0]);
                nameLbl.setBounds(20, yValue, 150, 30);
                resultTablePanel.add(nameLbl);

                JLabel resultLbl = new JLabel(entry[1]);
                resultLbl.setBounds(200, yValue, 150, 30);
                resultTablePanel.add(resultLbl);

                yValue += 35;
            }
        }

        resultTablePanel.setPreferredSize(new Dimension(350, yValue));
        resultTablePanel.revalidate();
        resultTablePanel.repaint();
    }

    public SeeResult() {
        super("See Result");
        this.setSize(950, 600);
        this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        themeColor = new Color(41, 110, 214);

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
        delQButton.setBackground(themeColor);
        delQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        sidePanel.add(delQButton);
        
        seeResButton = new JButton("See Result");
        seeResButton.setBounds(0, 180, 185, 60); // 120 + 60
        seeResButton.setForeground(Color.WHITE);
        seeResButton.setBackground(new Color(14, 22, 79));
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

        seeResultIcon = new ImageIcon(getClass().getResource("../Images/seeResult.png"));
        Image scaledSeeImage = seeResultIcon.getImage().getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        ImageIcon scaledSeeImageFinal = new ImageIcon(scaledSeeImage);
        JLabel seeResultImgLabel = new JLabel(scaledSeeImageFinal);
        seeResultImgLabel.setBounds(450, 60, 140, 140);
        panel.add(seeResultImgLabel);

        seeResultLabel = new JLabel("See Result");
        seeResultLabel.setBounds(445, 200, 200, 50);
        seeResultLabel.setFont(new Font("Arial", Font.BOLD, 24));
        seeResultLabel.setForeground(new Color(70, 138, 59));
        panel.add(seeResultLabel);

       

        resultTablePanel = new JPanel();
        resultTablePanel.setLayout(null);
        resultTablePanel.setBackground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(resultTablePanel);
        scrollPane.setBounds(275, 270, 400, 200);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scrollPane);

       String subjects[] = new String[]{"CSE", "EEE", "CS", "BBA", "English", "Architechture"};

int startY = 485;
int btnWidth = 100;
int btnHeight = 30;
int gap = 10;

for (int i = 0; i < subjects.length; i++) {
    String subject = subjects[i];
    JButton subjectBtn = new JButton(subject);
    subjectBtn.setBounds(275 + (i % 3) * (btnWidth + gap), startY + (i / 3) * (btnHeight + gap), btnWidth, btnHeight);
    subjectBtn.setBackground(new Color(70, 138, 59));
    subjectBtn.setForeground(Color.WHITE);
    subjectBtn.setFont(new Font("Arial", Font.BOLD, 12));
    currentSubject = i;
    subjectBtn.addActionListener(this);
    
    panel.add(subjectBtn);
}

try {
    File myfile = new File("./DataBase/Result.txt");
    Scanner lineCounter = new Scanner(myfile);
    int count = 0;
    while (lineCounter.hasNextLine()) {
        String[] parts = lineCounter.nextLine().split("\t");
        if (parts.length >= 3) count++;
    }
    lineCounter.close();

    allResults = new String[count][3];

    Scanner sc = new Scanner(myfile);
    int index = 0;
    while (sc.hasNextLine()) {
        String[] value = sc.nextLine().split("\t");
        if (value.length >= 3) {
            allResults[index][0] = value[0];
            allResults[index][1] = value[1];
            allResults[index][2] = value[2];
            index++;
        }
    }
    sc.close();
} catch (FileNotFoundException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Result.txt file not found!", "Error", JOptionPane.ERROR_MESSAGE);
}

    updateResultTable(subjects[0]);


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
    else if (me.getSource() == delQButton) {
        delQButton.setBackground(themeColor);
        delQButton.setForeground(Color.WHITE);
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
        AddQuestions ad =new AddQuestions();
        ad.setVisible(true);
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
    else{
        String subjects[] = new String[]{"CSE", "EEE", "CS", "BBA", "English", "Architechture"};
        updateResultTable(subjects[currentSubject]);
    }
}

 
    

}

