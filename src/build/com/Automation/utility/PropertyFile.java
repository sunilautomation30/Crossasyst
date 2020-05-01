package build.com.Automation.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import build.com.Automation.lib.Global;

public class PropertyFile extends Global {
	
	      
    Properties p;
 //   private final String propertyFilePath= "email.properties";
	
	public static void  property() throws Exception{
	
	FileInputStream reader=new FileInputStream("email.properties");      
    Properties p = new Properties();  
    p.load(reader);
    email = p.getProperty("Email");
	String sEmail = email.split("@")[0];
	int inum = Integer.parseInt(sEmail.substring(sEmail.length()-2, sEmail.length()));
	inum++;
	email = sEmail.substring(0, sEmail.length()-2) + inum + "@" + email.split("@")[1];
	reader.close();
	System.out.println(email);
	FileOutputStream fos = new FileOutputStream("email.properties");
	p.setProperty("Email", email);
	p.store(fos, null);
	fos.close();
	
	}

}
