package com.core.FileHandling.SerilizationI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.WriteAbortedException;
import java.util.ArrayList;

public class App {

	static String fileName = "Students.txt";

	// serialization = converting objects into file(stream)
	// deserialization = converting file(stream) into objects

	private static void writeToFile() {
		
		try {
			ArrayList<Student> list = new ArrayList<Student>();
			list.add(new Student("Purva", 65));
			list.add(new Student("Siddharth", 75));
			list.add(new Student("Afroj", 85));
			list.add(new Student("Nidhi", 62));
			list.add(new Student("Mercy", 60));
			
			for (Student s : list) {
				System.out.println(s);
			}
			
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(list);
			out.close();
			file.close();

			System.out.println("Object exported/serilized successfully..");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fis);
			
			ArrayList<Student> list = (ArrayList) in.readObject();
			
			
			in.close();
			fis.close();
			
			for (Student s : list) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		//writeToFile();
		readFromFile();
	}

}
