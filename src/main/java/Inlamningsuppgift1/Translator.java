package Inlamningsuppgift1;

import java.util.Map;

public class Translator {
    private MorseLetterMapping morseLetterMapping;
    private UserInputParser userInputParser;

    public Translator(MorseLetterMapping morseLetterMapping, UserInputParser userInputParser) {
        this.morseLetterMapping = morseLetterMapping;
        this.userInputParser = userInputParser;
    }

    public String translateMorseToLetter(String input) throws Exception {
        String[] morseArraySymbols = userInputParser.getMorseArraySymbols(input);
        Map<String, String> map = morseLetterMapping.getMorseToLetter();
        String result = "";
        for (int i = 0; i < morseArraySymbols.length; i++) {
            if (map.containsKey(morseArraySymbols[i])) {
                result = result + map.get(morseArraySymbols[i]);
            } else {
                throw new Exception("Cannot find morse symbol " + morseArraySymbols[i]);
            }

        }
        return result;
    }

    public String translateLetterToMorse(String input) throws Exception {
        String[] letters = userInputParser.getLetters(input);
        Map<String, String> map = morseLetterMapping.getLetterToMorse();
        String result = "";
        for (int i = 0; i < letters.length; i++) {
            if (map.containsKey(letters[i].toUpperCase())) {
                result = result + map.get(letters[i].toUpperCase()) + " ";
            }else {
                throw new Exception("Cannot find english symbol "+letters[i]);
            }
        }
        result = result.trim();
        return result;
    }

}
