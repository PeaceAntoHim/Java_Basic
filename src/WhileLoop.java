public class WhileLoop {
    public static void main(String[] args) {
        // While loop is simple version from for loop cause we not use init and post statement in condition
        var counter = 1;

        while (counter <= 10) {
            System.out.println("Loop for-" + counter);
            counter++;
        }
    }
}
