package com.myprojects.romannumerals;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Unit testing class for the {@link RomanNumeralService}. Check the Business Logic of the
 * backend, without starting the whole application.
 */
@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class RomanNumeralServiceUnitTest {
    private final RomanNumeralService romanNumeralService = new RomanNumeralService();

    /**
     * Testcase for input number in the order of units.
     */
    @Test
    public void whenUnitsOrderArabicNumberIsProvided_thenRetrievedRomanNumeralIsCorrect(){
        //given
        int inputNumber = 3;
        //when
        String romanOutput = romanNumeralService.convertToRoman(inputNumber);
        //then
        Assert.assertEquals("III",romanOutput);

    }


    /**
     * Testcase for input number in the order of tens.
     */
    @Test
    public void whenTensOrderArabicNumberIsProvided_thenRetrievedRomanNumeralIsCorrect(){
        //given
        int inputNumber = 90;
        //when
        String romanOutput = romanNumeralService.convertToRoman(inputNumber);
        //then
        Assert.assertEquals("XC",romanOutput);

    }
    /**
     * Testcase for input number in the order of hundreds.
     */
    @Test
    public void whenHundredsOrderArabicNumberIsProvided_thenRetrievedRomanNumeralIsCorrect(){
        //given
        int inputNumber = 199;
        //when
        String romanOutput = romanNumeralService.convertToRoman(inputNumber);
        //then
        Assert.assertEquals("CXCIX",romanOutput);

    }

    /**
     * Testcase for input number in the order of thousands.
     */
    @Test
    public void whenThousandsOrderArabicNumberIsProvided_thenRetrievedRomanNumeralIsCorrect(){
        //given
        Integer inputNumber = 2401;
        //when
        String romanOutput = romanNumeralService.convertToRoman(inputNumber);
        //then
        Assert.assertEquals("MMCDI",romanOutput);
    }

    /**
     * Testcase for input Roman numeral String in the order of units.
     */
    @Test
    public void whenUnitsOrderRomanNumeralIsProvided_thenRetrievedArabicNumeralIsCorrect(){
        //given
        String romanNumeral = "VII";
        //when
        Integer arabicOutput = romanNumeralService.convertToArabic(romanNumeral);
        //then
        Assert.assertEquals(7,(long)arabicOutput);
    }

    /**
     * Testcase for input Roman numeral String in the order of tens.
     */
    @Test
    public void whenTensOrderRomanNumeralIsProvided_thenRetrievedArabicNumeralIsCorrect(){
        //given
        String romanNumeral = "XV";
        //when
        Integer arabicOutput = romanNumeralService.convertToArabic(romanNumeral);
        //then
        Assert.assertEquals(15,(long)arabicOutput);
    }

    /**
     * Testcase for input Roman numeral String in the order of hundreds.
     */
    @Test
    public void whenHundredsOrderRomanNumeralIsProvided_thenRetrievedArabicNumeralIsCorrect(){
        //given
        String romanNumeral = "DCCCXXV";
        //when
        Integer arabicOutput = romanNumeralService.convertToArabic(romanNumeral);
        //then
        Assert.assertEquals(825,(long)arabicOutput);
    }

    /**
     * Testcase for input Roman numeral String in the order of thousands.
     */
    @Test
    public void whenThousandsOrderRomanNumeralIsProvided_thenRetrievedArabicNumeralIsCorrect(){

        //given
        String romanNumeral = "MMDCCXLIV";
        //when
        Integer arabicOutput = romanNumeralService.convertToArabic(romanNumeral);
        //then
        Assert.assertEquals(2744,(long)arabicOutput);
    }



}
