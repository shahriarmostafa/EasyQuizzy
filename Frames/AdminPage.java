package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.Color;

public class AdminPage extends JFrame {

    JLabel namelbl;
	JTextField namefld;
	JButton backbtn;
    Color myColor,lbColor;
    ImageIcon icon;
	JPanel panel;

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


        namelbl = new JLabel("ADMIN DASHBOARD");
        namelbl.setBounds(100, 100, 400, 50);
        namelbl.setForeground(Color.RED);
        panel.add(namelbl);


        this.add(panel);


    }


    
}
