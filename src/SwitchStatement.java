public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("Wow bravo you graduate with great");
                break;
            case "B":
            case "C":
                System.out.println("You graduate");
                break;
            case "D":
                System.out.println("You not graduate");
                break;
            default:
                System.out.println("Maybe you wrong choose major");
        }
    }
}
