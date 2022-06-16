package com.myprojects.romannumerals;

/**
 * Interface that describes the webservice's Business Logic in the Data Access layer.
 */
public interface IRomanNumeralGenerator {

    /**
     * Convert an Arabic numeral number to its corresponding Roman numeral representation.
     *
     * @param arabicNumeral int value of the Arabic numeral number.
     * @return {@link String} reference of the Roman numeral representation of the {@param arabicNumeral}.
     */
    String generate(int arabicNumeral);

    /**
     * Convert a Roman numeral number to its corresponding Arabic numeral representation.
     *
     * @param romanNumeral {@link String} reference of the Roman numeral number.
     * @return int value of the referenced Roman numeral number.
     */
    int parse(String romanNumeral);
}
