package ioexp;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileExample {

	public static void main(String[] args) {
		FileOutputStream file = null;
		try {
			file = new FileOutputStream("C:\\winwin\\feedu.txt");
			String s = "Welcome to WinWire.";
			byte b[] = s.getBytes();// converting string into byte array
			file.write(b);
			System.out.println("Wrote to file successfully........");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (file != null) {
					file.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
