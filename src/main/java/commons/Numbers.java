package commons;

import java.util.Random;

public class Numbers {

    public static Integer getRandomInt(Integer from, Integer to) {
        Integer randomNumber = null;
        if (to > from) {
            Random number = new Random();
            randomNumber = from + number.nextInt(to - from);
        } else {
            System.out.println("Range is invalid. Please provide correct range.");
        }
        return randomNumber;
    }
}
