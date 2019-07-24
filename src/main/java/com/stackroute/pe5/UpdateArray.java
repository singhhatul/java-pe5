package com.stackroute.pe5;

import java.util.ArrayList;

public class UpdateArray {
    public ArrayList<String> getFruitsUpdated(ArrayList<String> fruits) {
        if (fruits == null) {
            return null;
        } else {
            int index = fruits.indexOf("Berry");
            fruits.set(index, "Mango");

            return fruits;
        }
    }

    public ArrayList<String> getFruitsDeleted(ArrayList<String> fruits) {
        if (fruits == null) {
            return null;
        } else {
            fruits.clear();
            return fruits;
        }
    }
}
