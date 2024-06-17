package com.javaBasics;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {

		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value of a:");
		a = sc.nextInt();
		
		System.out.println("Enter a value of b:");
		b = sc.nextInt();
		
		sc.close();
		
		System.out.println("Before Swapping - a :" + a + ", b : " + b);
		
		//swapping of numbers without using third variable
		
		a = a + b;
		b = b - a;
		a = a - b;
		
		System.out.println("After Swapping - a :" + a + ", b : " + b);	
	}

}
