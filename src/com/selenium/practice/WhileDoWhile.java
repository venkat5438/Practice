package com.selenium.practice;

public class WhileDoWhile {

	public static void main(String[] args) {
		int i=1;
		// below we are giving condition and printing values 1 to 10
		while(i<=10){
			
			System.out.println(i);
			i++;
		}
		// below we are printing the values from 10 to 1
		 int a=10;
		while(a>=1){
			System.out.println(a);
			a--;
		}
		
		//inside while we can take if..to print except 7 number
		int c=1;
		while(c<=10){
			
			if(c!=7){
				System.out.println(c);
			}
			c++;
		}
		// below we are printing except 4 and 7
int d=1;
while(d<=10){
	
	if((d!=4)&&(d!=7)){
		System.out.println(d);
		d++;
	}
}
	}

}
