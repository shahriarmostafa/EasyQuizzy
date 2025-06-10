package Entities;
import java.io.*;
import java.util.Scanner;

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
    public void addQuestion() {
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
    File myfile = new File("./Questions.txt");
    File tempFile = new File("./Questions_temp.txt");
    Scanner sc = null;
    FileWriter fwrite = null;
    
    try {
        sc = new Scanner(myfile);
        fwrite = new FileWriter(tempFile);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split("\t");
            if (parts.length >= 7) {
                // Check if this is the question to update
                if (parts[0].equalsIgnoreCase(oldQuestionText)) {
                    // Write updated question info instead of old line
                    String updatedLine = this.questionText + "\t" + this.optionA + "\t" + this.optionB + "\t" + this.optionC + "\t" + this.optionD + "\t" + this.correctAnswer + "\t" + this.department;
                    fwrite.write(updatedLine + "\n");
                    updated = true;
                } else {
                    // Write line as is
                    fwrite.write(line + "\n");
                }
            }
        }
        fwrite.flush();
        fwrite.close();
        sc.close();

        if (updated) {
            if (!myfile.delete()) {
                System.err.println("Could not delete original question file");
                return false;
            }
            if (!tempFile.renameTo(myfile)) {
                System.err.println("Could not rename temp file");
                return false;
            }
        } else {
            tempFile.delete();
        }

    } catch (IOException ioe) {
        ioe.printStackTrace();
    }

    return updated;
}

}
