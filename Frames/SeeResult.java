package Frames;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeeResult extends JFrame {

    JLabel namelbl, seeResultLabel;
    JButton logOutButton, backButton, addQButton, upQButton, delQButton, seeResButton, showStuDeatilsButton, seeResultBtn;
    JPanel panel, topPanel, sidePanel;
    ImageIcon icon, adminIcon, seeResultIcon;

    // Declare here to access globally
    String[][] allResults;
    JPanel resultTablePanel;

    // Method to update table
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
        sidePanel.setBackground(Color.BLUE);
        panel.add(sidePanel);

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

int XValue = 275;
int startY = 485;
int btnWidth = 100;
int btnHeight = 30;
int gap = 10;

for (int i = 0; i < subjects.length; i++) {
    String subject = subjects[i];
    JButton subjectBtn = new JButton(subject);
    subjectBtn.setBounds(XValue + (i % 3) * (btnWidth + gap), startY + (i / 3) * (btnHeight + gap), btnWidth, btnHeight);
    subjectBtn.setBackground(new Color(70, 138, 59));
    subjectBtn.setForeground(Color.WHITE);
    subjectBtn.setFont(new Font("Arial", Font.BOLD, 12));
    subjectBtn.addActionListener(e -> updateResultTable(subject));
    panel.add(subjectBtn);
}

try {
    // Count valid lines
    File myfile = new File("./Result.txt");
    Scanner lineCounter = new Scanner(myfile);
    int count = 0;
    while (lineCounter.hasNextLine()) {
        String[] parts = lineCounter.nextLine().split("\t");
        if (parts.length >= 3) count++;
    }
    lineCounter.close();

    // Create array
    allResults = new String[count][3];

    // Re-open and fill valid entries only
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

    // Default view with first subject
    updateResultTable(subjects[0]);


        this.add(panel);
    }

}
