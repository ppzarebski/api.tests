package commons;

import org.apache.commons.lang3.RandomUtils;

import java.util.List;

public class Word {

    private static List<String> words = null;
    private static List<String> names = null;
    private static List<String> surnames = null;

    private static List<String> readWords() {
        words = Files.arrayOfLines("Words-Container.txt");
        return words;
    }

    private static List<String> readNames() {
        names = Files.arrayOfLines("Names.txt");
        return names;
    }

    private static List<String> readSurnames() {
        surnames = Files.arrayOfLines("Surnames.txt");
        return surnames;
    }

    public static String randomWord() {
        return words == null ? readWords().get(Numbers.getRandomInt(0, words.size() - 1)) : words.get(Numbers.getRandomInt(0, words.size() - 1));
    }

    public static String name() {
        return names == null ? readNames().get(Numbers.getRandomInt(0, names.size() - 1)) : names.get(Numbers.getRandomInt(0, names.size() - 1));
    }

    public static String surname() {
        return surnames == null ? readSurnames().get(Numbers.getRandomInt(0, surnames.size() - 1)) : surnames.get(Numbers.getRandomInt(0, surnames.size() - 1));
    }

    public static String fullName() {
        return name() + " " + surname();
    }

    public static String randomWords(Integer quantity) {
        StringBuilder string = new StringBuilder();
        while (quantity > 0) {
            string.append(randomWord().concat(" "));
            quantity--;
        }
        return string.toString().trim();
    }

    public static String randomWords(Integer from, Integer to) {
        StringBuilder string = new StringBuilder();
        var quantity = RandomUtils.nextInt(from, to);
        while (quantity > 0) {
            string.append(randomWord().concat(" "));
            quantity--;
        }
        return string.toString().trim();
    }
}
