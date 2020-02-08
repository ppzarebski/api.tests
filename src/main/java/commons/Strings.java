package commons;

import net.bytebuddy.utility.RandomString;

public class Strings {

    public static String stringBuilder(Integer messageLength) {
        StringBuilder string = new StringBuilder();
        for (var i = messageLength; i >= 0; i--) {
            if (i > 0) {
                string.append(RandomString.make(Numbers.getRandomInt(3, 10)) + " ");
            } else {
                string.append(RandomString.make(Numbers.getRandomInt(3, 10)) + ".");
            }
        }
        return string.toString();
    }

    public static String eMailContent() {
        var email = "Hello, \n\n" + longMessage() + "\n\n Best regards!\n" + fullName();
        return email;
    }

    public static String shortMessage() {
        var random = Numbers.getRandomInt(7, 21);
        return stringBuilder(random);
    }

    public static String longMessage() {
        var random = Numbers.getRandomInt(35, 102);
        return stringBuilder(random);
    }

    public static String fullName() {
        return RandomString.make(Numbers.getRandomInt(4, 8)) + " " + RandomString.make(Numbers.getRandomInt(6, 12));
    }
}
