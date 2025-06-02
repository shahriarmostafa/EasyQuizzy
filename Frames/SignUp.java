package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignUp  extends JFrame implements MouseListener
{

    JLabel wlbl,fnmlbl,unmlbl,pslbl,crlbl;
	JTextField nmfld;
	JPasswordField psfld;
	JButton rgstbtn,bckbtn;
    ImageIcon icon;
	JPanel panel;

    public SignUp()
    {
        super("Sign Up");
        this.setSize(950,600);
        this.setLocationRelativeTo(null);

        panel=new JPanel();
		panel.setLayout(null);

        icon = new ImageIcon(getClass().getResource("../Images/logo.png"));
        this.setIconImage(icon.getImage());

        // wlbl=new JLabel("Welcome");
        // wlbl.setBounds(500, 50, 250, 150);
        // wlbl.setFont(new Font("Arial", Font.BOLD, 26));
        // wlbl.setForeground(Color.BLUE);
        // panel.add(wlbl);

        crlbl=new JLabel("Creat your account");
        crlbl.setBounds(500,5,300,100);
        crlbl.setFont(new Font("Arial", Font.BOLD, 25));
        crlbl.setForeground(Color.BLUE);
        panel.add(crlbl);

        fnmlbl=new JLabel("Enter your full name");
        fnmlbl.setBounds(500,85,200,50);
        fnmlbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(fnmlbl);

        nmfld=new JTextField();
		nmfld.setBounds(500,125,250,35);
        nmfld.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(nmfld);

        unmlbl=new JLabel("Username");
        unmlbl.setBounds(500,155,200,50);
        unmlbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(unmlbl);

        nmfld=new JTextField();
		nmfld.setBounds(500,195,250,35);
        nmfld.setFont(new Font("Arial", Font.BOLD, 15));
		panel.add(nmfld);


        pslbl=new JLabel("Password");
        pslbl.setBounds(500,225,100,50);
        pslbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pslbl);

        psfld=new JPasswordField();
		psfld.setBounds(500,265,250,35);
        psfld.setFont(new Font("Arial", Font.BOLD, 15));
        psfld.setEchoChar('*');
		panel.add(psfld);

        pslbl=new JLabel("Confirm Password");
        pslbl.setBounds(500,305,200,50);
        pslbl.setFont(new Font("Arial", Font.BOLD, 15));
        panel.add(pslbl);

        psfld=new JPasswordField();
		psfld.setBounds(500,345,250,35);
        psfld.setFont(new Font("Arial", Font.BOLD, 15));
        psfld.setEchoChar('*');
		panel.add(psfld);


        rgstbtn=new JButton("Sign Up");
        rgstbtn.setBounds(500,400,250,50);
        rgstbtn.setForeground(Color.WHITE);
        rgstbtn.setBackground(Color.BLUE);
        rgstbtn.setFont(new Font("Arial", Font.BOLD, 18));
        rgstbtn.addMouseListener(this);
        panel.add(rgstbtn);


        bckbtn=new JButton("Back");
        bckbtn.setBounds(580,465,100,40);
        bckbtn.setForeground(Color.WHITE);
        bckbtn.setBackground(Color.BLUE);
        bckbtn.setFont(new Font("Arial", Font.BOLD, 18));
        bckbtn.addMouseListener(this);
        panel.add(bckbtn);

        this.add(panel);


    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
    {
        if(me.getSource()==rgstbtn)
        {
            rgstbtn.setBackground(Color.WHITE);
            rgstbtn.setForeground(Color.BLUE);
        }

        else if(me.getSource()==bckbtn)
        {
            bckbtn.setBackground(Color.WHITE);
            bckbtn.setForeground(Color.BLUE);
        }
    }
    public void mouseExited(MouseEvent me)
    {
        if(me.getSource()==rgstbtn)
        {
            rgstbtn.setBackground(Color.BLUE);
            rgstbtn.setForeground(Color.WHITE);
        }
        else if(me.getSource()==bckbtn)
        {
            bckbtn.setBackground(Color.BLUE);
            bckbtn.setForeground(Color.WHITE);
        }
    }



    
}
