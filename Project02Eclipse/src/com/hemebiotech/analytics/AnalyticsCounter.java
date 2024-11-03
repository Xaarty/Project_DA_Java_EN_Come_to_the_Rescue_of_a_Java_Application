package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		// first get input
		try (
		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"))) { // Read symptoms file
			String line = reader.readLine();  // get first symptom

			// int i = 0;
			int headCount = 0;
			int rashCount = 0;
			int pupilCount = 0;
			while (line != null) {
				// i++;
				System.out.println("symptom from file: " + line);
				if (line.equals("headache")) {
					headCount++;
					System.out.println("number of headaches: " + headCount);
				}
				else if (line.equals("rash")) {
					rashCount++;
				}
				else if (line.contains("pupils")) {
					pupilCount++;
				}

				line = reader.readLine();	// get another symptom
			}
			
			// next generate output
			FileWriter writer = new FileWriter ("result.out");
			writer.write("headache: " + headCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + pupilCount + "\n");
			writer.close();
		}
	}
}
