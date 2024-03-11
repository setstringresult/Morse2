package Inlamningsuppgift1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MorseLetterMapping morse = new MorseLetterMapping();
        UserInputParser userInputParser = new UserInputParser();
        System.out.println("If you want to translate from Morse to English, press 1 and enter");
        System.out.println("If you want to translate from English to Morse, press 2 and enter");
        String userChoice = scan.nextLine();
        if(userChoice.equals("1")){
            System.out.println("Please, enter Morse letter or word.");
            String userInput = scan.nextLine();
            Translator translator = new Translator(morse, userInputParser);
            String result = null;
            try{
                result= translator.translateMorseToLetter(userInput);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(result);


        } else if (userChoice.equals("2")) {
            System.out.println("Please, write english letter or word");
            String userInput = scan.nextLine();
            Translator translator = new Translator(morse, userInputParser);
            String result = null;
            try{
                result  = translator.translateLetterToMorse(userInput);
            }catch (Exception e){
                e.printStackTrace();
            }

            System.out.println(result);


        }


    }

}
