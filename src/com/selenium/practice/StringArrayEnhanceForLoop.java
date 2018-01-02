package com.selenium.practice;

public class StringArrayEnhanceForLoop {

	public static void main(String[] args) {

		// below declared string array and passed some string values
		String[] str = { "venkat", "vinni", "chintu", "vadina", "raghu", "dinesh" };

		// we have to print the above string values using foreach loop

		for (String string : str) {
			System.out.println(string);// this line prints all the string values
			System.out.println(string.length());// this line prints length of
												// each string

		}

		String[] str1 = { "venkat", "vinni", "chintu", "vadina", "raghu", "dinesh" };
		String [] str2=str1; ///copying the str1 values to str2
		System.out.println(str2.length);
		
		//below is enhanced for loop
		
		for (String string : str2) {
			System.out.println(string);
		}
        
		//below is normal for loop
		
		for (int i=0; i< str2.length; i++) {
			System.out.println(str2[i]);
		}
	}

}
