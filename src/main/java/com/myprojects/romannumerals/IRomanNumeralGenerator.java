package com.myprojects.romannumerals;

/**
 * Interface that describes the webservice's Business Logic in the Data Access layer.
 */
public interface IRomanNumeralGenerator {

    /**
     * Convert an integer(Arabic numeral number) to its corresponding Roman numeral representation.
     *
     * @param arabicNumeral integer value of the Arabic numeral number.
     * @return {@link String} reference of the Roman numeral representation of the {@param arabicNumeral}.
     */
    String generate(int arabicNumeral);

    /**
     * Convert the Roman numeral representation of a number to an integer.
     *
     * @param romanNumeral {@link String} reference of the Roman numeral number.
     * @return integer value of the referenced Roman numeral number.
     */
    int parse(String romanNumeral);
}
