public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println("\nThis are methode recursive");
        System.out.println(factorialRecursive(5));
        System.out.println("\nThis are method recursive to be stack overflow");
        loop(1);
    }

    // Factorial with ussually Loop
    static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    // Factorial use recursive method
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    // Made methode to be Error StackOverflow when we have to recursive
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Done");
        } else {
            System.out.println("Loop- " + value);
            loop(value + 1);
        }
    }
}
