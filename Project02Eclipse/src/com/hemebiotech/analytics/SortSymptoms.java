package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class SortSymptoms {

    public Map<String, Integer> sortSymptoms(Map<String, Integer> symptomsList) {
        return new TreeMap<>(symptomsList);
    }
}