package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class RomanNumerals {

  private HashMap<Integer, Character> decimalRomanMap;

  @GetMapping(path = "roman/{number}")
  String decimalToRoman(@PathVariable int number) {
    String m[] = {"", "M", "MM", "MMM"};
    String c[] = {"", "C", "CC", "CCC", "CD", "D",
            "DC", "DCC", "DCCC", "CM"};
    String x[] = {"", "X", "XX", "XXX", "XL", "L",
            "LX", "LXX", "LXXX", "XC"};
    String i[] = {"", "I", "II", "III", "IV", "V",
            "VI", "VII", "VIII", "IX"};

    // Converting to roman
    String thousands = m[number / 1000];
    String hundereds = c[(number % 1000) / 100];
    String tens = x[(number % 100) / 10];
    String ones = i[number % 10];

    String ans = thousands + hundereds + tens + ones;

    return ans;
  }

  int romanToDecimal(String str) {
    int res = 0;
    for (int i = 0; i < str.length(); i++) {
      int s1 = decimalValueofRomanChar(str.charAt(i));
      if (i + 1 < str.length()) {
        int s2 = decimalValueofRomanChar(str.charAt(i + 1));
        if (s1 >= s2) {
          res = res + s1;
        } else {
          res = res + s2 - s1;
          i++;
        }
      } else {
        res = res + s1;
      }
    }

    return res;
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
