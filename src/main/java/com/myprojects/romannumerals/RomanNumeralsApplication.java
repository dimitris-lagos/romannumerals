package com.myprojects.romannumerals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Springboot Application Main Class. The RomanNumerals Application offers a REST API for converting Roman numeral
 * numbers to their Arabic numeral representation and vice versa.
 */
@SpringBootApplication
public class RomanNumeralsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RomanNumeralsApplication.class, args);
	}


}
