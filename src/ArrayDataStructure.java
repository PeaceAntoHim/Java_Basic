public class ArrayDataStructure {

    public static void main(String[] args) {
        // Cara Pertama
        String[] stringArray;
        stringArray = new String[3];
        // Cara Kedua
        String[] stringArray2 = new String[3];

        stringArray[0] = "Stefanus";
        stringArray[1] = "Frans";
        stringArray[2] = "Sebastian";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // Array Initializer
        // Contoh pertama
            // cara pertama
            int[] arrayINt = new int[] {
                    10, 90, 80, 67, 29
            };
            // cara kedua
            long[] arrayLong2 = {
                    10, 90, 80, 70, 40
            };
        // Contoh kedua
            // cara pertama
            String[] nameAll = {
                    "Stefanus", "Frans", "Sebastian"
            };

            // Cara kedua
            int[] arrayInt = new int[] {
                    1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            };

            // Cara Ketiga
            long[] arrayLong1 = {
                    10L, 20L, 30L
            };

        // Array in opreation
            long[] arrayLong = {
                    10, 90, 80, 68, 70
            };

            arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        // Array in Array
        String[][] members = {
                {"Stefanus", "Frans", "Sebastian"},
                {"Eko", "Budi"},
                {"Sasuke", "Itachi"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);
        System.out.println(members[1][2]);
        System.out.println(members[2][0]);




    }

}
