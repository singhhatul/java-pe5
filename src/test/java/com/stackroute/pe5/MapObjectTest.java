package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapObjectTest {
    MapObject mapObject;

    @Before
    public void setUp() throws Exception {
        mapObject = new MapObject();
    }

    @After
    public void tearDown() throws Exception {
        mapObject = null;
    }

    @Test
    public void givenMapObjectShouldReturnExchangedValue() {
        String expextedResult = "{val2=mars, val1= }";
        Map<String, String> map = new HashMap<>();
        map.put("val1", "mars");
        map.put("val2", "saturn");
        String actualResult = mapObject.mapValueExchanger(map);
        assertEquals(expextedResult, actualResult);
    }

    @Test
    public void givenNullInputShouldReturnNull() {
        String expextedResult =null;
        String actualResult = mapObject.mapValueExchanger(null);
    }
}