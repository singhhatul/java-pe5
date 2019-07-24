package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountRepeatedWordsTest {
    CountRepeatedWords words;

    @Before
    public void setUp() throws Exception {
        this.words=new CountRepeatedWords();
    }

    @After
    public void tearDown() throws Exception {
        this.words=null;
    }
    @Test
    public void givenInputStringShouldReturnCountOfWords() {

        String expectedResult ="{one=5, two=2, three=2}" ;
        String actualResult = words.getCountOfWords("one one -one___two,,three,one @three*one?two");
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void givenNullStringShouldReturnZero() {
        String expectedResult = null;
        String actualResult = words.getCountOfWords(null);
        assertEquals(expectedResult, actualResult);
    }
}