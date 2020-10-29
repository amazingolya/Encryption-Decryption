package encryptdecrypt;

public class AlgorithmExecutor {

    private final Algorithm algorithm;

    AlgorithmExecutor(Algorithm algorithm) {
        this.algorithm = algorithm;
    }
    public String execute(String data, int key) throws NullPointerException{
        return algorithm.apply(data, key);
    }
}
