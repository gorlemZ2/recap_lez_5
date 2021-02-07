import java.util.Scanner;

public class Sums {

    //Esprimete con le strutture di controllo fondamentali un algoritmo per il calcolo della somma di
    //tutti i numeri interi compresi tra x e y, estremi inclusi, dove x e y sono due interi forniti dall’utente.
    //Se ad esempio l’utente fornisce 3 e 8 il risultato dovr`a essere 33.

    /**
     * Nella prima versione supponete
     * che l’utente fornisca i numeri in ordine non decrescente.
     */

    public static int firstV(int x, int y) {
        //qui la tua funzione
        return 0;
    }

    /**
     * Nella seconda versione supponete
     * che l’utente fornisca i numeri in ordine casuale.
     */

    public static int secondV(int x, int y) {
        //qui la tua funzione
        return 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = scan.nextInt();

        System.out.print("Enter the second number: ");
        int y = scan.nextInt();

        // ricordati di chiudere lo scanner
        scan.close();

        int result = firstV(x, y);

        // Displaying the number
        System.out.println("The sum of all the numbers from " + x + " to " + y + " is: ");
        System.out.println(result);

    }
}
