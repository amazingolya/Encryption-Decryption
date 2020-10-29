package encryptdecrypt;

public class DataParser {
    public Config parseData(String[] args) {
        Config config = new Config();
        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-mode": {
                    config.setMode(args[i + 1]);
                    break;
                }
                case "-key": {
                    config.setKey(Integer.parseInt(args[i + 1]));
                    break;
                }
                case "-data": {
                    config.setData(args[i + 1]);
                    break;
                }
                case "-in": {
                    config.setIn(args[i + 1]);
                    break;
                }
                case "-out": {
                    config.setOut(args[i + 1]);
                    break;
                }
                case "-alg": {
                    config.setAlgorithm(args[i + 1]);
                }
            }
        }
        return config;
    }
}
