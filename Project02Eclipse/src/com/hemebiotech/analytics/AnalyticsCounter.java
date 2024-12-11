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