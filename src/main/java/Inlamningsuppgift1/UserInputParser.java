package Inlamningsuppgift1;

public class UserInputParser {
    public String[] getMorseArraySymbols(String str){
        return str.split(" ");
    }

    public String[] getLetters(String str){
        return str.split("");

    }
}
