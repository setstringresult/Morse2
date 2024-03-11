package taskTest;

import Inlamningsuppgift1.MorseLetterMapping;
import Inlamningsuppgift1.Translator;
import Inlamningsuppgift1.UserInputParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TranslatorTest {
    @Test
    public void digitToMorse() throws Exception {
        MorseLetterMapping morse = new MorseLetterMapping();
        UserInputParser userInputParser = new UserInputParser();
        Translator translator = new Translator(morse, userInputParser);
        String result = translator.translateLetterToMorse("1");
        Assertions.assertEquals("*----", result);

    }

    @Test
    public void MorseToDigit() throws Exception {
        MorseLetterMapping morse = new MorseLetterMapping();
        UserInputParser userInputParser = new UserInputParser();
        Translator translator = new Translator(morse, userInputParser);
        String result = translator.translateMorseToLetter("*----");
        Assertions.assertEquals("1", result);

    }
    @Test
    public void MorseToDigitFail(){
        MorseLetterMapping morse = new MorseLetterMapping();
        UserInputParser userInputParser = new UserInputParser();
        Translator translator = new Translator(morse, userInputParser);

        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            translator.translateMorseToLetter("*----wrong");;
        });
        Assertions.assertTrue(exception.getMessage().startsWith("Cannot find morse symbol "));
    }





}
