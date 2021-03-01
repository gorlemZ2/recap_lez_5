public class Cilindro extends Solido{

    int raggio;
    double Pgreco = 3.14;

    public Cilindro (int altezza, int larghezza, int profondita, int raggio){
        super(altezza, larghezza, profondita);
        this.raggio = raggio;
    }

    public String dettagli(){
        return super.dettagli() + "e il raggio del cerchio di base è "+ this.raggio;
    }

    public double calcVolume() {
        return ((this.raggio)*(this.raggio)*(this.Pgreco))*super.altezza;
    }
}