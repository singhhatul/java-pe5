package com.stackroute.pe5;

import java.util.Map;

public class MapObject {
    public String mapValueExchanger(Map<String, String> map) {
        if (map == null) {
            return null;
        } else {

            String val1 = map.get("val1");
            map.replace("val2", val1);
            map.replace("val1", " ");
            return map.toString();
        }
    }
}
