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
       AddQuestions add =new AddQuestions();
       UpQuestions up =new UpQuestions();
       deleteQ del = new deleteQ();
       SeeResult see =new SeeResult();
       ShowDetails show=new ShowDetails();
       //s2.setVisible(true);
      //s1.setVisible(true);
      //h1.setVisible(true);
      //s1.setVisible(true);
      //a1.setVisible(true);
       QuizPage q1 = new QuizPage("CSE");
       Subject sub1 = new Subject();
       Result r1 = new Result();
       //s2.setVisible(true);
      //s1.setVisible(true);
      //h1.setVisible(true);
      // a1.setVisible(true);
      // s1.setVisible(true);
      //h1.setVisible(true);
      // s1.setVisible(true);
      //a1.setVisible(true);
      // add.setVisible(true);
      // up.setVisible(true);
      // del.setVisible(true);
      // see.setVisible(true);


      // p1.setVisible(true);
       q1.setVisible(true);
      //sub1.setVisible(true);
      //r1.setVisible(true);

    }
}
