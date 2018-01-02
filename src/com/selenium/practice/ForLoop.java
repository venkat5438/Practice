package com.selenium.practice;

public class ForLoop {

	public static void main(String[] args) {
		
		//below we are printing 1 to 10 numbers
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		// below we are printing from 10 to 1
		for (int i = 10; i>=1; i--) {
			System.out.println(i);
			
		}
		
		// except 7 number i want to print(inside loop we can take conditional statements and vice versa)
		
		for (int i = 1; i <=10; i++) {
			if (i!=7) {
				System.out.println(i);
				
			}
			
			
			// i want to print numbers except 4 and 7 so we need to use compound condition
			
			for (int j = 1; j <= 10; j++) {
				if ((j!=4)&& (j!=7)) {
					System.out.println(j);
					
				}
				
			}
			
		}

	}

}
