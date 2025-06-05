package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class AdminPage extends JFrame {

    JLabel namelbl;
	JTextField namefld;
	JButton logOutButton,addQButton;
    Color myColor,lbColor;
    ImageIcon icon,adminIcon,addQ;
	JPanel panel,topPanel,sidePanel,midPanel1,midPanel2;

    public AdminPage()
    {
        super("Admin Dashboard");
        this.setSize(950,600);
        this.setLocationRelativeTo(null);


        panel=new JPanel();
		panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        adminIcon = new ImageIcon(getClass().getResource("../Images/adminIcon.png"));
        Image scaledImageRlogo = adminIcon.getImage().getScaledInstance(
            40, 40, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageRlogoFinal = new ImageIcon(scaledImageRlogo);
        JLabel adminLbl = new JLabel(scaledImageRlogoFinal);
        adminLbl.setBounds(190, 7, 40, 40);
        panel.add(adminLbl);

        logOutButton = new JButton("Log Out");
        logOutButton.setBounds(805, 7, 100, 30);
        logOutButton.setForeground(Color.BLUE);
        logOutButton.setBackground(Color.WHITE);
        logOutButton.setFont(new Font("Arial", Font.BOLD, 16));
        // logOutButton.addMouseListener(this);
        // logOutButton.addActionListener(this);
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

        midPanel1 = new JPanel();
        midPanel1.setLayout(null);
        midPanel1.setBounds(250, 110, 200, 150);
        midPanel1.setBackground(Color.BLUE);
        panel.add(midPanel1);


        midPanel2 = new JPanel();
        midPanel2.setLayout(null);
        midPanel2.setBounds(650, 110, 200, 150);
        midPanel2.setBackground(Color.BLUE);
        panel.add(midPanel2);


        //add q
        addQ = new ImageIcon(getClass().getResource("../Images/addQ.png"));
        Image scaledAddQImage = addQ.getImage().getScaledInstance(
            38, 38, Image.SCALE_SMOOTH
        );
        ImageIcon scaledAddQIcon = new ImageIcon(scaledAddQImage);
        JLabel addQlbl = new JLabel(scaledAddQIcon);
        addQlbl.setBounds(0, 7, 38, 38);
        sidePanel.add(addQlbl);

        addQButton = new JButton("Add Question");
        addQButton.setBounds(40, 14, 158, 25);
        addQButton.setForeground(Color.WHITE);
        addQButton.setBackground(Color.BLUE);
        addQButton.setFont(new Font("Arial", Font.PLAIN, 20));
        // addQButton.addMouseListener(this);
        // addQButton.addActionListener(this);
        sidePanel.add(addQButton);



        this.add(panel);


    }


    
}
