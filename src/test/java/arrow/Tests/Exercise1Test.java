package arrow.Tests;

import org.junit.jupiter.api.Test;


import static arrow.Tests.Exercise2.returnPersonFromString;
import static arrow.Tests.Exercise3.returnMultiplePeopleFromString;
import static arrow.Tests.Exercise4.spoonerism;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise1Test {

    @Test
    public void everyOtherLetter() {
        Exercise1 exercise1 = new Exercise1();
        String inputString = "spongebob";
        assertEquals("sPoNgEbOb", exercise1.capitalizeEveryOtherLetter(inputString));
    }

    @Test
    public void returnObjectFromString() {
        Person expectedPerson = new Person("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210");
        Person actualPerson = returnPersonFromString("Billy,Bob,1234 Big St.,Big City,California,90210");
        assertEquals(expectedPerson,actualPerson);
    }

    @Test
    public void returnMultipleObjectsFromString() {
        Person[] expectedPeople = {new Person("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"), new Person("Janet", "Jackson", "5678 Small St.", "Small City", "Rhode Island", "12345")};
        Person[] actualPeople = returnMultiplePeopleFromString("Billy,Bob,1234 Big St.,Big City,California,90210|Janet,Jackson,5678 Small St.,Small City,Rhode Island,12345");
        assertArrayEquals(expectedPeople,actualPeople);
    }

    @Test
    public void testSpoonerism() {
        assertEquals("Blushing crow", spoonerism("Crushing Blow"));
    }
@Test
    public void testSpoonerism1() {
        assertEquals("Bound site", spoonerism("Sound Bite"));
    }

}

