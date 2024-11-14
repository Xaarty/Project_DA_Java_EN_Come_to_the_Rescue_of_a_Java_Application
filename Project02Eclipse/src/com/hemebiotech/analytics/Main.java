package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {

    private final static String FILE_PATH_SYMPTOMS = "symptoms.txt";
    private final static String FILE_PATH_RESULT = "result.out";
    public static void main(String[] arg) {

        AnalyticsCounter analyticsCounter = new AnalyticsCounter(new ReadSymptomDataFromFile(FILE_PATH_SYMPTOMS), new WriteSymptomDataToFile(FILE_PATH_RESULT));

        List<String> symptoms = analyticsCounter.getSymptoms();
        Map<String, Integer> symptomsCounting = analyticsCounter.countSymptoms(symptoms);
        Map<String, Integer> symptomsSorting = analyticsCounter.sortSymptoms(symptomsCounting);
        analyticsCounter.writeSymptoms(symptomsSorting);

    }
}