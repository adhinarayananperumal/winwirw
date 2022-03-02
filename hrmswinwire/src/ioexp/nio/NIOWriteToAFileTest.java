package ioexp.nio;

public class NIOWriteToAFileTest {

	public static void main(String[] args) {

		try {
			NIOWriteToAFile nioWriteToAFile = new NIOWriteToAFile();
			nioWriteToAFile.writeToAFile();
			System.out.println("success..............");
		} catch (Exception e) {
			System.out.println("Problem happened....." + e.toString());
		}
	}

}
