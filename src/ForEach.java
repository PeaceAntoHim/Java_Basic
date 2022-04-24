public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "Stefanus", "Frans", "Sebastian",
                "Softwere", "Engineer", "Brandztroy"
        };

        // Loop without For Each
        for (int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("\nWith For Each\n");

        // Loop with For Each
        for (String data: array) {
            System.out.println(data);
        }
    }
}
