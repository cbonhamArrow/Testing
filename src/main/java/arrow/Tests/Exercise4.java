package arrow.Tests;

public class Exercise4 {

    public static void main(String[] args) {
        System.out.println(spoonerism("Crushing Blow"));
        System.out.println(spoonerism("Sound bite"));
        System.out.println(spoonerism("Flat cap"));
        System.out.println(spoonerism("Sad ballad"));
        System.out.println(spoonerism("Master plan"));
        System.out.println(spoonerism("Trail snacks"));
    }

    public static String spoonerism(String stringToBeSpooned) {
        String[] spooners = {"a", "e", "i", "o", "u", "y"};
        String[] twoSpoonWords = stringToBeSpooned.split("\\s");

        if (twoSpoonWords.length < 2) {
            return "Please input two words.";
        } else if (twoSpoonWords.length > 2) {
            return "Please input only two words.";
        }

        String firstWordToBeSpooned = twoSpoonWords[0].toLowerCase();
        String secondWordToBeSpooned = twoSpoonWords[1].toLowerCase();
        StringBuilder outputSpoon = new StringBuilder();
        boolean twoCharacterSpoon = false;

        for (int i = 0; i < spooners.length; i++) {
            int indexOfVowelFirstWord = 0;
            int indexOfVowelSecondWord = 0;
            for (String spooner : spooners) {
                if (firstWordToBeSpooned.contains(spooner)) {
                    indexOfVowelFirstWord = firstWordToBeSpooned.indexOf(spooner, 1, 3);
                }
                if (secondWordToBeSpooned.contains(spooner)) {
                    indexOfVowelSecondWord = secondWordToBeSpooned.indexOf(spooner);
                }
                if (indexOfVowelFirstWord == - 1) {
                    indexOfVowelFirstWord = 0;
                }
                if (indexOfVowelSecondWord == - 1) {
                    indexOfVowelSecondWord = 0;
                }
                if (indexOfVowelFirstWord != 0 && indexOfVowelSecondWord != 0) {
                    break;
                }
            }
            if (indexOfVowelFirstWord <= 2 && indexOfVowelSecondWord <= 2) {
                outputSpoon
                        .append(secondWordToBeSpooned, 0, indexOfVowelSecondWord)
                        .append(firstWordToBeSpooned.substring(indexOfVowelFirstWord))
                        .append(" ")
                        .append(firstWordToBeSpooned, 0, indexOfVowelFirstWord)
                        .append(secondWordToBeSpooned.substring(indexOfVowelSecondWord));
                twoCharacterSpoon = true;
                break;
            }
        }
        if (!twoCharacterSpoon) {
            outputSpoon
                    .append(secondWordToBeSpooned, 0, 1)
                    .append(firstWordToBeSpooned.substring(1))
                    .append(" ")
                    .append(firstWordToBeSpooned, 0, 1)
                    .append(secondWordToBeSpooned.substring(1));
        }
        //makes outputspoon capitalize first letter
        StringBuilder outputSpoonFinal = new StringBuilder();
        outputSpoonFinal
                .append(outputSpoon.substring(0,1).toUpperCase())
                .append(outputSpoon.substring(1));
        return outputSpoonFinal.toString();
    }
}
