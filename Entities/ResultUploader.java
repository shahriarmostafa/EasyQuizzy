package Entities;

import java.io.*;

public class ResultUploader {

    private String username;
    private int result;
    private String department;
    private String fullName;


    public ResultUploader(){

    }

    public ResultUploader(String username, int result, String department, String fullName){
        this.department = department;
        this.result = result;
        this.fullName = fullName;
        this.username = username;
    }

    public void uploadResult() {
        try{
            FileWriter fwrite = new FileWriter("Result.txt", true);
            fwrite.write(getFullName() + "\t");
            fwrite.write(getResult() + "\t");
            fwrite.write(getDepartment() + "\t");
            fwrite.write(getUsername() + "\n");
            fwrite.close();
            fwrite.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
