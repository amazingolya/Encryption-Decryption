package encryptdecrypt;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Config config = new DataParser().parseData(args);
        String data = config.getData();
        try {
            if (data.isEmpty()) data = new FileReader().readFromFile(config.getIn());
            Algorithm algorithm = new AlgorithmFactory().createAlgorithm(config.getAlgorithm(), config.getMode());
            String processedData = new AlgorithmExecutor(algorithm).execute(data, config.getKey());
            if (!config.getOut().isEmpty()) {
                FileWriter writer = new FileWriter();
                writer.writeToFile(processedData, config.getOut());
            } else {
                System.out.println(processedData);
            }
        } catch (NullPointerException e) {
            System.out.println("Error! No such algorithm found.");
        } catch (FileNotFoundException e) {
            System.out.printf("Error! Cannot write to file %s. File %s not found.\n", config.getIn(), config.getIn());
        } catch (IOException e) {
            System.out.printf("Error! Cannot read from file %s.\n", config.getOut());
        }
    }
}


