package com.javaBasics;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer Number :");
		
		num = sc.nextInt();
		sc.close();
		
		System.out.println("Square of" + num + " is: " + Math.pow (num, 2)); 
		
		System.out.println("Cube of " + num + "is :" + Math.pow (num, 3));
		
		System.out.println("SquareRoot of " + num + " is :" + Math.sqrt(num));
		
		
		
	}

}
