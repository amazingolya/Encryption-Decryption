package encryptdecrypt;

public class UnicodeAlgorithmDecryptionTextProcessor implements UnicodeAlgorithm, Decryption {
    @Override
    public String processText(String cypher, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char symbol : cypher.toCharArray()) {
            char newSymbol = (char) (START + (symbol - START - key + RANGE) % RANGE);
            stringBuilder.append(newSymbol);
        }
        return stringBuilder.toString();
    }

    @Override
    public String apply(String data, int key) {
        return processText(data, key);
    }
}
