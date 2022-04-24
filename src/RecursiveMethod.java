public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    static int factorial(int value) {
        // Factorial Loop
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }
}
