package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignUp  extends JFrame implements MouseListener
{

    JLabel wlbl,fnmlbl,unmlbl,pslbl,crlbl, welcomeLabel, helloLabel, logoLbl;
	JTextField nmfld;
	JPasswordField psfld;
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
        crlbl.setBounds(587,5,300,100);
        crlbl.setFont(new Font("Arial", Font.BOLD, 25));
        crlbl.setForeground(themeColor);
        panel.add(crlbl);

        fnmlbl=new JLabel("Enter your full name");
        fnmlbl.setBounds(587,85,200,50);
        fnmlbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(fnmlbl);

        nmfld=new JTextField();
		nmfld.setBounds(587,125,250,35);
        nmfld.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(nmfld);

        unmlbl=new JLabel("Username");
        unmlbl.setBounds(587,155,200,50);
        unmlbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(unmlbl);

        nmfld=new JTextField();
		nmfld.setBounds(587,195,250,35);
        nmfld.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(nmfld);


        pslbl=new JLabel("Password");
        pslbl.setBounds(587,225,100,50);
        pslbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pslbl);

        psfld=new JPasswordField();
		psfld.setBounds(587,265,250,35);
        psfld.setFont(new Font("Arial", Font.BOLD, 15));
        psfld.setEchoChar('*');
		panel.add(psfld);

        pslbl=new JLabel("Confirm Password");
        pslbl.setBounds(587,305,200,50);
        pslbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pslbl);

        psfld=new JPasswordField();
		psfld.setBounds(587,345,250,35);
        psfld.setFont(new Font("Arial", Font.BOLD, 15));
        psfld.setEchoChar('*');
		panel.add(psfld);


        rgstbtn=new JButton("Sign Up");
        rgstbtn.setBounds(587,400,250,50);
        rgstbtn.setForeground(Color.WHITE);
        rgstbtn.setBackground(themeColor);
        rgstbtn.setBorder(null);
        rgstbtn.setFont(new Font("Arial", Font.BOLD, 18));
        rgstbtn.addMouseListener(this);
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



    
}
