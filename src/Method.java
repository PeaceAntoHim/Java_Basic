public class Method {
    public static void main(String[] args) {

        System.out.println("This method not use any parameter");
        sayHelloWorld();

        System.out.println("\nThis method use parameter");
        sayHello("Frans", "Sebastian");
        sayHello("Uciha", "Sasuke");
        sayHello("Monkey D", "Luffy");

        System.out.println("\nMethod with return value");
        var result1  = sum(100, 100);
        System.out.println(result1);
        // Cara Kedua
        System.out.println(sum(200, 200));
        System.out.println(hitung(100, "+",100));
        System.out.println(hitung(200, "-", 100));
        System.out.println(hitung(200, "salah", 100));

        System.out.println("\nMethod variable without Argument");
        int [] values = {80, 90, 100, 85, 90};
        sayCongrats("Frans", values);

        System.out.println("\nMethod variable use Argumetns");
        sayCongrats1("Luffy", 80, 90, 100, 85);
    }

    // Method without parameter
    static void sayHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
    }

    // Method with parameter
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    // Method Return Value
    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String opreasi, int value2) {
        switch (opreasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
    // Method Variable Without Argument
    static void sayCongrats(String name, int[] values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Congrats " + name + ", you was graduated");
        } else {
            System.out.println("Sorry " + name + ",you not graduated");
        }
    }
    // Method with Variable Argument
    static void sayCongrats1(String name, int... values) {
        int total = 0;
        for (var value: values) {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Congrats " + name + ", you was graduated");
        } else {
            System.out.println("Sorry" + name + "Your not graduated");
        }
    }
}
