//package com.stackroute.pe5;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class StringArrayReturnBooleanTest {
//    StringArrayReturnBoolean stringArrayReturnBoolean;
//
//    @Before
//    public void setUp() throws Exception {
//        this.stringArrayReturnBoolean=new StringArrayReturnBoolean();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        this.stringArrayReturnBoolean=null;
//    }
//    @Test
//    public void givenStringArrayShouldReturnTrueFalse(){
//        String arr[] = {"a","b","c","d","a","c","c"};
//        String[] expectedResult={"a : true","b :false ","c :true","d : false"};
//        String[] actualResult=stringArrayReturnBoolean.getBooleanManipulation(arr);
//        assertArrayEquals(expectedResult,actualResult);
//
//    }
//
//}