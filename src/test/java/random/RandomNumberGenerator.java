package random;

import org.testng.annotations.Test;

import java.util.Random;

public class RandomNumberGenerator {
    public String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(99999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
    @Test
    public void testEightNumberGenerator() {
        System.out.println("Eight number generator method 1: " + getRandomNumberString());
        int i = new Random().nextInt(90000000) + 10000000;
        System.out.println("Eight number generator method 2: " + getRandomNumberString());

    }
}
