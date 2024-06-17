package com.javaBasics;

public class Example10 {

	public static void main(String[] args) {


        int num, rem=0, sum=0;
        num = 4567;
        
        
        /**num=12345;
         * sum=0;
         */
        /**
    	 * rem1 = num%10 => 5
    	 * sum = sum+rem1 => 5
    	 * num = num/10 =>1234 
    	 * 
    	 *  rem1 = num%10 => 4
    	 * sum = sum+rem1 => 9
    	 * num = num/10 =>123
    	 * 
    	 *  rem1 = num%10 => 3
    	 * sum = sum+rem1 => 12
    	 * num = num/10 =>12
    	 * 
    	 *  rem1 = num%10 => 2
    	 * sum = sum+rem1 => 14
    	 * num = num/10 =>1
    	 * 
    	 * rem1 = num%10 => 1
    	 * sum = sum+rem1 => 15
    	 * num = num/10 =>0
    	 */
      
        while(num>0)
        {
        	
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
		
        System.out.print(sum);        
	}

}
