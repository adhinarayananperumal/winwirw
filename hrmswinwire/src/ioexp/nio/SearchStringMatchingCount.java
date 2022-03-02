package ioexp.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SearchStringMatchingCount {

	public static void main(String[] args) {
		
		int wordFoundCount =0;

		Path path = Paths.get("c:\\winwin\\feed\\cc.txt");
		try {
			List<String> lines = Files.readAllLines(path);
			
			for(String line : lines) {
				System.out.println(line);
				String[] token = line.split(" ");
				
				for(String word:token) {
					System.out.println(word);

					if(word.equals("Hi")) {
						wordFoundCount++;
					}
				}
			}
			System.out.println("Total no of words found ... " + wordFoundCount);
		} catch (IOException e) {
			// something failed
			e.printStackTrace();
		}
	}

}
