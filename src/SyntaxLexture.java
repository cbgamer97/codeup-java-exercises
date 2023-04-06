public class SyntaxLexture {

    public static void main(String[] args) {
        // Declaring Variables
        int weight;

//        Initialization after declaration

        weight = 12;

        // DECLARE AND INITIALIZE IN ONE STEP

        String breed = "Toy Spaniel";
        String name = "Grinch";
        int cuteness = 10;

        // A STATEMENT:
        // "JVM, DO SOMETHING!"
        System.out.println(name + " is a " + breed + '!');

        // VERY SMALL NUMBERS: BYTE DATATYPE
        byte smol = 12;
        System.out.println(smol);

        long bigNumber;
        bigNumber = smol;
        System.out.println(bigNumber);

        bigNumber = 90000000000L;

        // CASTING: CONVERTING ONE DATA TYPE INTO ANOTHER
        smol = (byte) bigNumber;
        System.out.println(smol);

        float imafloat;
        double imadouble = 9.0123456789012;

    }
}
