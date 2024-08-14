package arrow.Tests;

import static arrow.Tests.Exercise2.returnPersonFromString;

public class Exercise3 {

    public static Person[] returnMultiplePeopleFromString(String peopleInput) {
        String[] currentPeopleArray = peopleInput.split("\\|");
        Person[] outputPersonArray = new Person[currentPeopleArray.length];
        for (int i = 0; i < currentPeopleArray.length; i++) {
            Person currentPerson = returnPersonFromString(currentPeopleArray[i]);
            outputPersonArray[i] = currentPerson;
        }
        return outputPersonArray;
    }
}
