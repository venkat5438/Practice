package com.selenium.practice;

import java.io.File;
import java.io.IOException;

public class FileHandlingInJava {

	public static void main(String[] args) throws IOException {
		
	//	1: create folder
		// we need a File class object to handle files
		// below we created an object and giving a location and folder name to create..given path
		//File fileobject=new File("C://Users//Venkat//Desktop//Selenium");
		//below using above object and creating Selenium folder on desktop..once u run check the folder present or not
		
		//fileobject.mkdir();
		
	//	2: check the folder existence
		
		/*boolean b=fileobject.mkdir();
		if(b==true){
			
			System.out.println("folder exist on desktop");
		}
		else{
			System.out.println("folder does not exist");
		}*/
	// 3: delete folder
		
		//fileobject.delete();
		
		
	// 4: create a text file	
		File fileobject=new File("C://Users//Venkat//Desktop//Selenium.txt");
		fileobject.createNewFile();
		

	}

}
