import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] input = scanner.next().toCharArray();
        final StringBuilder stringBuilder = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1]) {
                counter++;
            } else {
                stringBuilder.append(input[i]).append(counter);
                counter = 1;
            }
        }
        stringBuilder.append(input[input.length - 1]).append(counter);
        System.out.println(stringBuilder);
    }
}
