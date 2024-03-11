package Inlamningsuppgift1;

import java.util.HashMap;
import java.util.Map;

public class MorseLetterMapping {
    private HashMap<String, String> morseToLetter = null;
    private HashMap<String, String> letterToMorse = null;

    public HashMap <String, String> getMorseToLetter(){
        return morseToLetter;
    }
    public HashMap <String, String> getLetterToMorse(){
        return letterToMorse;
    }


    public MorseLetterMapping(){
        morseToLetter =  new HashMap<>();
        morseToLetter.put("*-", "A");
        morseToLetter.put("-***", "B");
        morseToLetter.put("-*-*", "C");
        morseToLetter.put("-**", "D");
        morseToLetter.put("*", "E");
        morseToLetter.put("**-*", "F");
        morseToLetter.put("--*", "G");
        morseToLetter.put("****", "H");
        morseToLetter.put("**", "I");
        morseToLetter.put("*---", "J");
        morseToLetter.put("-*-", "K");
        morseToLetter.put("*-**", "L");
        morseToLetter.put("--", "M");
        morseToLetter.put("-*", "N");
        morseToLetter.put("---", "O");
        morseToLetter.put("*--*", "P");
        morseToLetter.put("--*-", "Q");
        morseToLetter.put("-*-", "R");
        morseToLetter.put("***", "S");
        morseToLetter.put("-", "T");
        morseToLetter.put("**-", "U");
        morseToLetter.put("***-", "V");
        morseToLetter.put("*--", "W");
        morseToLetter.put("-*-*", "X");
        morseToLetter.put("-*--", "Y");
        morseToLetter.put("--**", "Z");
        morseToLetter.put("*----", "1");
        morseToLetter.put("**---", "2");
        morseToLetter.put("***--", "3");
        morseToLetter.put("****-", "4");
        morseToLetter.put("*****", "5");
        morseToLetter.put("-****", "6");
        morseToLetter.put("--***", "7");
        morseToLetter.put("---**", "8");
        morseToLetter.put("----*", "9");
        morseToLetter.put("-----", "0");
        morseToLetter.put("*-*-*-", ".");
        morseToLetter.put("--**--", ",");
        morseToLetter.put("**--**", "?");


        letterToMorse = new HashMap<>();
        for(Map.Entry<String, String> entry: morseToLetter.entrySet()){
            letterToMorse.put(entry.getValue(), entry.getKey());
        }

    }


}
