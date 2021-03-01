import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    protected static LinkedList<Solido> ls= new LinkedList<>();

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
        int mediaVolumi= 0;
        for(Solido s: ls){
            mediaVolumi+= s.calcVolume();
        }
        mediaVolumi= mediaVolumi/ls.size();
        System.out.println("La media dei volumi è " + mediaVolumi);

        //quali solidi hanno il volume superiore alla media?
        for(Solido s: ls){
            if(s.calcVolume()>= mediaVolumi){
                System.out.println(s.dettagli());
            }
        }

        scan.close();
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
                ls.add(new Cilindro(alt, alt, alt, ragg));
                break;
            }

            case "Cubo": {
                System.out.print("Ora inserisci le misure del solido ...");
                System.out.print("Il lato: ");
                int lato= scan.nextInt();
                ls.add(new Cubo(lato));
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
                ls.add(new Piramide(alt,lar,prof));
                break;

            }

            default:{
                System.out.print("Non ho riconosciuto il solido, riprova! :(");
                break;

            }
        }

    }
}
