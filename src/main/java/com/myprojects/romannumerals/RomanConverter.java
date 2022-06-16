package com.myprojects.romannumerals;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Class that implements the Business Logic for the Roman Numerals to Arabic Numerals and vice versa conversion.
 */
public class RomanConverter implements IRomanNumeralGenerator {

    /* maps the Arabic numeral digit in the hundreds place of the number to the equivalent Roman numeral */
    private final Map<Integer,String> hundredsMap;
    /* maps the Arabic numeral digit in the tens place of the number to the equivalent Roman numeral */
    private final Map<Integer,String> tensMap;
    /* maps the Arabic numeral digit in the units place of the number to the equivalent Roman numeral */
    private final Map<Integer,String> unitsMap;
    /* maps all the Roman numeral numbers between 1 and 3999 to the equivalent Arabic numeral number */
    private final Map<String,Integer> romanArabicMap;

    public RomanConverter() {

        /* Generate the Map class members */
        hundredsMap = generateHundredsMap();
        tensMap = generateTensMap();
        unitsMap = generateUnitsMap();
        romanArabicMap = generateRomanArabicMap();


    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String generate(int arabicNumeral) {
        return convertArabicToRoman(arabicNumeral);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int parse(String romanNumeral) {
        return romanArabicMap.get(romanNumeral);
    }


    /*
     * Method that converts an integer to its equivalent Roman numeral representation.
     *
     * @param arabicNumeral the integer to be converted to its Roman numeral representation.
     * @return String that contains the Roman Numeral representation of the given integer.
     */
    private String convertArabicToRoman(int arabicNumeral){
        return getThousandsPlaceRomanNumeral(arabicNumeral) +
                getHundredsPlaceRomanNumeral(arabicNumeral) +
                getTensPlaceRomanNumeral(arabicNumeral) +
                getUnitsPlaceRomanNumeral(arabicNumeral);
    }


    /*
     * Method to get the Roman numeral in the thousands place of the given integer number.
     *
     * @param number the int number to get its thousands place digit converted to the equivalent the Roman numeral.
     * @return String that contains the Roman Numeral for the thousands place.
     */
    private String getThousandsPlaceRomanNumeral(int number){
        int thousands = number / 1000;
        StringBuilder thousandsBuilder = new StringBuilder("");
        if (thousands > 0) {
            for (int tCounter = 1; tCounter <= thousands; tCounter++) {
                thousandsBuilder.append("M");
            }
        }
        return thousandsBuilder.toString();
    }

    /*
     * Method to get the Roman numeral in the hundreds place of the given integer number.
     *
     * @param number the int number to get its hundreds place digit converted to the equivalent Roman numeral.
     * @return String that contains the Roman Numeral for the hundreds place.
     */
    private String getHundredsPlaceRomanNumeral(int number){
        int hundreds = number / 100;
        while (hundreds > 9){
            hundreds = hundreds - 10;
        }
        return hundredsMap.get(hundreds);

    }

    /*
     * Method to get the Roman numeral in the tens place of the given Arabic numeral number.
     *
     * @param number the int number to get its tens place digit converted to the equivalent Roman numeral.
     * @return String that contains the Roman Numeral for the tens place.
     */
    private String getTensPlaceRomanNumeral(int number){
        int tens = number / 10;
        while(tens > 9){
            tens = tens - 10;
        }
        return  tensMap.get(tens);
    }

    /*
     * Method to get the Roman numeral in the units place of the given Arabic numeral number.
     *
     * @param number the int number to get its units place digit converted to the equivalent Roman numeral.
     * @return String that contains the Roman Numeral for the units place.
     */
    private String getUnitsPlaceRomanNumeral(int number){
        int unit = number % 10;
        return unitsMap.get(unit);
    }

    private Map<String,Integer> generateRomanArabicMap(){
        LinkedHashMap<String,Integer> romanDecimalMap = new LinkedHashMap<>(RomanNumeralsConstants.UPPER_BOUND);
        for (int counter = RomanNumeralsConstants.LOWER_BOUND; counter <= RomanNumeralsConstants.UPPER_BOUND; counter++){
            romanDecimalMap.put(convertArabicToRoman(counter),counter);
        }
        return romanDecimalMap;
    }


    private Map<Integer,String> generateHundredsMap(){
        Map<Integer,String> hundredsMap = new HashMap<>();
        hundredsMap.put(0,"");
        hundredsMap.put(1,"C");
        hundredsMap.put(2,"CC");
        hundredsMap.put(3,"CCC");
        hundredsMap.put(4,"CD");
        hundredsMap.put(5,"D");
        hundredsMap.put(6,"DC");
        hundredsMap.put(7,"DCC");
        hundredsMap.put(8,"DCCC");
        hundredsMap.put(9,"CM");
        return hundredsMap;
    }

    private Map<Integer,String> generateTensMap(){
        Map<Integer,String> tensMap = new HashMap<>();
        tensMap.put(0,"");
        tensMap.put(1,"X");
        tensMap.put(2,"XX");
        tensMap.put(3,"XXX");
        tensMap.put(4,"XL");
        tensMap.put(5,"L");
        tensMap.put(6,"LX");
        tensMap.put(7,"LXX");
        tensMap.put(8,"LXXX");
        tensMap.put(9,"XC");
        return tensMap;
    }

    private Map<Integer, String> generateUnitsMap(){
        Map<Integer,String> unitsMap = new HashMap<>();
        unitsMap.put(0,"");
        unitsMap.put(1,"I");
        unitsMap.put(2,"II");
        unitsMap.put(3,"III");
        unitsMap.put(4,"IV");
        unitsMap.put(5,"V");
        unitsMap.put(6,"VI");
        unitsMap.put(7,"VII");
        unitsMap.put(8,"VIII");
        unitsMap.put(9,"IX");
        return unitsMap;
    }
}
