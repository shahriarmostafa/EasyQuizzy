package Entities;
import java.lang.*;
import java.util.*;
import java.io.*;
import Frames.*;

public class Account
{
	private String uname;
	private String upass;
	private String fullName;
	
	private File myfile;
	private FileWriter fwrite;
	private Scanner sc;

	public Account(){}
	
	public Account(String uname,String upass)
	{
		this.uname=uname;
		this.upass=upass;
	}
	
	public Account(String fullName, String uname,String upass)
	{
		this.fullName = fullName;
		this.uname=uname;
		this.upass=upass;
	}
	
	public void setUserName(String uname)
	{
		this.uname=uname;
	}
	
	public void setUserPass(String upass)
	{
		this.upass=upass;
	}
	public void setFullName(String fullName)
	{
		this.fullName=fullName;
	}

	public String getFullName()
	{
		return fullName;
	}
	
	public String getUserName()
	{
		return uname;
	}
	
	public String getUserPass()
	{
		return upass;
	}

	
	public void addAccount()
	{
		try
		{
			myfile=new File("./Data.txt");
			myfile.createNewFile();
			fwrite=new FileWriter(myfile,true);

			fwrite.write(getFullName()+"\t");
			fwrite.write(getUserName()+"\t");
			fwrite.write(getUserPass()+"\n");
			
			fwrite.flush();
			fwrite.close();
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public boolean getAccount(String username,String userpass)
	{
		boolean flag=false;
		try
		{
			myfile=new File("./Data.txt");
			sc=new Scanner(myfile);
			
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String[] value=line.split("\t");
				if(value[1].equals(username)&&value[2].equals(userpass))
				{
					flag=true;
				}
			}
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
			return flag;
	}
	
}