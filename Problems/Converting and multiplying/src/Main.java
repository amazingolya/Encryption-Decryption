import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String token = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (!token.equals("0")) {
            stringBuilder.append(token).append(" ");
            token = scanner.nextLine();
        }
        String[] inputStrings = stringBuilder.toString().trim().split(" ");
        for (String string: inputStrings) {
            try {
                System.out.println(Integer.parseInt(string) * 10);
            } catch (Exception e) {
                System.out.printf("Invalid user input: %s\n", string);
            }
        }
    }

}