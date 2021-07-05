package claseuno.springtt.roman.controller;

import claseuno.springtt.roman.util.RomanNumeral;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("romanNumerals")
public class RomanNumeralController {

  @GetMapping(path = "decimalToRoman/{decimalNumber}")
  public String decimalToRomanç(@PathVariable int decimalNumber) {
    return RomanNumeral.decimalToRoman(decimalNumber);
  }
}
