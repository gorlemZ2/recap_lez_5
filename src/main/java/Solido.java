public class Solido {

    protected int altezza, larghezza, profondita;

    public Solido(int altezza, int larghezza, int profondita) {

        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    public String dettagli() {
        return "Il solido ha volume  "+calcVolume();
    }

    public boolean equals(Solido other) {
        return this.altezza == other.altezza &&
                this.larghezza == other.larghezza &&
                this.profondita == other.profondita;
    }

    public double calcVolume() {
        return (this.altezza) * (this.larghezza) * (this.profondita);
    }

}