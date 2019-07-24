package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortNamesTest {
    SortNames sort;

    @Before
    public void setUp() throws Exception {
        this.sort=new SortNames();
    }

    @After
    public void tearDown() throws Exception {
        this.sort=null;
    }
    @Test
    public void givenStringInputShouldReturnSortedNamesOutput() {
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Alice");
        expectedResult.add("Bluto");
        expectedResult.add("Eugene");
        expectedResult.add("Harry");
        expectedResult.add("Olive");

        ArrayList<String> actual = sort.getNamesSorted("Harry Olive Alice Bluto Eugene");
        assertEquals(expectedResult, actual);
    }
    @Test
    public void givenNullInputShouldReturnNullOutput() {
        ArrayList<String> expectedResult =null;
        ArrayList<String> actualResult = sort.getNamesSorted(null);
        assertEquals(expectedResult,actualResult);
    }
}