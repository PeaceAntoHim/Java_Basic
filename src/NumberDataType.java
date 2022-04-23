public class NumberDataType {

    public static void main(String[] args) {

        // Basic numberDataType
        byte thisByte = 100;
        short thisShort = 1000;
        int thisInt = 10000000;
        long thisLong = 100000000;
        long thisLong2 = 100000000L;

        // Floating point number
        float thisFloat = 10.10F;
        double thisDouble = 10.10;

        // Literals
        int decimalInt = 34;
        int hexDecimal = 0xFFFFFFF;
        int binaryDecimal = 0b010101010;

        // Underscore
        long amount = 1000_000_000;

        // Konversi Tipe Data Number
        // You have to remember if you want to change int to byte you have to force cause int and byte it's diffrent
        byte  thisByte = 10;
        short thisShort = thisByte;
        int thisInt = thisShort;

        byte thisByte2 = (byte) thisInt;

    }

}
