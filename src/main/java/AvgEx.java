import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AvgEx {

    //Esprimete con le strutture di controllo fondamentali un algoritmo che,
    //data in input una sequenza di interi, calcoli:
    // - la media di tutti i numeri pari
    // - la media di tutti i numeri dispari
    // - quale delle due medie è piu grande
    // Si supponga che l’inserimento di 0 indichi il termine
    // della sequenza (senza essere incluso)

    /**
     * scrivete una funzione che calcola la media di una sequenza in generale
     */
    public static int avg(List<Integer> sequence) {
        //qui la tua funzione
        return 0;
    }

    /**
     * Scrivete una funzione che calcola la media di tutti i numeri pari
     * Usa la funzione avg!
     */
    public static int evenAvg(List<Integer> sequence) {
        //qui la tua funzione
        return 0;
    }

    /**
     * Scrivete una funzione che calcola la media di tutti i numeri dispari
     * Usa la funzione avg!
     */
    public static int oddAvg(List<Integer> sequence) {
        //qui la tua funzione
        return 0;
    }

    /**
     * Esiste un algoritmo che in MENO RIGHE DI CODICE
     * risolve i calcoli di tutte e tre le funzioni?
     */

    public static void main(String[] args) {

        List<Integer> sequence = new LinkedList<Integer>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of numbers: ");

        int x = scan.nextInt();

        while (x != 0) {
            sequence.add(x);
            x = scan.nextInt();
        }

        // ricordati di chiudere lo scanner
        scan.close();


        /**
         * sistema i risultati qui
         */
        int evenAvg = 0;
        int oddAvg = 0;
        String bigger = "the EVEN avg is bigger";


        // Displaying the number
        System.out.println("The avg of all even numbers is " + evenAvg);
        System.out.println("The avg of all the odd numbers is" + oddAvg);
        System.out.println(bigger);

    }
}
