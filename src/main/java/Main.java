import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    protected static LinkedList<Solido> solidi = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String yn="";

        //primo messaggio
        System.out.println("Ciaone! Vuoi inserire un solido? Y/N");
        yn= scan.nextLine();

        //esegui la riga 14 e 15 tutte le volete che l'utente risponde Y
        //quando risponde N, esce dal ciclo
        while(yn.equals("Y")){
            anotherSolid();
            System.out.println("Vuoi inserire un solido? Y/N");
            yn=scan.next();
        }


        //calcolo la media dei volumi di tutti i solidi inseriti
        double mediaVolumi= 0;
        for(Solido s: solidi){
            mediaVolumi = mediaVolumi + s.calcVolume();
        }
        mediaVolumi= mediaVolumi/ solidi.size();
        System.out.println("La media dei volumi è " + mediaVolumi);

        //quali solidi hanno il volume superiore alla media?
        for(Solido s: solidi){
            if(s.calcVolume() >= mediaVolumi){
                System.out.println(s.dettagli());
            }
        }

        scan.close();

        //NEW INFO
        System.out.println("Dimmi di che tipo sono i solidi della lista!");
        for(Solido s : solidi) {
            if (s instanceof Piramide) {
                System.out.println("piramide");
            } else if (s instanceof Cubo) {
                System.out.println("cubo");
            }
        }
    }

    public static void anotherSolid(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Scegli un solido tra Cilindro, Cubo e Piramide ");
        String solido = scan.nextLine();

        switch (solido){
            case "Cilindro": {
                System.out.print("Ora inserisci le misure del solido ...");
                System.out.print("L'altezza: ");
                int alt= scan.nextInt();
                System.out.print("..e il raggio: ");
                int ragg= scan.nextInt();
                solidi.add(new Cilindro(alt, alt, alt, ragg));
                break;
            }

            case "Cubo": {
                System.out.print("Ora inserisci le misure del solido ...");
                System.out.print("Il lato: ");
                int lato= scan.nextInt();
                solidi.add(new Cubo(lato));
                break;

            }

            case "Piramide": {
                System.out.print("Ora inserisci le misure del solido ...");
                System.out.print("La largezza: ");
                int lar= scan.nextInt();
                System.out.print("L'altezza: ");
                int alt= scan.nextInt();
                System.out.print("La profondità: ");
                int prof= scan.nextInt();
                solidi.add(new Piramide(alt,lar,prof));
                break;

            }

            default:{
                System.out.print("Non ho riconosciuto il solido, riprova! :(");
                break;

            }
        }

    }
}

/**
 * ESERCIZIO 1
 * Il gestore di un negozio associa a tutti i suoi Prodotti un codice a barre univoco,
 * una descrizione sintetica del prodotto e il suo prezzo unitario. Realizzare una classe
 * Prodotti con le opportune variabili d'istanza e metodi get.
 *
 * ESERCIZIO 1b
 * Aggiungere alla classe Prodotti un metodo applicaSconto che modifica il prezzo del
 * prodotto diminuendolo del 5%.
 *
 * ESERCIZIO 1c
 * Aggiungere alla classe Prodotti un'implementazione specifica dei metodi ereditati
 * dalla classe Object.
 *
 * ESERCIZIO 2
 * Il gestore del negozio vuole fare una distinzione tra i prodotti Alimentari e quelli
 * Non Alimentari . Ai prodotti Alimentari viene infatti associata una data di scadenza
 * (si veda la classe Data), mentre a quelli Non Alimentari il materiale principale
 * di cui sono fatti. Realizzare le sottoclassi Alimentari e NonAlimentari estendendo
 * opportunamente la classe Prodotti.
 *
 * ESERCIZIO 3
 * Modificare le due sottoclassi dell'esercizio 2 specializzando il metodo applicaSconto
 * in modo che nel caso dei prodotti Alimentari venga applicato uno sconto del 20% se la
 * data di scadenza è a meno di 10 giorni dalla data attuale (si usi il metodo getDifference
 * della classe Data), mentre nel caso dei prodotti Non Alimentari venga applicato uno sconto
 * del 10% se il prodotto è composto da un materiale riciclabile (carta, vetro o plastica).
 *
 * ESERCIZIO 4
 * Realizzare una classe ListaSpesa che chieda all'utente di inserire i prodotti acquistati
 * e calcoli il totale della spesa applicando gli opportuni sconti se il cliente ha la
 * tessera fedeltà.
 */
