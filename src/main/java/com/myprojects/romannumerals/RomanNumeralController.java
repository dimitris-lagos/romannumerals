package com.myprojects.romannumerals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoint Controller for the RESTful webservice.
 */
@RestController
@RequestMapping(path = "/api/RomanNumeralGenerator")
public class RomanNumeralController implements IRomanNumeralController {
    private final RomanNumeralService romanNumeralService;
    private final RomanNumeralValidator romanNumeralValidator;

    @Autowired
    public RomanNumeralController(RomanNumeralService romanNumeralService, RomanNumeralValidator romanNumeralValidator) {
        this.romanNumeralService = romanNumeralService;
        this.romanNumeralValidator = romanNumeralValidator;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    @GetMapping(value = "/generate")
    public ResponseEntity<String> generate(int arabic) {
        romanNumeralValidator.validateIsBoundedInteger(arabic);
        return new ResponseEntity<>(romanNumeralService.convertToRoman(arabic), HttpStatus.OK);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    @GetMapping(value = "/parse")
    public ResponseEntity<Object> parse(String roman) {
        romanNumeralValidator.validateIsRomanNumeral(roman);
        return new ResponseEntity<>(romanNumeralService.convertToArabic(roman), HttpStatus.OK);
    }

}
