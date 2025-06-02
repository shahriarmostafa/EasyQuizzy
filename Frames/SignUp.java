package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignUp  extends JFrame
{

    JLabel wlbl,fnmlbl,nmlbl,pslbl,crlbl;
	JTextField nmfld;
	JPasswordField psfld;
	JButton rgstbtn,bckbtn;
	JPanel panel;

    public SignUp()
    {
        super("Sign Up");
        this.setSize(950,550);
        this.setLocationRelativeTo(null);

        panel=new JPanel();
		panel.setLayout(null);

        // wlbl=new JLabel("Welcome");
        // wlbl.setBounds(500, 50, 250, 150);
        // wlbl.setFont(new Font("Arial", Font.BOLD, 26));
        // wlbl.setForeground(Color.BLUE);
        // panel.add(wlbl);

        // nmlbl=new JLabel();
        // nmlbl.setBounds();

        crlbl=new JLabel("Creat your account");
        crlbl.setBounds(600,5,300,100);
        crlbl.setFont(new Font("Arial", Font.BOLD, 25));
        crlbl.setForeground(Color.BLUE);
        panel.add(crlbl);

        fnmlbl=new JLabel("Enter your full name");
        fnmlbl.setBounds(500,85,200,50);
        fnmlbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(fnmlbl);

        nmfld=new JTextField();
		nmfld.setBounds(500,125,400,35);
        nmfld.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(nmfld);






        this.add(panel);


    }


    
}
