package encryptdecrypt;

public class ShiftAlgorithmEncryptionTextProcessor implements ShiftAlgorithm, Encryption {
    @Override
    public String processText(String message, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char symbol : message.toCharArray()) {
            char start = findStart(symbol);
            if (start != 0) {
                symbol = (char) (start +(symbol - start + key) % RANGE);
            }
            stringBuilder.append(symbol);
        }
        return stringBuilder.toString();
    }

    @Override
    public String apply(String data, int key) {
        return processText(data, key);
    }
}
