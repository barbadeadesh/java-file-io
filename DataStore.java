package com.bridgelab.iofiles;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Uc4_DataStore {

	public static void main(String[] args) {

		// Write your employee data
		int empid = 1;
		String empname = "Adesh";
		double salary = 2000.00;
		System.out.println(empid); // print the employee id
		System.out.println(empname); // print the name of employee
		System.out.println(salary); // print the salary of employee
		try {
			OutputStream out = new FileOutputStream("D:\\");

			String data = null;

			// Converts the string into bytes
			byte[] dataBytes = data.getBytes();

			// Writes data to the output stream
			out.write(dataBytes);

			// Closes the output stream
			out.close();
		}

		catch (Exception e) {
			e.getStackTrace();
		}

	}

}
