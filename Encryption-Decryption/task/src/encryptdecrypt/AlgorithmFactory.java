package encryptdecrypt;

class AlgorithmFactory {
    Algorithm createAlgorithm(String type, String mode) {
        switch (type) {
            case "shift": {
                if (mode.equals("enc")) return new ShiftAlgorithmEncryptionTextProcessor();
                else return new ShiftAlgorithmDecryptionTextProcessor();
            }
            case "unicode": {
                if (mode.equals("enc")) return new UnicodeAlgorithmEncryptionTextProcessor();
                else return new UnicodeAlgorithmDecryptionTextProcessor();
            }
            default: {
                return null;
            }
        }
    }
}
