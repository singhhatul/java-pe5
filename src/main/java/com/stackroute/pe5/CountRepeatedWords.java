package com.stackroute.pe5;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountRepeatedWords {
    public String getCountOfWords(String str) {

        if (str == null) {
            return null;
        } else {
            //Converting given string to arraylist
            List<String> list = Arrays.asList(str.split("[\\W_]+"));

            //Creating a HashMap containing char as a key and occurrences as  a value
            Map<String, Integer> map = new HashMap<>();

            //checking each char of strArray
            for (String each : list) {
                //If char is present in charCountMap, incrementing it's count by 1
                if (map.containsKey(each)) {
                    map.put(each, map.get(each) + 1);
                } else {
                    //If char is not present in charCountMap,
                    //putting this char to charCountMap with 1 as it's value
                    map.put(each, 1);
                }
            }
            return map.toString();
        }
    }
}
