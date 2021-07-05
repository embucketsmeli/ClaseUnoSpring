package com.example.springboot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

  @Test
  void romanToDecimal() {
    RomanNumerals romanNumerals = new RomanNumerals();
    System.out.println(romanNumerals.romanToDecimal("DCCC"));
    System.out.println(romanNumerals.romanToDecimal("MCMIV"));
  }

  @Test
  void decimalToRoman() {
    RomanNumerals romanNumerals = new RomanNumerals();
    System.out.println(romanNumerals.decimalToRoman(2021));
  }

  @Test
  void testRomanToDecimal() {
  }
}