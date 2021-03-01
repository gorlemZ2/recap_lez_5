
public class Piramide extends Solido{

    public Piramide (int altezza, int larghezza, int profondita){
        super(altezza, larghezza, profondita);
    }

    public String dettagli(){
        return super.dettagli() ;
    }

    public double calcVolume() {
        return (profondita*larghezza* altezza)/3;
    }
}

