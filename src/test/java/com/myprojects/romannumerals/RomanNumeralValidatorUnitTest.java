package com.myprojects.romannumerals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit testing class for the {@link RomanNumeralValidator}. Check the Business Logic of the
 * backend, without starting the whole application.
 */
@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class RomanNumeralValidatorUnitTest {
    @Autowired
    private final RomanNumeralValidator romanNumeralValidator = new RomanNumeralValidator();

    /**
     * Testcase for out of bounds input number
     */
    @Test(expected = IllegalRequestParamException.class)
    public void givenOutOfBoundsInput_thenIllegalRequestParamExceptionThrown(){
        romanNumeralValidator.validateIsBoundedInteger(4000);
    }

    /**
     * Testcase for out of bounds(negative) input number
     */
    @Test(expected = IllegalRequestParamException.class)
    public void givenNegativeInput_thenIllegalRequestParamExceptionThrown(){
        romanNumeralValidator.validateIsBoundedInteger(-100);
    }

    /**
     * Testcase for invalid Roman numeral input String
     */
    @Test(expected = IllegalRequestParamException.class)
    public void givenInvalidRomanNumeralInput_thenIllegalRequestParamExceptionThrown(){
        romanNumeralValidator.validateIsRomanNumeral("XXXX");
    }

    /**
     * Testcase for lower-case Roman numeral input String
     */
    @Test(expected = IllegalRequestParamException.class)
    public void givenLowerCaseRomanNumeralInput_thenIllegalRequestParamExceptionThrown(){
        romanNumeralValidator.validateIsRomanNumeral("ix");
    }

}
