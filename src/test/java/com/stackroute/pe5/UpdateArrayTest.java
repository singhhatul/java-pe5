package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class UpdateArrayTest {
    UpdateArray updateArray;

    @Before
    public void setUp() throws Exception {
        this.updateArray=new UpdateArray();
    }

    @After
    public void tearDown() throws Exception {
        this.updateArray=null;
    }
    @Test
    public void givenInputArrayShouldReturnUpdatedArray(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Melon");
        fruits.add("Berry");
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Apple");
        expectedResult.add("Grape");
        expectedResult.add("Melon");
        expectedResult.add("Mango");

        ArrayList<String> actualResult=updateArray.getFruitsUpdated(fruits);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    public void givenNullInputArrayShouldReturnNull() {
        ArrayList<String> expectedResult = null;
        ArrayList<String> actualResult = updateArray.getFruitsUpdated(null);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void givenInputArrayShouldReturnEmptyArray(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Melon");
        fruits.add("Berry");
        ArrayList<String> expectedResult = new ArrayList<>();
        ArrayList<String> actualResult=updateArray.getFruitsDeleted(fruits);
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void givenNullArrayInputArrayShouldReturnNull() {
        ArrayList<String> expectedResult = null;
        ArrayList<String> actualResult = updateArray.getFruitsDeleted(null);
        assertEquals(expectedResult, actualResult);
    }
}