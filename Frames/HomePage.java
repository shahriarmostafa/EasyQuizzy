package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.Color;
//import java.awt.event.*;

public class HomePage extends JFrame {


    JLabel namelbl;
	JTextField namefld;
	JButton backbtn;
    Color myColor,lbColor;
    ImageIcon icon;
	JPanel panel;
    


    public HomePage()
    {
        super("Homepage");
        this.setSize(950,600);
        this.setLocationRelativeTo(null);


        panel=new JPanel();
		panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());


        namelbl = new JLabel("Eta holo Homepage");
        namelbl.setBounds(100, 100, 400, 50);
        namelbl.setForeground(Color.RED);
        panel.add(namelbl);


        this.add(panel);


    }
    
}
