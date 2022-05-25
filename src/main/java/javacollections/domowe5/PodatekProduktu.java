package javacollections.domowe5;

public enum PodatekProduktu {
    VAT8(0.08),
    VAT23(0.23),
    VAT5(0.05),
    NO_VAT(0.00);

private final double wartoscProduktu;

    public double getWartoscProduktu() {
        return wartoscProduktu;
    }

    PodatekProduktu(double wartoscPodatku){
    this.wartoscProduktu = wartoscPodatku;
}
}
