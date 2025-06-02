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
        crlbl.setBounds(500,40,200,100);
        crlbl.setFont(new Font("Arial", Font.BOLD, 20));
        crlbl.setForeground(Color.BLUE);
        panel.add(crlbl);



        this.add(panel);


    }


    
}
