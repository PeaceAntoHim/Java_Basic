public class MethodOverloading {
    public static void main(String[] args) {
        // Say Hello without any parameter
        sayHello();
        // Say Hello with one parameter
        sayHello("Frans Sebastain");
        // Say Hello with any parameter
        sayHello("Sebastian Frans", "Sebastian");
    };

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
