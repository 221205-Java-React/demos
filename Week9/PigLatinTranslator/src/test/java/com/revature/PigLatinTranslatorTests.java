package com.revature;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.IllegalFormatException;

import static org.junit.Assert.assertEquals;

public class PigLatinTranslatorTests {

    public static PigLatinTranslator plt;

    /* JUnit 4 Annotations include:

    @Before - The block of code will run BEFORE EVERY test
    @After - The block of code will run AFTER EVERY test
    @BeforeClass - The block of code will run ONCE, BEFORE the tests run
    @AfterClass - The block of code will run ONCE, AFTER the tests run
    @Test - Declares a method as a test method
     */

    @Before
    public void instantiateTranslator(){
        plt = new PigLatinTranslator();
    }

    //Look into the different assert methods in JUnit 4 - assertThat is an especially powerful one

    /* good luck writing tests!!
       Here's one implemented test and two unimplemented tests to start you off...
       but there should be quite a few tests to write from the PigLatinTranslator methods. */

    @Test
    public void testEnglishToPigLatinTranslationWorks(){
        assertEquals(plt.englishToPigLatin("How are you"), "owhay areyay ouyay ");
        //NOTE: The Pig Latin Translator adds a space at the end of each word!!
    }

    @Test
    @Ignore //TODO: Remove this @Ignore annotation when you implement this test
    public void testDefaultMessageReturnsUponEmptyStringInput(){

    }

    @Test //TODO: make this test check for a certain exception to get thrown
    @Ignore //TODO: Remove this @Ignore annotation when you implement this test
    public void testNumberInsideInputThrowsException(){
        plt.englishToPigLatin("It was his hat mister Krabs. He was number 1!");
    }

    //WRITE TESTS BELOW THIS. (OR ABOVE. I AM NOT YOUR MOTHER.)

}
