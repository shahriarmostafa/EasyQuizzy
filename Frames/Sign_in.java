package Frames;
import java.lang.*;
import javax.swing.*;

import Entities.*;

import java.awt.*;
import java.awt.event.*;
public class Sign_in extends JFrame implements MouseListener,ActionListener
{

    JLabel namelbl,passlbl,imagelbl,welcomelbl,queslbl,logolbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton lgnbtn,rgstrbtn,backbtn;
    JLabel eyeIcon;
	Color mycolor,lblcolor;
	Font myfont;
	ImageIcon icon, sideImage, bigLogo, showIcon, hideIcon;
	JPanel panel;
    boolean isPasswordVisible = false;

    

    public Sign_in()
    {
        super("Log In");
        this.setSize(950,600);
		this.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        icon = new ImageIcon(getClass().getResource("/Images/logo.png"));
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

showIcon = new ImageIcon(getClass().getResource("/Images/eye-close-up.png")); // open eye (show password)
hideIcon = new ImageIcon(getClass().getResource("/Images/closed-eyes.png"));  // closed eye (hide password)

// Start with hiding the password (closed eye)
Image scaledHide = hideIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
eyeIcon = new JLabel(new ImageIcon(scaledHide));
eyeIcon.setBounds(730, 310, 20, 20);
eyeIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
eyeIcon.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        togglePasswordVisibility();
    }
});
panel.add(eyeIcon);


        lgnbtn=new JButton("Login");
        lgnbtn.setBounds(500,380,250,50);
        lgnbtn.setForeground(Color.WHITE);
        lgnbtn.setBackground(Color.BLUE);
        lgnbtn.setFont(new Font("Arial", Font.BOLD, 18));
        lgnbtn.addMouseListener(this);
        lgnbtn.addActionListener(this);
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
        rgstrbtn.addActionListener(this);
        panel.add(rgstrbtn);


        sideImage = new ImageIcon(getClass().getResource("../Images/sideimg.png"));
        imagelbl = new JLabel(sideImage);
        imagelbl.setBounds(35, 80, 436, 424);
        panel.add(imagelbl);



       bigLogo = new ImageIcon(getClass().getResource("/Images/logo2.png"));
        Image scaledImage = bigLogo.getImage().getScaledInstance(
            164, 124, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageFinal = new ImageIcon(scaledImage);
        logolbl = new JLabel(scaledImageFinal);
        logolbl.setBounds(500, 25, 164, 124);
        panel.add(logolbl);




        this.add(panel);



    }
private void togglePasswordVisibility() {
    if (isPasswordVisible) {
        passfld.setEchoChar('*');
        Image scaledHide = hideIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        eyeIcon.setIcon(new ImageIcon(scaledHide));
    } else {
        passfld.setEchoChar((char) 0);
        Image scaledShow = showIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        eyeIcon.setIcon(new ImageIcon(scaledShow));
    }
    isPasswordVisible = !isPasswordVisible;
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
    public void actionPerformed(ActionEvent ae)
	{





		if(ae.getSource()==rgstrbtn)
		{
			this.setVisible(false);
			SignUp su=new SignUp();
			su.setVisible(true);
		}
		else if(ae.getSource()==lgnbtn)
		{
            String username = namefld.getText();
            String password = passfld.getText();

            Account a1=new Account(username, password);
			if(username.isEmpty() || password.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Feild is empty");
                return;
            }
			if(a1.getAccount(username, password)==true)
			{
				this.setVisible(false);
                HomePage h1=new HomePage("Syed");
                h1.setVisible(true);
                JOptionPane.showMessageDialog(null, "Sign in success");
			}
            else{
                JOptionPane.showMessageDialog(null, "Wrong user name or password");
            }




		}
	}


}
