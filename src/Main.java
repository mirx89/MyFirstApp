public class Main {
    static String[] names = {"Mati", "Kati", "Aita", "Leida"};
    public static void main(String[] args) {
        // publib saab mujalt klassist välja kutsuda
        // private saab välja kutusda vaid klassis sees

        // Print text
        /**
         * Java Coc
         * Multiline comment
         * Saab kasutada hiljem??
         */

        /* Multiline comment
        * Second line
        * */

        System.out.println("Hello Java World"); // System.out.println(); osa tuleb ka siis kui kirjutada "Sout"
        String name = "Mirko"; // Text
        int age = 34; // Täisarv
        double height = 1.75; // Murdard (Float)
        System.out.println(name + " is " + age + " years old and "+ height + "m tall.");

        /* Array omtegers primitive
        * kantsulud [] kuna on masiiv ehk mitu
        */
        int[] ages = {20, 17, 25, 63, 42, 63};
        showIntegers(ages); // alt poolt tuleb showintegers + print lause
        ages[0] = 100;
        showIntegers(ages);
        ages[ages.length-1] = 99; // muudab viimast
        showIntegers(ages);
        // Show names strings
        showStrings();
    }
    private static void showIntegers(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println(" "); // reavahetus jaoks
    }
    public static void showStrings() {
        for(int x = 0; x < names.length; x++) { // klassi ülene muutuja nimi on lilla
            System.out.print(names[x] + " ");
        }
        System.out.println();
    }
}
