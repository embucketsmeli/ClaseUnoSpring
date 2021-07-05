package claseuno.springtm;

import claseuno.springtt.roman.util.RomanNumeral;
import org.junit.jupiter.api.Test;

class RomanNumeralsTest {

  @Test
  void romanToDecimal() {
    RomanNumeral romanNumerals = new RomanNumeral();
//    System.out.println(romanNumerals.romanToDecimal("DCCC"));
//    System.out.println(romanNumerals.romanToDecimal("MCMIV"));
  }

  @Test
  void decimalToRoman() {
    RomanNumeral romanNumerals = new RomanNumeral();
    System.out.println(romanNumerals.decimalToRoman(2021));
  }

  @Test
  void testRomanToDecimal() {
  }
}