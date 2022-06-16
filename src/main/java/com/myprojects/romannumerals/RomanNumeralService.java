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

    public String generateRomanFromArabic(Integer arabic){
       return romanConverter.generate(arabic);
    }

    public Integer generateArabicFromRoman(String roman){
        return romanConverter.parse(roman);
    }
}
