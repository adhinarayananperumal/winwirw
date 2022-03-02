package ioexp.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

	public static void main(String[] args) {

		try {

			Path from = Paths.get("c:\\winwin\\feed\\cc.txt");
			Path to = Paths.get("c:\\winwin\\feed\\copy111.txt");

			if (Files.deleteIfExists(to)) {
				System.out.println("File exist so it is deleted......");
			}

			Files.copy(from, to);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
