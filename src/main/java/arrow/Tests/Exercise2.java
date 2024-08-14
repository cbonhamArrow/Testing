package arrow.Tests;

public class Exercise2 {

    public static Person returnPersonFromString(String personalInformation) {
        String[] informationArray = personalInformation.split(",");
        String firstName = informationArray[0];
        String lastName = informationArray[1];
        String address = informationArray[2];
        String city = informationArray[3];
        String state = informationArray[4];
        String postalCode = informationArray[5];
        return new Person(firstName,lastName,address,city,state,postalCode);
    }

    public static void main(String[] args) {
        returnPersonFromString("Billy,Bob,1234 Big St.,Big City,California,90210");
    }

}

