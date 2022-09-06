public class Main {

    public static void main(String[] args) {

        String letter = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
                "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat " +
                "cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        WordsChecker check = new WordsChecker(letter);
        String word1 = "dolor";
        System.out.println(word1 + " - " + check.hasWord(word1));
        String word2 = "idea";
        System.out.println(word2 + " - " + check.hasWord(word2));

    }
}