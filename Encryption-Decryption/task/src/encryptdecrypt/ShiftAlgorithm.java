package encryptdecrypt;

public interface ShiftAlgorithm extends Algorithm {
    int RANGE = 26;

    default char findStart(char symbol) {
        char start = 0;
        if (symbol >= 'a' && symbol <= 'z') start = 'a';
        else if (symbol >= 'A' && symbol <= 'Z') start = 'A';
        return start;
    }
}
