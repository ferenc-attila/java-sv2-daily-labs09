package day03;

public class Caesar extends Encryption {

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
            if (c <= 'Z' - realOffset) {
                outputWord.append((char) (c + realOffset));
            } else {
                outputWord.append((char) ('A' - ('Z' + 1 - c) + realOffset));
            }
        }
        return outputWord;
    }
}
