public class ForLoop {
    public static void main(String[] args) {
        // For without any condition
//         for(;;) {
//             System.out.println("Loop Forever");
//         }
        // For with condition
        var counter1 = 1;
        for (; counter1 <= 10 ;) {
            System.out.println("Loop " + counter1);

            counter1++;
        }

        System.out.println(counter1);

        // For with init statement
        for (var counter = 1; counter <= 10;) {
            System.out.println("Loop for-" + counter);
            counter++;
        }
        // For with Post Statement
        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Loop " + counter);
        }

    }
}
