package javacollections.domowe5;

public class AsortymenMain {
    public static void main(String[] args) {
        Asortyment asortyment = new Asortyment();
        Produkty marchew = new Produkty("marchew", 1.0, PodatekProduktu.VAT8);
        asortyment.dodajWarzywo(marchew);

        Produkty ser = new Produkty("ser", 10.50, PodatekProduktu.VAT23);
        asortyment.dodajNabial(ser);

        asortyment.wypisz();

        //wywolac funkcje i wypisz sie tylko takie produkty ktorych cena jest nizsza nizz ta podana przez nas

        asortyment.wypiszTanszeNiz(5.0);


        asortyment.szukajProduktu("ser");
    }
}
