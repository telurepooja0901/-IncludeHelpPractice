package com.javaBasics;

import java.util.*;

public class Example4
{
	public static void main(String args[]) {
		
		int a, b, sum;
		
		float avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number :  ");
		a = sc.nextInt();
	

		System.out.println("Enter second number : ");
		b = sc.nextInt();
		
		sc.close();

		       
		 sum = a + b;
		 avg = (float)((a + b) / 2);

		 System.out.print("Sum : " + sum + "\nAverage : " + avg);
		    
		    

	}

}
