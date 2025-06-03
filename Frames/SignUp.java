package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class SignUp  extends JFrame implements MouseListener, ActionListener
{

    JLabel wlbl,fnmlbl,unmlbl,pslbl,crlbl, welcomeLabel, helloLabel, logoLbl,sloganlbl;
	JTextField fullNameField, usernameField;
	JPasswordField passwordField, confirmPasswordField;
	JButton rgstbtn,bckbtn;
    ImageIcon icon, roundLogo;
	JPanel panel, leftPanel;
    Color themeColor, hoverColor;

    public SignUp()
    {
        super("Sign Up");
        this.setSize(950,600);
        this.setLocationRelativeTo(null);

        //colors
        themeColor = new Color(41, 110, 214);
        hoverColor = new Color(79, 133, 237);

        panel=new JPanel();
		panel.setLayout(null);


        helloLabel=new JLabel("Hello,");
        helloLabel.setBounds(185, 80, 400, 70);
        helloLabel.setFont(new Font("Arail", Font.PLAIN, 30));
        helloLabel.setForeground(Color.WHITE);
        panel.add(helloLabel);

        welcomeLabel=new JLabel("Welcome to");
        welcomeLabel.setBounds(110, 120, 400, 70);
        welcomeLabel.setFont(new Font("Arail", Font.BOLD, 44));
        welcomeLabel.setForeground(Color.WHITE);
        panel.add(welcomeLabel);

        roundLogo = new ImageIcon(getClass().getResource("../Images/roundLogo.png"));
        Image scaledImage = roundLogo.getImage().getScaledInstance(
            200, 200, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageFinal = new ImageIcon(scaledImage);
        logoLbl = new JLabel(scaledImageFinal);
        logoLbl.setBounds(138, 200, 200, 200);
        panel.add(logoLbl);

        // sloganlbl=new JLabel("Tap, think, win! Easy Quizzy brings"+"\n"+"the fun right to your fingertips." );
        // sloganlbl.setBounds(100,400,250,100);
        // sloganlbl.setFont(new Font("Arail", Font.PLAIN, 15));
        // sloganlbl.setForeground(Color.WHITE);
        // panel.add(sloganlbl);


        leftPanel = new JPanel();
        leftPanel.setBounds(0, 0, 475, 600);
        leftPanel.setBackground(themeColor);
        panel.add(leftPanel);



        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        // wlbl=new JLabel("Welcome");
        // wlbl.setBounds(587, 50, 250, 150);
        // wlbl.setFont(new Font("Arial", Font.BOLD, 26));
        // wlbl.setForeground(Color.BLUE);
        // panel.add(wlbl);

        crlbl=new JLabel("Creat your account");
        crlbl.setBounds(587,4,300,100);
        crlbl.setFont(new Font("Arial", Font.BOLD, 28));
        crlbl.setForeground(themeColor);
        panel.add(crlbl);

        fnmlbl=new JLabel("Enter your full name");
        fnmlbl.setBounds(587,85,200,50);
        fnmlbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(fnmlbl);

        fullNameField=new JTextField();
		fullNameField.setBounds(587,125,250,35);
        fullNameField.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(fullNameField);

        unmlbl=new JLabel("Username");
        unmlbl.setBounds(587,155,200,50);
        unmlbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(unmlbl);

        usernameField=new JTextField();
		usernameField.setBounds(587,195,250,35);
        usernameField.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(usernameField);


        pslbl=new JLabel("Password");
        pslbl.setBounds(587,225,100,50);
        pslbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pslbl);

        passwordField=new JPasswordField();
		passwordField.setBounds(587,265,250,35);
        passwordField.setFont(new Font("Arial", Font.BOLD, 15));
        passwordField.setEchoChar('*');
		panel.add(passwordField);

        pslbl=new JLabel("Confirm Password");
        pslbl.setBounds(587,305,200,50);
        pslbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pslbl);

        confirmPasswordField=new JPasswordField();
		confirmPasswordField.setBounds(587,345,250,35);
        confirmPasswordField.setFont(new Font("Arial", Font.BOLD, 15));
        confirmPasswordField.setEchoChar('*');
		panel.add(confirmPasswordField);


        rgstbtn=new JButton("Sign Up");
        rgstbtn.setBounds(587,400,250,50);
        rgstbtn.setForeground(Color.WHITE);
        rgstbtn.setBackground(themeColor);
        rgstbtn.setBorder(null);
        rgstbtn.setFont(new Font("Arial", Font.BOLD, 18));
        rgstbtn.addMouseListener(this);
        rgstbtn.addActionListener(this);
        panel.add(rgstbtn);


        // bckbtn=new JButton("←");
        // bckbtn.setBounds(0, 550, 20, 10);
        // bckbtn.setForeground(Color.WHITE);
        // bckbtn.setForeground(Color.WHITE);
        // bckbtn.setFont(new Font("Arial", Font.BOLD, 18));
        // bckbtn.addMouseListener(this);
        // panel.add(bckbtn);

        this.add(panel);


    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource()==rgstbtn)
        {
            rgstbtn.setBackground(hoverColor);
        }

    }
    public void mouseExited(MouseEvent me)
    {
        if(me.getSource()==rgstbtn)
        {
            rgstbtn.setBackground(themeColor);
        }

    }

    public void actionPerformed(ActionEvent ae){
        String fullName = fullNameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmpassword = confirmPasswordField.getText();
        if(!password.equals(confirmpassword)){
            JOptionPane.showMessageDialog(null,"Password did not match...");
            return;
        }
        else{
            Account a1=new Account(fullName , username, password);
			a1.addAccount();
			this.setVisible(false);
			HomePage h1=new HomePage();
			h1.setVisible(true);
        }
    }



    
}
