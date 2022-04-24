public class OperatorAritmatic {

    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        int c = 100;
        c += 10;
        System.out.println(c);

        c -= 20;
        System.out.println(c);
        c *= 10;
        System.out.println(c);

        // Unary Operator
        int d = +100;
        int e = -10;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        e++;
        System.out.println(e);



    }

}
