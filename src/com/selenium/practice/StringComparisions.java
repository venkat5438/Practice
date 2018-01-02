package com.selenium.practice;

public class StringComparisions {

	public static void main(String[] args) {
		String str1="chintu";
		String str2="CHINTU";
		String str3="CHINTU";
		String str4="baddam";
		
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str1.compareTo(str2));//ASCII values //32 A to Z= 65 to 90, a to z =97 to 122, 0 to 9 48 to 57

	}

}
