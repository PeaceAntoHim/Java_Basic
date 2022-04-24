public class DataTypeNotPrimitif {

    public static void main(String[] args) {
        Integer thisInteger = 10;
        Long thisLong = 10L;
        Boolean thisBoolean = true;
        Byte thisByte;
        thisByte = 100;
        System.out.println(thisByte);

        Short thisShort; // default value is null
        thisShort = 100;

        // Convert primitive to non primitive
        int thisInteger1 = 1000;
        Integer thisInteger2 = thisInteger1;

        // contoh kedua
        int age = 18;
        Integer ageObject = age;
        int ageAgain = ageObject;

        // this method to change int to another data type
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        float flotAge = ageObject.floatValue();



    }

}
