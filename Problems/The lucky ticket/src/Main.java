import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char[] ticketNumber = scanner.next().toCharArray();
        int sum1 = 0;
        for (int i = 0; i < ticketNumber.length / 2; i++) {
            sum1 += ticketNumber[i];
        }
        int sum2 = 0;
        for (int i = ticketNumber.length / 2; i < ticketNumber.length; i++) {
            sum2 += ticketNumber[i];
        }
        if (sum1 == sum2) System.out.println("Lucky");
        else System.out.println("Regular");
    }
}