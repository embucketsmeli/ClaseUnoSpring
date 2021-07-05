package com.example.springboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {
  Map<String, Character> dictionary;

  @BeforeEach
  void setUp() {
    dictionary = new HashMap<>();
    dictionary.put(".-", 'A');
    dictionary.put("-...", 'B');
    dictionary.put("-.-.", 'C');
    dictionary.put("-..", 'D');
    dictionary.put(".", 'E');
    dictionary.put("..-.", 'F');
    dictionary.put("--.", 'G');
    dictionary.put("....", 'H');
    dictionary.put("..", 'I');
    dictionary.put(".---", 'J');
    dictionary.put("-.-", 'K');
    dictionary.put(".-..", 'L');
    dictionary.put("--", 'M');
    dictionary.put("-.", 'N');
    dictionary.put("---", 'O');
    dictionary.put(".--.", 'P');
    dictionary.put("--.-", 'Q');
    dictionary.put(".-.", 'R');
    dictionary.put("...", 'S');
    dictionary.put("-", 'T');
    dictionary.put("..-", 'U');
    dictionary.put("...-", 'V');
    dictionary.put(".--", 'W');
    dictionary.put("-..-", 'X');
    dictionary.put("-.--", 'Y');
    dictionary.put("--..", 'Z');
  }

  @Test
  void decodeMorse() {
    MorseCode morseCode = new MorseCode();
    System.out.println(morseCode.decodeMorse("-- . .-. -.-. .- -.. ---   .-.. .. -... .-. ."));
    System.out.println(morseCode.decodeMorse("... .--. .-. .. -. --."));
    System.out.println(morseCode.decodeMorse("... .--. .-. .. -. --. ..--.."));
  }

  @Test
  void decodeWord() {
    String[] strings = {".-", "-..."};
    String s = new MorseCode().decodeWord(strings);
    System.out.println(s);
  }
}