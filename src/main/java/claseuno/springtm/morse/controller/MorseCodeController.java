package claseuno.springtm.morse.controller;

import claseuno.springtm.morse.util.MorseCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("morseCode")
public class MorseCodeController {

  @GetMapping(path = "decode/{morseCode}")
  public String decodeMorse(@PathVariable String morseCode) {
    return MorseCode.decode(morseCode);
  }

}
