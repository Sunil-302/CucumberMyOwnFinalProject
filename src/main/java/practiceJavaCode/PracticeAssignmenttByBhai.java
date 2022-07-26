package practiceJavaCode;

public class PracticeAssignmenttByBhai {

	public static void main(String[] args) {

		String name = "My_name-is_Sunil-Kumar_reddy";

		String[] nameSplit = name.split("-");

		for (int i = 0; i < nameSplit.length; i++) {

//			System.out.println(nameSplit[i]);

			String[] nameSplit1 = nameSplit[i].split("_");

			for (int j = nameSplit1.length - 1; j >= 0; j--) {
				System.out.print(nameSplit1[j] + "\t");

			}

			System.out.print ("   ");

		}

	}

}
