package ioexp;

import java.util.Scanner;

public class ScanerExample {

	Scanner myObj = null; // Create a Scanner object
	String enterValues = "";

	void readMultipleLine() {
		try {
			myObj = new Scanner(System.in); // Create a Scanner object

			while (!enterValues.equals("q")) {
				System.out.println("Enter values ");
				enterValues = myObj.nextLine(); // Read user input
				System.out.println("Entered values" + enterValues); // Output user input
				enterValues.trim();
				
				if (enterValues.equals("q")) {
					System.out.println("No more values will be get from user"); // Output user input
				}
			}
		} finally {
			if (myObj != null) {
				myObj.close();
			}
		}
	}

	void readSingLine() {
		try {
			myObj = new Scanner(System.in); // Create a Scanner object
			System.out.println("Enter username");
			String userName = myObj.nextLine(); // Read user input
			System.out.println(":Username is " + userName); // Output user input
		} finally {
			if (myObj != null) {
				myObj.close();
			}
		}
	}

}