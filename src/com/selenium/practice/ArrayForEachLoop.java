package com.selenium.practice;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		 //below we declared an array and stored some elements on indexes
		int [] b={1,2,3,4,5,6,7}; // size is 7
		System.out.println(b.length);
		//System.out.println(b[7]);// array out of bound exception
		System.out.println(b[6]);
		
		// below we created an array with size 10
		
		int[] a= new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		//a[10]=11;// here we wont get compile time error..will get runtime error as array out of bound exception
		for (int i : a) {
			
			System.out.println(i);
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			
			System.out.println(a[i]);
			
		}

	}

}
