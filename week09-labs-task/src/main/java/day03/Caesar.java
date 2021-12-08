package day03;

public class Caesar extends Encryption {

    private static final int FIRST_CHARACTER_VALUE_OF_ABC = 65;
    private static final int LAST_CHARACTER_VALUE_OF_ABC = 90;
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder output = new StringBuilder();
        getWords(input, output);
        return output.toString();
    }

    private void getWords(String input, StringBuilder output) {
        String[] words = input.split(" ");
        boolean first = true;
        for (String word : words) {
            char[] chars = word.toUpperCase().toCharArray();
            StringBuilder outputWord = getEncryptedCharacters(chars);
            if (first) {
                output.append(outputWord);
                first = false;
            } else {
                output.append(" ");
                output.append(outputWord);
            }
        }
    }

    private StringBuilder getEncryptedCharacters(char[] chars) {
        int realOffset = offset % 26;
        StringBuilder outputWord = new StringBuilder();
        for (char c : chars) {
            if (c <= LAST_CHARACTER_VALUE_OF_ABC - realOffset) {
                outputWord.append((char) (c + realOffset));
            } else {
                outputWord.append((char) (FIRST_CHARACTER_VALUE_OF_ABC - (LAST_CHARACTER_VALUE_OF_ABC + 1 - c) + realOffset));
            }
        }
        return outputWord;
    }
}
