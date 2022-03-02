package ioexp.nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOWriteToAFile {

	void writeToAFile() throws IOException {
		Path path = Paths.get("c:\\winwin\\feed\\cc.txt");
		 Files.write(path, "Hdhdhryryri".getBytes(),StandardOpenOption.APPEND);
		//BufferedWriter bufferedWriter = Files.newBufferedWriter(path);
		//bufferedWriter.write("Hi................................");
	}

}
