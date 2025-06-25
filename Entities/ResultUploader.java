package Entities;

import java.io.*;
import java.util.*;

public class ResultUploader {

    private String username;
    private int result;
    private String department;
    private String fullName;
    Scanner  sc;
    File myfile;


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
            FileWriter fwrite = new FileWriter("./DataBase/Result.txt", true);
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

    public String getResultWithUserName(String username) {
        String lastResult = "None";
		try
		{
			myfile=new File("./DataBase/Result.txt");
			sc=new Scanner(myfile);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
				if(value[3].equals(username))
				{
					lastResult = value[1];
				}
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return lastResult;
    }

    public String getRightAnsweredWithUserName(String username){
        int totalRightAnswered = 0;
		try
		{
			myfile=new File("./DataBase/Result.txt");
			sc=new Scanner(myfile);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
				if(value[3].equals(username))
				{
					totalRightAnswered = totalRightAnswered + Integer.parseInt(value[1]);
				}
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return String.valueOf(totalRightAnswered);
    }
    public String getTotalQuizAttendedWithUserName(String username){
        int totalQuizAttended = 0;
		try
		{
			myfile=new File("./DataBase/Result.txt");
			sc=new Scanner(myfile);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
				if(value[3].equals(username))
				{
					totalQuizAttended = totalQuizAttended + 1;
				}
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return String.valueOf(totalQuizAttended);
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
