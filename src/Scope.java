public class Scope {
    public static void main(String[] args) {

    }

    static void sayHello(String name) {
        // Variable scope global at this methode
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            // This are variable scope local
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
        System.out.println(hi); //error
    }
}
