/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int[] numbers = parseInt(args);
        switch (operator) {
            case "MAX":
                System.out.println(findMax(numbers));
                break;
            case "MIN":
                System.out.println(findMin(numbers));
                break;
            case "SUM":
                System.out.println(findSum(numbers));
                break;
        }
    }

    private static int[] parseInt(String[] args) {
        int[] numbers = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            numbers[i - 1] = Integer.parseInt(args[i]);
        }
        return numbers;
    }

    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int a = numbers[i];
            if (a > max) max = a;
        }
        return max;
    }

    private static int findMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            int a = numbers[i];
            if (a < min) min = a;

        }
        return min;
    }

    private static int findSum(int[] numbers) {
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
