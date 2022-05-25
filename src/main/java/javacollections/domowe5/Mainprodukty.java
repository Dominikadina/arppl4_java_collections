package javacollections.domowe5;

import java.util.ArrayList;
import java.util.List;

public class Mainprodukty {
    public static void main(String[] args) {
        List<Produkty> listaProduktow = new ArrayList<>();
        listaProduktow.add(new Produkty("masło", 2.30, PodatekProduktu.VAT8));
        listaProduktow.add(new Produkty("telewizor samsung", 100.1, PodatekProduktu.VAT23));
        listaProduktow.add(new Produkty("komputer samsung", 111.1, PodatekProduktu.VAT5));
        listaProduktow.add(new Produkty("mercedes", 0.50, PodatekProduktu.VAT23));
        listaProduktow.add(new Produkty("bułka", 5.00, PodatekProduktu.NO_VAT));
        listaProduktow.add(new Produkty("kamera", 110.00, PodatekProduktu.VAT5));

        System.out.println("Tylko VAT8:");
        for (Produkty produkty : listaProduktow) {
            if (produkty.getIloscPodatku() == PodatekProduktu.VAT8)
                System.out.println(produkty);
        }
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Tylko te ktorych cena netto jesy wieksz nic 100.00");

        for (Produkty produkty : listaProduktow) {
            if (produkty.getCenaProduktuNetto() > 100) {
                System.out.println(produkty);
            }

        }
        System.out.println("Tylko te ktorych cena brutto jesy wieksz nic 100.00");

        for (Produkty produkty : listaProduktow) {
            if (produkty.obliczCeneBrutto() > 110) {
                System.out.println(produkty);
            }

        }
    }
}