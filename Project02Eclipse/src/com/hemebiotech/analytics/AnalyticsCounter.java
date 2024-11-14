package com.hemebiotech.analytics;

import com.ISymptomWriter;

import java.util.List;
import java.util.Map;



public class AnalyticsCounter {

	private ISymptomReader reader;
	private ISymptomWriter writer;

	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer) {
		this.reader = reader;
		this.writer = writer;
	}

	public List<String> getSymptoms() {
		return reader.getSymptoms();
	}

	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		return new CountSymptoms().countSymptoms(symptoms);
	}

	public Map<String, Integer> sortSymptoms(Map<String, Integer> symptoms) {
		return new SortSymptoms().sortSymptoms(symptoms);
	}

	public void writeSymptoms(Map<String, Integer> symptoms) {
		writer.writeSymptoms(symptoms);
	}
}


// 	public static void main(String args[]) throws Exception {
// 		// first get input
// 		try (
// 		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"))) { // Read symptoms file
// 			String line = reader.readLine();  // get first symptom

// 			// int i = 0;
// 			// int headCount = 0;
// 			// int rashCount = 0;
// 			// int pupilCount = 0;
// 			// while (line != null) {
// 			// 	// i++;
// 			// // 	System.out.println("symptom from file: " + line);
// 			// // 	if (line.equals("headache")) {
// 			// // 		headCount++;
// 			// // 		System.out.println("number of headaches: " + headCount);
// 			// // 	}
// 			// // 	else if (line.equals("rash")) {
// 			// // 		rashCount++;
// 			// // 	}
// 			// // 	else if (line.contains("pupils")) {
// 			// // 		pupilCount++;
// 			// // 	}

// 			// 	line = reader.readLine();	// get another symptom
// 			// }
			
// 			// next generate output
// 			FileWriter writer = new FileWriter ("result.out");
// 			// writer.write("headache: " + headCount + "\n");
// 			// writer.write("rash: " + rashCount + "\n");
// 			// writer.write("dialated pupils: " + pupilCount + "\n");
// 			// writer.close();
// 		}
// 	}
// }
