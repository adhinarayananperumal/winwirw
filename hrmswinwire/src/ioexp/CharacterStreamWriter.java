package ioexp;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharacterStreamWriter {

	public static void main(String[] args) {
		Writer out = null;
		try {
			out = new FileWriter("C:\\winwin\\dataFile.txt");

			String msg = "The sample data";

			out.write(msg);
			System.out.println("Writing done!!!");

			System.out.println("End...");
			
			if (out != null) {
				out.close();
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
