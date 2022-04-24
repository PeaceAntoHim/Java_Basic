public class SwitchLamda {
    public static void main(String[] args) {
        var nilai = "A";
        var nilai1 = "B";
        String ucapan;


        switch (nilai) {
            case "A" -> System.out.println("Bravo you graduate with great");
            case "B", "C" -> System.out.println("You Graduate");
            case "D" -> System.out.println("You not graduate");
            default -> {
                System.out.println("Mybe you wrong to choose major");
            }
        }

        // Switch without yeild
        switch (nilai1) {
            case "A" -> ucapan = "Bravo you graduate with great";
            case "B", "C" -> ucapan = "You Graduate";
            case "D" -> ucapan = "You not graduate";
            default -> ucapan = "Mybe you wrong to choose major";
        }
        System.out.println(ucapan);
    }
}
