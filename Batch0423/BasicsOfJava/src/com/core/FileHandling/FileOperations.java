package com.core.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	// create a file
	private static void createFile(String fileName) {
		File f = new File(fileName);

		try {
			if (f.createNewFile())
				System.out.println("File has been created : " + fileName);
			else
				System.out.println("File exists alredy : " + fileName);
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("Exception raised while craeting file : " + fileName);
		}
	}

	// write content to the file
	private static void writeToFile(String fileName, String content, boolean append) {
		try {
			FileWriter writer = new FileWriter(fileName, append);
			writer.write(content);
			writer.close();
			System.out.println("Writing is completed...");
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("Exception raised while writing file : " + fileName);
		}
	}

	// read file contents and print it on console
	private static void readFile(String fileName) {
		File file = new File(fileName);
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("Exception raised while reading the file : " + fileName);
		}
	}

	private static void deleteFile(String filePath) {
		File f = new File(filePath);
		if (f.delete())
			System.out.println("File has been removed : " + filePath);
		else
			System.out.println("We can't delete this file : " + filePath);
	}

	public static void main(String[] args) {
		String file = "test.txt";

		// create a file
		// createFile(file);

		// write to file
		// writeToFile(file,
		// "Chandrayaan-3 is the third Indian lunar exploration mission under the Indian
		// Space Research Organisation's (ISRO) Chandrayaan programme.",
		// false);
		//
		// writeToFile(file,
		// " It consists of a lander named Vikram and a rover named Pragyan, similar to
		// those of the Chandrayaan-2 mission.",
		// true);

		// read a file
		// readFile(file);

		// delete a file
		// deleteFile(file);
	}

}
