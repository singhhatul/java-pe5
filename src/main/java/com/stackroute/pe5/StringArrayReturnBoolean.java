package com.stackroute.pe5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringArrayReturnBoolean {
    public Map getBooleanManipulation(String[] arr) {
        if(arr==null)return null;
        //Converting given string to arraylist
        List<String> list= Arrays.asList(arr);

        //Creating a HashMap containing char as a key and occurrences as  a value
        Map<String,Integer> map=new HashMap<>();

        //checking each char of strArray
        for(String str:list){
            //If char is present in charCountMap, incrementing it's count by 1
            if(map.containsKey(str)){
                map.replace(str,map.get(str)+1);
            }else{
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                map.put(str,1);
            }
        }

        // hash map for optput storage

        Map<String,Boolean> booleanMap=new HashMap<>();
        for(String str:map.keySet()){
            //if element get count greater than 2 or equal to 2 then add true value to that element
            if(map.get(str)>=2){
                booleanMap.put(str,true);
            }else {
                //if element get count less than 2 then add false value to that element
                booleanMap.put(str,false);
            }
        }
        return booleanMap;

    }
}
