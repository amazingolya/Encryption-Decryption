package encryptdecrypt;

public class UnicodeAlgorithmEncryptionTextProcessor implements UnicodeAlgorithm, Encryption {
    @Override
    public String processText(String message, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char symbol : message.toCharArray()) {
            char newSymbol = (char) (START + (symbol - START + key) % RANGE);
            stringBuilder.append(newSymbol);
        }
        return stringBuilder.toString();
    }

    @Override
    public String apply(String data, int key) {
        return processText(data, key);
    }
}
