import java.util.Scanner;

public class Solido {

    protected int altezza, larghezza, profondita;

    public Solido(int altezza, int larghezza, int profondita) {

        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    public String dettagli() {

        String d = "Il solido ha volume  "+calcVolume();

        return d;
    }

    public boolean equals(Solido other) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
        return this.altezza == other.altezza && this.larghezza == other.larghezza && this.profondita == other.profondita;
    }

    public double calcVolume() {
        return (this.altezza) * (this.larghezza) * (this.profondita);
    }

}