import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String inputString = scanner.nextLine();
        final String substring = scanner.nextLine();

        int frequency = 0;
        int firstIndex = inputString.indexOf(substring);
        while (firstIndex != -1) {
            int lastIndex = firstIndex + substring.length();
            frequency++;
            firstIndex = inputString.indexOf(substring, lastIndex);
        }

        System.out.println(frequency);
    }
}ght