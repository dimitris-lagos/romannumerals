package com.myprojects.romannumerals;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Business Logic for the validation of the request parameters.
 */
@Service
public class RomanNumeralValidator {

    private static final Pattern ROMAN_NUMERAL_PATTERN =
            Pattern.compile(RomanNumeralsConstants.ROMAN_NUMERAL_VALIDATION_REGEX);


    /**
     * Method for validating the request parameter on the "/generate" endpoint of the RESTful webservice.
     * The validation method asserts that the request parameter is an integer number between 1 and 3999.
     *
     * @param requestParameter reference to the request parameter.
     * @throws IllegalRequestParamException if {@param requestParameter} is not between 1 and 3999.
     */
    public void validateIsBoundedInteger(Integer requestParameter) throws IllegalRequestParamException{
        if (!isBounded(requestParameter)){
            throw new IllegalRequestParamException(RomanNumeralsConstants.ILLEGAL_ARABIC_NUMERAL_EXCEPTION_MESSAGE);
        }

    }


    /**
     * Method for validating the request parameter on the "/parse" endpoint of the RESTful webservice.
     * The validation method asserts that the request parameter is a valid Roman numeral number, in latin alphabet and
     * capital-case.
     *
     * @param requestParameter reference to the request parameter.
     * @throws IllegalRequestParamException if {@param requestParameter} is not a Roman numeral number.
     */
    public void validateIsRomanNumeral(String requestParameter) throws IllegalRequestParamException{
        Matcher romanMatcher = ROMAN_NUMERAL_PATTERN.matcher(requestParameter);
        if (!romanMatcher.find()){
            throw new IllegalRequestParamException(RomanNumeralsConstants.ILLEGAL_ROMAN_NUMERAL_EXCEPTION_MESSAGE);
        }


    }

    private boolean isBounded(Integer requestParameter){
        return  (requestParameter >= RomanNumeralsConstants.LOWER_BOUND
                && requestParameter <= RomanNumeralsConstants.UPPER_BOUND);
    }
}
