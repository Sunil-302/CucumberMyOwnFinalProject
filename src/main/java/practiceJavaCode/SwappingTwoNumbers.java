package practiceJavaCode;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		int first = 20 ;
		int second = 30;
		
		System.out.println("Befor Swap First = "+first +   "Second = "+second );
		
		int temp = first;
		
		first = second;
		
		second = temp;
		
		System.out.println(first +" "+second );
		
		//Checking a number is even or Odd by terinory Operator
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Give me some number = ");
		
		int  number = reader.nextInt();
		
		
		Object evenOdd = (number % 2 == 0)? "Even" : "Odd";
		
		System.out.println(evenOdd);
		
		
				
		
	}

}
