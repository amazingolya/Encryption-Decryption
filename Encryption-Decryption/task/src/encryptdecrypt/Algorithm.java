package encryptdecrypt;

public interface Algorithm {
    String apply(String data, int key);
}
