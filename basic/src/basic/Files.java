package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\PMANCHUR\\OneDrive - Capgemini\\Desktop\\LINKS.txt");
	try {
		FileInputStream f1=new FileInputStream(f);
		FileOutputStream f2=new FileOutputStream(f);
		byte[] b1=f1.readAllBytes();
		String s=new String(b1);
		System.out.println(s);
		String s1="Welcome to javaTpoint.";    
        byte b[]=s1.getBytes();//converting string into byte array    
        f2.write(b);    
        f2.close();    
        byte[] b2=f1.readAllBytes();
		String s3=new String(b2);
		System.out.println(s3);
		
	} catch (IOException e1) {
		e1.printStackTrace();
		
	}
	

	}

}
