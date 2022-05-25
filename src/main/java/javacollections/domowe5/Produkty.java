package javacollections.domowe5;

public class Produkty {
    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    private String nazwaProduktu;

    public double getCenaProduktuNetto() {
        return cenaProduktuNetto;
    }

    public PodatekProduktu getIloscPodatku() {
        return iloscPodatku;
    }

    private double cenaProduktuNetto;
    private PodatekProduktu iloscPodatku;

    @Override
    public String toString() {
        return "Produkty{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cenaProduktuNetto=" + cenaProduktuNetto +
                ", iloscPodatku=" + iloscPodatku +
                '}';
    }

    public Produkty(String nazwaProduktu, double cenaProduktuNetto, PodatekProduktu iloscPodatku) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktuNetto = cenaProduktuNetto;
        this.iloscPodatku = iloscPodatku;
    }

    public double obliczCeneBrutto() {
        return cenaProduktuNetto + (cenaProduktuNetto * iloscPodatku.getWartoscProduktu());

    }
}

