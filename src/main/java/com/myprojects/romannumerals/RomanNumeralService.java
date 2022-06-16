package com.myprojects.romannumerals;

import org.springframework.stereotype.Service;

/**
 * Business Logic implementation of the Service layer required to connect the API layer to the Data Access Layer.
 */
@Service
public class RomanNumeralService {
    private static final IRomanNumeralGenerator romanConverter = new RomanConverter();
    public RomanNumeralService() {
        //no-op
    }

    /**
     * Convert an integer number to its Roman numeral representation.
     *
     * @param arabic int value to be converted to its Roman numeral representation.
     * @return {@link String} reference containing the Roman numeral representation of the {@param arabic}.
     */
    public String convertToRoman(int arabic){
       return romanConverter.generate(arabic);
    }

    /**
     * Convert a Roman numeral number to its Arabic numeral representation.
     *
     * @param roman {@link String} reference to the Roman numeral number to be converted.
     * @return int value of the converted Roman numeral number.
     */
    public int convertToArabic(String roman){
        return romanConverter.parse(roman);
    }
}
