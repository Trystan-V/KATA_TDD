package co.trystan;

/**
 * Hello world!
 */
public class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */

    ///////////////////// LEAPYEARS \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public static boolean leapYears(int year) { // le int year sera notre paramètre ou les années seront intégrées

        boolean leap = false; // on créer une boolean avec comme valeur par défaut "false" (obligatoire de
                              // définir la variable)

        if (year % 400 == 0) {
            leap = true;
            // 2 conditions pour vérifier si notre année (entrée dans le paramètre "year")
            // est bissextile
        } else if (year % 4 == 0 && year % 100 != 0) {
            leap = true;
        }

        return leap;

    }

    ///////////////////// FOOBARQUIX \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    public static String fooBarQix(int number) {
        // String FOO = "Foo";
        // String BAR = "Bar";
        // String QIX = "Qix";
        String newString = "";
        int newNumber = 0;

        if (number == 1 || number == 2) {
            newNumber = number;
        } else if (number == 3) {
            newString = "FooFoo";

        }
        return newString;
    }

    ////////////////////// NUMBERINWORDS \\\\\\\\\\\\\\\\\\\\\\\\\\\

    public static String numberInWords(int number) {

        String zero = "zero";
        // String un = "un";
        String[] unite = { "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix" };
        String[] dizaine = { "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit",
                "dix-neuf" };
        String resultat = "";

        if (number == 0) {
           
            return zero;
        
        } else if (number < 10) {
           
            resultat = unite[number - 1];
           //return resultat;
            
        } else if (number >= 10) {

            int n = number -10;
            resultat = dizaine[n];
            //return resultat;

        } 

        System.out.println(resultat);
        return resultat;

        // int[] tableauNombre {1, 2, 10};
        // String[] tableauNombreEcris {"un", "deux", "dix"};

    }

    public static void main(String[] args) {
        System.out.println();
    }
}
