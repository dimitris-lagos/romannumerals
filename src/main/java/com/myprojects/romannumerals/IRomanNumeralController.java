package com.myprojects.romannumerals;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Interface that describes the Endpoints of the RESTful webservice's Controller.
 */
@RestController
@RequestMapping(path = "/api/RomanNumeralGenerator")
public interface IRomanNumeralController {
    /**
     * Endpoint for the "/generate" GET request. Accepts only integer numbers. Converts Arabic numeral numbers to
     * their corresponding Roman numeral representation.
     *
     * @param arabic integer number to be converted to its corresponding Roman numeral representation.
     * @return {@link ResponseEntity} containing the Roman numeral representation of the {@param arabic}
     *          and the {@code HttpStatus} of the transaction.
     */
    @GetMapping(value = "/generate", consumes = {MediaType.TEXT_PLAIN_VALUE}, produces = {MediaType.TEXT_PLAIN_VALUE})
    ResponseEntity<String> generate(
            @RequestParam(value = "arabic") int arabic);

    /**
     * Endpoint for the "/parse" GET request. Accepts {@link String} input. Parses Roman numeral numbers and converts
     * them to their corresponding Arabic numeral representation.
     *
     * @param roman {@link String} reference to the Roman numeral number to be parsed and converted to its corresponding
     *                           Arabic numeral representation.
     * @return {@link ResponseEntity} containing the Arabic numeral representation of the {@param roman} and the
     *          {@code HttpStatus} of the transaction.
     */
    @GetMapping(value = "/parse", consumes = {MediaType.TEXT_PLAIN_VALUE}, produces = {MediaType.TEXT_PLAIN_VALUE})
    ResponseEntity<Object> parse(
            @RequestParam(value = "roman") String roman);
}
