package com.selenium.practice;

public class EnhanceForLoopForArrays {

	public static void main(String[] args) {
		int[]a={1,2,3,4,5,6,7,8,9};
		
		//declare variables in array and below type for ctrl+space select foreach..print all the values whatever present in the array
		for (int i : a) {
			System.out.println(i);
		}
		//below we declared string array and passed some strings and printing all the values
		String [] str= {"chintu","venkat","baddam"};
		for(String string: str){
			System.out.println(string);
		}
		
		//below we declared string array and passed soem values..next printing all the values using normal for loop
		String [] str1= {"chintu","venkat","baddam"};
		for(int i=0; i<str1.length; i++){
			
			System.out.println(str1[i]);
		}
		
		// below we declared string object array and provided size of 5 and passed values explicitly
		String [] str2=new String [5];//declared size as 5 (indexes)
		str2[0]="chintu";
		str2[1]="baddam";
		str2[2]="vinni";
		str2[3]="pavani";
		str2[4]="raghu";
		//str2[5]="dad";  // we will get runtime error becasue array out of bound exception
		
		for (String string : str2) {
			System.out.println(string);
		}
	}

}
