package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class testFileOutput {
	private static final String filePath = "c:\\javafsd\\out\\testout.txt";

	public static void main(String[] args) {

		// testout1();
		// testout2();
		// testinput1();
		testinput2();

	}
	private static void testinput2() {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			int i=0;
			while ( (i=fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static void testinput1() {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			int i = fis.read();
			System.out.println((char)i);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void testout2() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			String s = "Hello world from java program";
			fos.write(s.getBytes());
			fos.close();
			System.out.println("End.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void testout1() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			fos.write(65);
			fos.close();
			System.out.println("End.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
