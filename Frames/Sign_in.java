package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
public class Sign_in extends JFrame{

    JLabel namelbl,passlbl,imagelbl,welcomelbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton lgnbtn,rgstrbtn,backbtn;
	Color mycolor,lblcolor;
	Font myfont;
	ImageIcon bg,logo;
	JPanel panel;

    public Sign_in()
    {
        super("Log In");
        this.setSize(950,550);
		this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        ImageIcon icon = new ImageIcon(getClass().getResource("logo.png"));
        this.setIconImage(icon.getImage());

        welcomelbl=new JLabel("Welcome Back");
        welcomelbl.setBounds(500, 100, 250, 150);
        welcomelbl.setFont(new Font("Arial", Font.BOLD, 26));
        welcomelbl.setForeground(Color.BLUE);
        panel.add(welcomelbl);

        namelbl=new JLabel("Name ");
        namelbl.setBounds(500,240,100,50);
        namelbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(namelbl);

        namefld=new JTextField();
        namefld.setBounds(550,240,200,50);
        namefld.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(namefld);

        passlbl=new JLabel("Pass ");
        passlbl.setBounds(500,310,100,50);
        passlbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(passlbl);

        passfld=new JPasswordField();
        passfld.setBounds(550,310,200,50);
        passfld.setFont(new Font("Arial", Font.BOLD, 15));
        passfld.setEchoChar('*');
        panel.add(passfld);

        lgnbtn=new JButton("Login");
        lgnbtn.setBounds(500,380,250,50);
        lgnbtn.setForeground(Color.WHITE);
        lgnbtn.setBackground(Color.BLUE);
        lgnbtn.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(lgnbtn);

        
        ImageIcon sideImage = new ImageIcon(getClass().getResource("sideimg.png"));
        imagelbl = new JLabel(sideImage);
        imagelbl.setBounds(35, 80,436, 424);
        panel.add(imagelbl);

        this.add(panel);



    }


}
