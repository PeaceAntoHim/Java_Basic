public class ifStatement {
    public static void main1(String[] args) {
        var nilai = 75;
        var absen = 90;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("You graduate");
        } else {
            System.out.println("You not graduate");
        }

    }

    public static void main(String[] args) {
        var nilai = 80;
        var absen = 90;

        if (nilai >= 80 && absen >= 80 ) {
            System.out.println("Your grade A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Your grade B");
        } else if (nilai >= 60 && absen >= 65) {
            System.out.println("Your grade C");
        } else if (nilai >= 50 && absen >= 60) {
            System.out.println("Your grade D");
        } else {
            System.out.println("Your grade E");
        }
    }
}
