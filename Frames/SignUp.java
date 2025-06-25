package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class SignUp  extends JFrame implements MouseListener, ActionListener
{

    JLabel wlbl,fnmlbl,unmlbl,pslbl,crlbl, welcomeLabel, helloLabel, logoLbl,sloganlbl,queslbl;
	JTextField fullNameField, usernameField;
	JPasswordField passwordField, confirmPasswordField;
	JButton rgstbtn,lgnbtn;
    ImageIcon icon, roundLogo,openEyeIcon, closedEyeIcon;
    Image openEye, closedEye;
	JPanel panel, leftPanel;
    Color themeColor, hoverColor;
    JLabel togglePassword, toggleConfirmPassword;
    boolean isPasswordVisible = false;
    boolean isConfirmPasswordVisible = false;

    

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


        helloLabel=new JLabel("Hello,", SwingConstants.CENTER);
        helloLabel.setBounds(0, 80, 475, 70);
        helloLabel.setFont(new Font("Arail", Font.PLAIN, 30));
        helloLabel.setForeground(Color.WHITE);
        panel.add(helloLabel);

        welcomeLabel=new JLabel("Welcome to", SwingConstants.CENTER);
        welcomeLabel.setBounds(0, 120, 475, 70);
        welcomeLabel.setFont(new Font("Arail", Font.BOLD, 44));
        welcomeLabel.setForeground(Color.WHITE);
        panel.add(welcomeLabel);

        roundLogo = new ImageIcon(getClass().getResource("../Images/roundLogo.png"));
        Image scaledImage = roundLogo.getImage().getScaledInstance(
            200, 200, Image.SCALE_SMOOTH
        );
        ImageIcon scaledImageFinal = new ImageIcon(scaledImage);
        logoLbl = new JLabel(scaledImageFinal);
        logoLbl.setBounds(137, 200, 200, 200);
        panel.add(logoLbl);

        sloganlbl=new JLabel("Your Brain’s Favorite Playground!", SwingConstants.CENTER);
        sloganlbl.setBounds(0,400,475,100);
        sloganlbl.setFont(new Font("Arail", Font.BOLD, 20));
        sloganlbl.setForeground(Color.WHITE);
        panel.add(sloganlbl);


        leftPanel = new JPanel();
        leftPanel.setBounds(0, 0, 475, 600);
        leftPanel.setBackground(themeColor);
        panel.add(leftPanel);



        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        
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

        
        closedEyeIcon = new ImageIcon(getClass().getResource("../Images/eye-close-up.png"));
        openEyeIcon = new ImageIcon(getClass().getResource("../Images/closed-eyes.png"));

        
        closedEye = closedEyeIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        openEye = openEyeIcon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);

        
        togglePassword = new JLabel(new ImageIcon(closedEye));
        togglePassword.setBounds(840, 265, 25, 25);
        togglePassword.addMouseListener(this);
        panel.add(togglePassword);

        
        pslbl = new JLabel("Confirm Password");
        pslbl.setBounds(587, 305, 200, 50);
        pslbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pslbl);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(587, 345, 250, 35);
        confirmPasswordField.setFont(new Font("Arial", Font.BOLD, 15));
        confirmPasswordField.setEchoChar('*');
        panel.add(confirmPasswordField);

        
        toggleConfirmPassword = new JLabel(new ImageIcon(closedEye));
        toggleConfirmPassword.setBounds(840, 345, 25, 25);
        toggleConfirmPassword.addMouseListener(this);
        panel.add(toggleConfirmPassword);

        rgstbtn=new JButton("Sign Up");
        rgstbtn.setBounds(587,400,250,50);
        rgstbtn.setForeground(Color.WHITE);
        rgstbtn.setBackground(themeColor);
        rgstbtn.setBorder(null);
        rgstbtn.setFont(new Font("Arial", Font.BOLD, 18));
        rgstbtn.addMouseListener(this);
        rgstbtn.addActionListener(this);
        panel.add(rgstbtn);


        queslbl=new JLabel("Already have a account?");
        queslbl.setBounds(586,455,200,50);
        queslbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(queslbl);


        lgnbtn=new JButton("Login");
        lgnbtn.setBounds(770,465,70,30);
        lgnbtn.setForeground(themeColor);
        lgnbtn.setBackground(Color.WHITE);
        lgnbtn.setFont(new Font("Arial", Font.BOLD, 13));
        lgnbtn.addMouseListener(this);
        lgnbtn.addActionListener(this);
        panel.add(lgnbtn);

        this.add(panel);


    }
    public void mouseClicked(MouseEvent me){
        if(me.getSource() == togglePassword){
            if (isPasswordVisible) {
                passwordField.setEchoChar('*');
                togglePassword.setIcon(new ImageIcon(closedEye));
            } else {
                passwordField.setEchoChar((char) 0);
                togglePassword.setIcon(new ImageIcon(openEye));
            }
            isPasswordVisible = !isPasswordVisible;
        }
        else if( me.getSource() == toggleConfirmPassword){
            if (isConfirmPasswordVisible) {
                    confirmPasswordField.setEchoChar('*');
                    toggleConfirmPassword.setIcon(new ImageIcon(closedEye));
                } else {
                    confirmPasswordField.setEchoChar((char) 0);
                    toggleConfirmPassword.setIcon(new ImageIcon(openEye));
                }
                isConfirmPasswordVisible = !isConfirmPasswordVisible;
        }
    }
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource()==rgstbtn)
        {
            rgstbtn.setBackground(hoverColor);
        }
        else if(me.getSource()==lgnbtn)
        {
           lgnbtn.setBackground(themeColor);
           lgnbtn.setForeground(Color.WHITE);
        }


    }
    public void mouseExited(MouseEvent me)
    {
        if(me.getSource()==rgstbtn)
        {
            rgstbtn.setBackground(themeColor);
        }
         else if(me.getSource()==lgnbtn)
        {
           lgnbtn.setBackground(Color.WHITE);
           lgnbtn.setForeground(themeColor);
        }

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rgstbtn){
            String fullName = fullNameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmpassword = confirmPasswordField.getText();
        if(fullName.isEmpty() ||username.isEmpty() || password.isEmpty() || confirmpassword.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Feild is empty");
        }
        else if(username.equals("admin")){
            JOptionPane.showMessageDialog(null,"Username can not be admin...");
        }
        else if(!password.equals(confirmpassword)){
            JOptionPane.showMessageDialog(null,"Password did not match...");
        }
        else{
            Account a1=new Account(fullName , username, password);
			a1.addAccount();
            Sign_in s1 = new Sign_in();
            s1.setVisible(true);
			this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Sign Up Successful. Now please sign in");

			
        }
       
        }
        else if(ae.getSource()==lgnbtn)
		{
			this.setVisible(false);
			Sign_in su=new Sign_in();
			su.setVisible(true);
		}
        
    }



    
}
