import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class Account {

    private String email, password, age, fullname, location, education, experience, skills;
    private File file;
    private FileWriter fWriter;
    private Scanner s;
    public static int accountNum;

    public Account() {System.out.println("Empty cons for account");}

    public Account(String email, String password, String fullname, String location, String age, String education, String experience, String skills) {
        this.email=email; 
        this.password=password;
        this.fullname=fullname;
        this.location=location;
        this.education=education;
        this.experience=experience;
        this.skills=skills;  
    }

    public void getAccountNum() {
        try {

            file=new File("./Datas/LoginInfo.txt");
            s=new Scanner(file);
			
			while(s.hasNextLine())
			{
                
				String line=s.nextLine();
                if (line.contains("SL~")) {
                    String[] value = line.split("~");
                    accountNum = Integer.parseInt(value[1]);
                }
			}

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public boolean checkEmail(String email) {
        getAccountNum();
        boolean flag=true;
		file=new File("./Datas/LoginInfo.txt");
        try
		{
			s=new Scanner(file);
			
			while(s.hasNextLine())
			{
				String line=s.nextLine();
                if (!(line.contains("SL~"))&&line.contains("~")) {
                    String[] value=line.split("~");
                    //System.out.println(value.length);
				    if(value[0].equals(email))
				    {
					    flag=false;
                        break;
				    }
                    
                }
				
			}
			
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

        return flag;

    }

    public void setEmail(String email) {this.email = email;}
    public void setPW(String password) {this.password=password;}
    public void setFullName(String fullname) {this.fullname=fullname;}
    public void setLocation(String location) {this.location=location;}
    public void setEducation(String education) {this.education=education;}
    public void setExperience(String experience) {this.experience=experience;}
    public void setSkills(String skills) {this.skills=skills;}

    public String getEmail() {return email;}
    public String getPW() {return password;}
    public String getFullName() {return fullname;}
    public String getLocation() {return location;}
    public String getEducation() {return education;}
    public String getExperience() {return experience;}
    public String getSkills() {return skills;}

    public void addAcount() {
        {
            

            getAccountNum();

            try
            {
                accountNum += 1;
                file=new File("./Datas/LoginInfo.txt");
                //file.createNewFile();
                fWriter=new FileWriter(file,true);
                fWriter.write("=======================\n");
                fWriter.write("SL~"+accountNum+"\n");
                fWriter.write(getEmail()+"~");
                fWriter.write(getPW()+"\n");
                fWriter.write(getFullName()+"\n");
                fWriter.write(getLocation()+"\n");
                fWriter.write(getEducation()+"\n");
                fWriter.write(getExperience()+"\n");
                fWriter.write(getSkills()+"\n====================\n");
                
                fWriter.flush();
                fWriter.close();

                //System.out.println(accountNum);
                
            }
            catch(IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
    }
    

    public boolean checkAccount(String email, String password) {
        getAccountNum();
        boolean flag=false;
		file=new File("./Datas/LoginInfo.txt");
        try
		{
			s=new Scanner(file);
			
			while(s.hasNextLine())
			{
				String line=s.nextLine();
                if (!(line.contains("SL~"))&&line.contains("~")) {
                    String[] value=line.split("~");
                    //System.out.println(value.length);
				    if(value[0].equals(email)&&value[1].equals(password))
				    {
					    flag=true;
                        break;
				    }
                    
                }
				
			}
			
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

        return flag;
    }

    public int returnAccNum(String email, String password) {
        int accNum;
		file=new File("./Datas/LoginInfo.txt");
        try
		{
			s=new Scanner(file);
			
			while(s.hasNextLine())
			{
                String line1=s.nextLine();
                if(s.hasNextLine()) {
                    String line2=s.nextLine();
                    if(s.hasNextLine()) {
                        String line3=s.nextLine();
                        if (!(line3.contains("SL"))&&(line3.contains("~"))) {
                            String[] value=line3.split("~");
                            //System.out.println(value.length);
                            //System.out.println(value[0].equals(email));
                            if((value[0].equals(email))&&(value[1].equals(password)))
                            {
                                String[] valueE = line2.split("~");
                                return Integer.parseInt(valueE[1]);
                            }
                            //System.out.println(line1);
                            //System.out.println(line2);
                            //System.out.println(line3);
                        }
                    }
                }
            System.out.println("Loop"); 
			}
			
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
        return 0;
    }

    public String returnInfo(int accNum, int info) {

        String infoA[];
		file=new File("./Datas/LoginInfo.txt");
        try
		{
			s=new Scanner(file);
			
			while(s.hasNextLine())
			{
                String line1=s.nextLine();
                if (line1.contains("SL")&&line1.contains("~")) {
                    String[] value=line1.split("~");
                    //System.out.println(value.length);
				    if(Integer.parseInt(value[1])==accNum)
				    {
                        infoA = new String[6];
                        for (int i = 0; i < 6; i++) {
                            infoA[i] = s.nextLine();
                        } 
                        System.out.println(infoA[info]);
                        
                        if (info == 0) {
                            String[] value2=infoA[0].split("~");
                            infoA[0] = value2[0];
                        }
                        return infoA[info];


				    }
                    
                }
				
			}
			
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
        return "a";
    }

    public void addBio(int accNum, String bio) {

		file=new File("./Datas/ProfileBio.txt");
        try
		{
            boolean flag = false;
			s=new Scanner(file);
			fWriter= new FileWriter(file,true);
            getAccountNum();

			while(s.hasNextLine())
			{
				String line=s.nextLine();
                if (line.contains("SL~")) {
                    fWriter.write(bio);
                    flag = true;
                }
				
			}
            

            if (!flag) {
                fWriter.write("SL~"+accNum+"\n");
                fWriter.write(bio+"\n");
            }
			
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}


    }

}
