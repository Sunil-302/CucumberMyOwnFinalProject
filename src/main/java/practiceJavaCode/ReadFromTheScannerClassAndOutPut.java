package practiceJavaCode;

import java.util.Scanner;

public class ReadFromTheScannerClassAndOutPut {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Give some input : ");

		int number = read.nextInt();

		System.out.println("This is the nuber " + number);

//		Hoe casting works 

		char ch = 'Z';

		int ASCII = (int) ch; // casting the character to int

		System.out.println(ASCII);

//		Quotent and remainder 

		int divident = 25;
		int divisor = 4;

		int quotent = divident / divisor;
		int remainter = divident % divisor;

		System.out.println("quotent = " + quotent + "     remainter = " + remainter);

	}

}
