package ejercicio2;

public class IdCalculation {
    // Array with letters corresponding to DNI numbers
    private static final char[] Letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    // Method that calculates the DNI letter based on the number
    public static char calculateLetter (int numberId){
        int index = numberId % 23; // remainder after dividing by 23
        return Letters[index];    // return the corresponding letter
    }
}
