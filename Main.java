import java.lang.*;
import javax.swing.*;

import Frames.*;

public class Main{
    public static void main(String [] args)
    {
       Sign_in s1= new Sign_in();
       SignUp s2 =new SignUp();
       HomePage h1=new HomePage("Syed Shahriar Mustafa");
       AdminPage a1= new AdminPage();
       Profile p1 = new Profile("Shihab Bhuiyan");
       QuizPage q1 = new QuizPage();
       //s2.setVisible(true);
      //s1.setVisible(true);
      //h1.setVisible(true);
      //  s1.setVisible(true);
      // a1.setVisible(true);
      // s1.setVisible(true);
      //h1.setVisible(true);
      //  s1.setVisible(true);
      //a1.setVisible(true);
      // p1.setVisible(true);
      q1.setVisible(true);
    }
}
