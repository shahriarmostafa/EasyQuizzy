package Entities;
import java.io.*;
import java.util.*;

public class Question{
    private String questionText;
    private String optionA, optionB, optionC, optionD;
    private String correctAnswer;
    private String department;
    private File myfile;
    private FileWriter fwrite;

    public Question(){

    }
    public Question(String questionText, String optionA, String optionB, String optionC, String optionD, String correctAnswer, String department) {
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
        this.department = department;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setOptionA(String optionA){
        this.optionA = optionA;
    }

    public void setOptionB(String optionB){
        this.optionB = optionB;
    }
    public void setOptionC(String optionC){
        this.optionC = optionC;
    }
    public void setOptionD(String optionD){
        this.optionD = optionD;
    }
    public void setCorrectAnswer(String correctAnswer){
        this.correctAnswer = correctAnswer;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    public String getQuestionText(){
    return questionText;
}
    public String getOptionA(){
        return optionA;
    }
    public String getOptionB(){
        return optionB;
    }
    public String getOptionC(){
        return optionC;
    }
    public String getOptionD(){
        return optionD;
    }
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    public String getDepartment(){
        return department;
    }

    public int getTotalQuestions(){
        myfile = new File("./Questions.txt");
        Scanner sc;
        int count = 0;
    
        try {
            sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                sc.nextLine();
                count  = count + 1;
            }
            sc.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return count;
    }

    public void addQuestion(){
        try {
            myfile = new File("./Questions.txt");
            myfile.createNewFile();
            fwrite = new FileWriter(myfile, true);

            fwrite.write(questionText + "\t");
            fwrite.write(optionA + "\t");
            fwrite.write(optionB + "\t");
            fwrite.write(optionC + "\t");
            fwrite.write(optionD + "\t");
            fwrite.write(correctAnswer + "\t");
            fwrite.write(department + "\n");

            fwrite.flush();
            fwrite.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }


public boolean updateQuestion(String oldQuestionText) {
    boolean updated = false;
    myfile = new File("./Questions.txt");
    File futureFile = new File("./Questions_temp.txt");
    Scanner sc;
    
    try {
        sc = new Scanner(myfile);
        fwrite = new FileWriter(futureFile);

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] parts = line.split("\t");
                if (parts[0].equals(oldQuestionText)) {
                    String updatedLine = getQuestionText() +"\t"+ getOptionA() + "\t" + getOptionB() + "\t" + getOptionC() + "\t" + getOptionD() + "\t" + getCorrectAnswer() + "\t" + getDepartment();
                    fwrite.write(updatedLine + "\n");
                    updated = true;
                } else {
                    fwrite.write(line + "\n");
                }
        }
        fwrite.flush();
        fwrite.close();
        sc.close();

        if (updated) {
             myfile.delete();
            futureFile.renameTo(myfile);

        }
        else{
            futureFile.delete();
        }

    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
    return updated;
}


public boolean deleteQuestion(String questionToDelete){
    boolean deleted = false;
    myfile = new File("./Questions.txt");
    File tempFile = new File("./Questions_temp.txt");
    Scanner sc;

    try {
        sc = new Scanner(myfile);
        fwrite = new FileWriter(tempFile);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split("\t");

                if (parts[0].equals(questionToDelete)) {
                    deleted = true;
                } else {
                    fwrite.write(line + "\n");
                }
        }

        fwrite.flush();
        fwrite.close();
        sc.close();

        if (deleted) {
            myfile.delete();
            tempFile.renameTo(myfile);
        }

        else{
            tempFile.delete();
        }

    } catch (IOException ioe) {
        ioe.printStackTrace();
    }

    return deleted;
}


}
