package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Sign_in extends JFrame implements MouseListener
{

    JLabel namelbl,passlbl,imagelbl,welcomelbl,queslbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton lgnbtn,rgstrbtn,backbtn;
	Color mycolor,lblcolor;
	Font myfont;
	ImageIcon icon, sideImage;
	JPanel panel;

    

    public Sign_in()
    {
        super("Log In");
        this.setSize(950,550);
		this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        welcomelbl=new JLabel("Welcome Back");
        welcomelbl.setBounds(500, 100, 250, 150);
        welcomelbl.setFont(new Font("Arial", Font.BOLD, 26));
        welcomelbl.setForeground(Color.BLUE);
        panel.add(welcomelbl);

        namelbl=new JLabel("Username");
        namelbl.setBounds(500,200,100,50);
        namelbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(namelbl);

        namefld=new JTextField();
        namefld.setBounds(500,240,250,35);
        namefld.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(namefld);

        passlbl=new JLabel("Password");
        passlbl.setBounds(500,270,100,50);
        passlbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(passlbl);

        passfld=new JPasswordField();
        passfld.setBounds(500,310,250,35);
        passfld.setFont(new Font("Arial", Font.BOLD, 15));
        passfld.setEchoChar('*');
        panel.add(passfld);

        lgnbtn=new JButton("Login");
        lgnbtn.setBounds(500,380,250,50);
        lgnbtn.setForeground(Color.WHITE);
        lgnbtn.setBackground(Color.BLUE);
        lgnbtn.setFont(new Font("Arial", Font.BOLD, 18));
        lgnbtn.addMouseListener(this);
        panel.add(lgnbtn);

        queslbl=new JLabel("Don’t have a account?");
        queslbl.setBounds(500,435,200,50);
        queslbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(queslbl);



        rgstrbtn=new JButton("Sign Up");
        rgstrbtn.setBounds(670,445,80,30);
        rgstrbtn.setForeground(Color.BLUE);
        rgstrbtn.setBackground(Color.WHITE);
        rgstrbtn.setFont(new Font("Arial", Font.BOLD, 12));
        rgstrbtn.addMouseListener(this);
        panel.add(rgstrbtn);


        sideImage = new ImageIcon(getClass().getResource("../Images/sideimg.png"));
        imagelbl = new JLabel(sideImage);
        imagelbl.setBounds(35, 80, 436, 424);
        panel.add(imagelbl);



        // ImageIcon bigLogo = new ImageIcon(getClass().getResource("logo2.png"));
        // imagelbl = new JLabel(bigLogo);
        // imagelbl.setBounds(450,0,600,400);
        // panel.add(imagelbl);




        this.add(panel);



    }

    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource()==lgnbtn)
        {
            lgnbtn.setBackground(Color.WHITE);
            lgnbtn.setForeground(Color.BLUE);
        }

        else if(me.getSource()==rgstrbtn)
        {
            rgstrbtn.setBackground(Color.BLUE);
            rgstrbtn.setForeground(Color.WHITE);
        }
    }
    public void mouseExited(MouseEvent me)
    {
        if(me.getSource()==lgnbtn)
        {
            lgnbtn.setBackground(Color.BLUE);
            lgnbtn.setForeground(Color.WHITE);
        }
        else if(me.getSource()==rgstrbtn)
        {
            rgstrbtn.setBackground(Color.WHITE);
            rgstrbtn.setForeground(Color.BLUE);
        }
    }

}
