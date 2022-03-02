package ioexp.nio;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathExample {

	public static void main(String[] args) {

		
		
		FileSystem fs = FileSystems.getDefault();
		
        Iterable<FileStore> it = fs.getFileStores();
		
        Iterator<FileStore> iterator = it.iterator();
        System.out.println("FileStrores are:\n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		
        Path currentDir = Paths.get(".");
        System.out.println(currentDir.toAbsolutePath());
		
		
	}

}
