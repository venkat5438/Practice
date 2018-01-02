package com.selenium.practice;

import java.util.Scanner;

public class ScannerReadData {

	public static void main(String[] args) {
		// below we created scanner object and provided system.in data stream to read the data
		Scanner scan=new Scanner(System.in);
		System.out.println("Read your name");
		String str=scan.nextLine();
		System.out.println("your name is "+ str);
		
		System.out.println("enter your mobile number");
		Long num=scan.nextLong();
		System.out.println("my number is "+ num);
		
		
		System.out.println("read charecter");
		char ch=scan.next().charAt(0);
		System.out.println("entered char is "+ch);
		
		System.out.println("read boolean");
		boolean bool=scan.nextBoolean();
		System.out.println("enter value "+bool);
		
	}

}
