package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringArrayReturnBooleanTest {
    StringArrayReturnBoolean stringArrayReturnBoolean;

    @Before
    public void setUp() throws Exception {
        this.stringArrayReturnBoolean=new StringArrayReturnBoolean();
    }

    @After
    public void tearDown() throws Exception {
        this.stringArrayReturnBoolean=null;
    }
    @Test
    public void givenStringArrayShouldReturnTrueFalse(){
        String[] str = {"a","b","c","d","a","c","c"};
        Map expectedResult = new HashMap<>();
        expectedResult.put("a", true);
        expectedResult.put("b", false);
        expectedResult.put("c", true);
        expectedResult.put("d", false);

        Map actualResult=stringArrayReturnBoolean.getBooleanManipulation(str);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenAnotherStringArrayShouldReturnTrueFalse(){
        String[] str = {"a","b","c","d","a","c","c","b","d"};
        Map expectedResult = new HashMap<>();
        expectedResult.put("a", true);
        expectedResult.put("b", true);
        expectedResult.put("c", true);
        expectedResult.put("d", true);

        Map actualResult=stringArrayReturnBoolean.getBooleanManipulation(str);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenNullValueShouldReturnNull(){
        Map expectedResult = null;
        Map actualResult=stringArrayReturnBoolean.getBooleanManipulation(null);
        assertEquals(expectedResult,actualResult);
    }

}