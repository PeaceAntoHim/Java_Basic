public class StringDataType {

    public static void main(String[] args) {
        String firstName = "Frans";
        String lastName = "Sebastian";

        // Menggabungkan String
        String fullName = firstName + " " + lastName;

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(fullName);


        // Contoh kedua
        String name;
        name = "Frans Sebastuan";

        int age;
        age = 18;
        String addreas;
        addreas = "Jln. Pluit Permai 6 no 46";

        System.out.println(name);
        System.out.println(age);
        System.out.println(addreas);

        // Contoh Ketiga dengan kata kunci var

        var firstName1 = "Frans";
        var lastName1 = "Sebastian";
        var age1 = 18;
        var addreas1 = "Jln. Pluit Permai";

        System.out.println(firstName1);
        System.out.println(lastName1);
        System.out.println(age1);
        System.out.println(addreas1);

        // Contoh ketiga dengan kata kunci final
        final String name2 = "Frans Sebastian";
        // Final variable like const at js we can to added new data.
        System.out.println(name2);
    }
}
