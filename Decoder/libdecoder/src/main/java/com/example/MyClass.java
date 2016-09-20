package com.example;

public class MyClass {
    public static void main(String[] args){
        String phrase = "Mchenry County College is Great";

        char[] phraseCharacterArray = phrase.toCharArray();

        System.out.println(phraseCharacterArray);

        phraseCharacterArray[0] = 'T';
        phraseCharacterArray[1] = 'h';
        phraseCharacterArray[2] = 'u';
        phraseCharacterArray[3] = 'n';
        phraseCharacterArray[4] = 'd';
        phraseCharacterArray[5] = 'e';
        phraseCharacterArray[6] = 'r';
        phraseCharacterArray[7] = ' ';
        phraseCharacterArray[8] = 'A';
        phraseCharacterArray[9] = 't';
        phraseCharacterArray[10] = ' ';
        phraseCharacterArray[11] = 'M';
        phraseCharacterArray[12] = 'i';
        phraseCharacterArray[13] = 'd';
        phraseCharacterArray[14] = 'n';
        phraseCharacterArray[15] = 'i';
        phraseCharacterArray[16] = 'g';
        phraseCharacterArray[17] = 'h';
        phraseCharacterArray[18] = 't';

        for (int i = 19; i < phrase.length(); i++) {
            phraseCharacterArray[i] = ' ';
        }

        System.out.println("=");
        System.out.println(phraseCharacterArray);


    }
}
