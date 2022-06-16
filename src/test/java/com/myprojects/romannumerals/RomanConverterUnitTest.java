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
public class RomanConverterUnitTest {
    private final RomanNumeralService romanNumeralService = new RomanNumeralService();


    /**
     * Test the Arabic numeral number conversion to Roman numeral number.
     */
    @Test
    public void whenArabicNumberIsProvided_thenRetrievedRomanNumeralIsCorrect(){
        //given
        int inputNumber = 199;
        //when
        String romanOutput = romanNumeralService.generateRomanFromArabic(inputNumber);
        //then
        Assert.assertEquals("CXCIX",romanOutput);

        //given
         Integer inputNumber2 = 4001;
        //when
        String romanOutput2 = romanNumeralService.generateRomanFromArabic(inputNumber2);
        //then
        Assert.assertEquals("MMMMI",romanOutput2);
    }

    /**
     * Test the Roman numeral number conversion to Arabic numeral number.
     */
    @Test
    public void whenRomanNumeralIsProvided_thenRetrievedArabicNumeralIsCorrect(){
        //given
        String romanNumeral = "DCCCXXV";
        //when
        Integer arabicOutput = romanNumeralService.generateArabicFromRoman(romanNumeral);
        //then
        Assert.assertEquals(825,(long)arabicOutput);

        //given
        String romanNumeral2 = "MMDCCXLIV";
        //when
        Integer arabicOutput2 = romanNumeralService.generateArabicFromRoman(romanNumeral2);
        //then
        Assert.assertEquals(2744,(long)arabicOutput2);
    }



}
