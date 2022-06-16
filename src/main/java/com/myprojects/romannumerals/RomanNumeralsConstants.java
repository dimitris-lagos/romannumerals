package com.myprojects.romannumerals;

/**
 * Utility class for constants declaration.
 */
public class RomanNumeralsConstants {

    /* Upper bound of Roman Numeral numbers */
    public static final int UPPER_BOUND = 3999;
    /* Lower bound of Roman Numeral numbers */
    public static final int LOWER_BOUND = 1;
    /* Regular expression that matches valid Roman numerals  */
    public static final String ROMAN_NUMERAL_VALIDATION_REGEX =
            "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
    /* Exception message for invalid Roman numerals in request parameters */
    public static final String ILLEGAL_ROMAN_NUMERAL_EXCEPTION_MESSAGE =
            "IllegalRequestParamException. Parameter provided is not a valid Roman Numeral number!";
    /* Exception message for invalid Arabic numerals in request parameters */
    public static final String ILLEGAL_ARABIC_NUMERAL_EXCEPTION_MESSAGE =
            "IllegalRequestParamException. Parameter provided is not Arab Numeral between 1 and 3999!";

    /**
     * Private constructor to avoid instantiation
     */
    private RomanNumeralsConstants() {
        //no-op
    }
}
