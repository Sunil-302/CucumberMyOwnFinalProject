package practiceJavaCode;

public class LeapYearOrNot {

	public static void main(String[] args) {

		int year = 2012;

		if (year % 4 == 0) {

			if (year % 100 == 0) {

				if (year % 400 == 0) {
					System.out.println("This is a leap year");
				} else {

					System.out.println("This is a NOT leap year");
				}

			} else {

				System.out.println("This is a  leap year");
			}

		} else {

			System.out.println("This is NOT leap year");

		}

	}

}
