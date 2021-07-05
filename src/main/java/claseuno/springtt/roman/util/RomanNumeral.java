package claseuno.springtt.roman.util;

public class RomanNumeral {

  public static String decimalToRoman(int number) {
    String m[] = {"", "M", "MM", "MMM"};
    String c[] = {"", "C", "CC", "CCC", "CD", "D",
            "DC", "DCC", "DCCC", "CM"};
    String x[] = {"", "X", "XX", "XXX", "XL", "L",
            "LX", "LXX", "LXXX", "XC"};
    String i[] = {"", "I", "II", "III", "IV", "V",
            "VI", "VII", "VIII", "IX"};

    String thousands = m[number / 1000];
    String hundereds = c[(number % 1000) / 100];
    String tens = x[(number % 100) / 10];
    String ones = i[number % 10];

    return thousands + hundereds + tens + ones;
  }


  int romanToDecimal(String romanNumeral) {
    int decimalNumber = 0;
    for (int i = 0; i < romanNumeral.length(); i++) {
      int currentDecimalValue = decimalValueofRomanChar(romanNumeral.charAt(i));
      if (i + 1 < romanNumeral.length()) {
        int nextDecimalValue = decimalValueofRomanChar(romanNumeral.charAt(i + 1));
        if (currentDecimalValue >= nextDecimalValue) {
          decimalNumber = decimalNumber + currentDecimalValue;
        } else {
          decimalNumber = decimalNumber + nextDecimalValue - currentDecimalValue;
          i++;
        }
      } else {
        decimalNumber = decimalNumber + currentDecimalValue;
      }
    }

    return decimalNumber;
  }

  int decimalValueofRomanChar(char r) {
    switch (r) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return -1;
    }
  }
}
