public class SwitchLamda {
    public static void main(String[] args) {
        nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Bravo you graduate with great");
            case "B", "C" -> System.out.println("You Graduate");
            case "D" -> System.out.println("You not graduate");
            default -> {
                System.out.println("Mybe you wrong to choose major");
            }
        }
    }
}
