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
<<<<<<< HEAD
       AddQuestions add =new AddQuestions();
       //s2.setVisible(true);
      //s1.setVisible(true);
      //h1.setVisible(true);
      //s1.setVisible(true);
      //a1.setVisible(true);
=======
       QuizPage q1 = new QuizPage();
       Subject sub1 = new Subject();
       Result r1 = new Result();
       //s2.setVisible(true);
      //s1.setVisible(true);
      //h1.setVisible(true);
      //  s1.setVisible(true);
      // a1.setVisible(true);
>>>>>>> 29d2235c4a5c7d4c9cdb91a5da1f6efffd465bb9
      // s1.setVisible(true);
      //h1.setVisible(true);
      //  s1.setVisible(true);
      //a1.setVisible(true);
<<<<<<< HEAD
      //p1.setVisible(true);
      add.setVisible(true);

=======
      // p1.setVisible(true);
      // q1.setVisible(true);
      // sub1.setVisible(true);
      r1.setVisible(true);
>>>>>>> 29d2235c4a5c7d4c9cdb91a5da1f6efffd465bb9
    }
}
