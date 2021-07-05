package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
public class MorseCode {

  private static final Map<String, Character> morseCodeDictionary = buildMorseCodeDictionary();
  private static final String MORSECODE_WORD_DELIMITER = "   ";
  private static final String MORSECODE_LETTER_DELIMITER = " ";

  @GetMapping(path = "morse/{message}")
  public String decodeMorse(@PathVariable String message) {
    StringBuilder result = new StringBuilder();
    String[] morseWords = message.split(MORSECODE_WORD_DELIMITER);
    //itera las palabras en codigo morse
    for (Iterator<String> iterator = Arrays.stream(morseWords).iterator(); iterator.hasNext(); ) {
      String morseWord = iterator.next();
      //transforma la palabra de codigo morse a español
      //concatena la palabra
      result.append(decodeWord(morseWord.split(MORSECODE_LETTER_DELIMITER)));
      //si hay mas palabras concatena espacio
      if (iterator.hasNext()) {
        result.append(" ");
      }
    }
    return result.toString();
  }

  public String decodeWord(String[] morseCodeLetters) {
    StringBuilder stringBuilder = new StringBuilder();
    Arrays.stream(morseCodeLetters).forEach(l -> stringBuilder.append(morseCodeDictionary.get(l)));
    return stringBuilder.toString();
  }

  private static Map<String, Character> buildMorseCodeDictionary() {
    HashMap<String, Character> morseCodeDictionary = new HashMap<>();
    morseCodeDictionary.put(".-", 'A');
    morseCodeDictionary.put("-...", 'B');
    morseCodeDictionary.put("-.-.", 'C');
    morseCodeDictionary.put("-..", 'D');
    morseCodeDictionary.put(".", 'E');
    morseCodeDictionary.put("..-.", 'F');
    morseCodeDictionary.put("--.", 'G');
    morseCodeDictionary.put("....", 'H');
    morseCodeDictionary.put("..", 'I');
    morseCodeDictionary.put(".---", 'J');
    morseCodeDictionary.put("-.-", 'K');
    morseCodeDictionary.put(".-..", 'L');
    morseCodeDictionary.put("--", 'M');
    morseCodeDictionary.put("-.", 'N');
    morseCodeDictionary.put("---", 'O');
    morseCodeDictionary.put(".--.", 'P');
    morseCodeDictionary.put("--.-", 'Q');
    morseCodeDictionary.put(".-.", 'R');
    morseCodeDictionary.put("...", 'S');
    morseCodeDictionary.put("-", 'T');
    morseCodeDictionary.put("..-", 'U');
    morseCodeDictionary.put("...-", 'V');
    morseCodeDictionary.put(".--", 'W');
    morseCodeDictionary.put("-..-", 'X');
    morseCodeDictionary.put("-.--", 'Y');
    morseCodeDictionary.put("--..", 'Z');
    morseCodeDictionary.put(".----", '1');
    morseCodeDictionary.put("..---", '2');
    morseCodeDictionary.put("...--", '3');
    morseCodeDictionary.put("....-", '4');
    morseCodeDictionary.put(".....", '5');
    morseCodeDictionary.put("-....", '6');
    morseCodeDictionary.put("--...", '7');
    morseCodeDictionary.put("---..", '8');
    morseCodeDictionary.put("----.", '9');
    morseCodeDictionary.put("-----", '0');
    morseCodeDictionary.put(".-.-.-", '.');
    morseCodeDictionary.put("--..--", ',');
    morseCodeDictionary.put("---...", ':');
    morseCodeDictionary.put("..--..", '?');
    morseCodeDictionary.put(".----.", '\'');
    morseCodeDictionary.put("-....-", '-');
    morseCodeDictionary.put("-..-.", '/');
    morseCodeDictionary.put("-.--.-", '(');
    morseCodeDictionary.put(".-..-.", '¿');
    return morseCodeDictionary;
  }
}
