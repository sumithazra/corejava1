package file;

import java.io.*;


public class CreateFileExample {

	public static void main( String[] args )
    {	
    	try {
    		 
	      File file = new File("C:/Users/hp/Documents/FileIO/newfile.txt");
	      
	      if (file.createNewFile()){
	        System.out.println("File is created!");
	      }else{
	        System.out.println("File already exists.");
	      }
	      
    	} catch (IOException e) {
	      e.printStackTrace();
	}
    }
	
}
