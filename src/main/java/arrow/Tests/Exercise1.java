package arrow.Tests;

import java.util.Arrays;

public class Exercise1 {

    public String capitalizeEveryOtherLetter(String wordCapitalized) {
        StringBuilder finalCapitalizedWord = new StringBuilder();
        String[] wordArray = wordCapitalized.split("");
        for (int i = 0; i < wordArray.length; i++) {
            if (i % 2 == 1) {
                finalCapitalizedWord.append(wordArray[i].toUpperCase());
            } else {
                finalCapitalizedWord.append(wordArray[i]);
            }

        }

        return finalCapitalizedWord.toString();
    }
}
