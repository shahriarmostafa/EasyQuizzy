import java.lang.*;
import javax.swing.*;

import Frames.AdminPage;
import Frames.HomePage;
import Frames.SignUp;
import Frames.Sign_in;
public class Main{
    public static void main(String [] args)
    {
       Sign_in s1= new Sign_in();
       SignUp s2 =new SignUp();
       HomePage h1=new HomePage();
       AdminPage a1= new AdminPage();
       //s2.setVisible(true);
       //s1.setVisible(true);
       //h1.setVisible(true);
       a1.setVisible(true);

    }
}