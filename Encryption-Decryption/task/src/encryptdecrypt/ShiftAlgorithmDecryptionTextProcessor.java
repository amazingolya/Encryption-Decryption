package encryptdecrypt;

public class ShiftAlgorithmDecryptionTextProcessor implements ShiftAlgorithm, Decryption {
    @Override
    public String processText(String cypher, int key) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char symbol : cypher.toCharArray()) {
            char start = findStart(symbol);
            if (start != 0) {
                symbol = (char) (start + (symbol - start - key + RANGE) % RANGE);
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
