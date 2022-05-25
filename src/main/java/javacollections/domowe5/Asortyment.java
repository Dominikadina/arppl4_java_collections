package javacollections.domowe5;

import java.util.ArrayList;
import java.util.List;

public class Asortyment {
        private List<Produkty> warzywa = new ArrayList<>();
    private List<Produkty> nabialy = new ArrayList<>();

    public void dodajWarzywo(Produkty produkty) {
        warzywa.add(produkty);
    }
        public void dodajNabial(Produkty produkty){
            nabialy.add(produkty);
        }

public void wypisz(){
    for (Produkty warzywo : warzywa){
        System.out.println(warzywo);
          }
    for (Produkty nabial : nabialy){
        System.out.println(nabial);
    }
}
public void wypiszTanszeNiz(double cena){
      for(Produkty warzywo : warzywa){
    if(warzywo.obliczCeneBrutto()< cena){
        System.out.println(warzywo);
    }
    }

    for (Produkty nabial : nabialy) {
        if (nabial.obliczCeneBrutto()< cena);
        System.out.println(nabial);
    }
}

    public void szukajProduktu(String nazwa) {
        for (Produkty warzywo : warzywa) {
            if (warzywo.getNazwaProduktu ().contains(nazwa));
            System.out.println(nazwa);

        }
        for (Produkty nabial : nabialy) {
            if (nabial.getNazwaProduktu().contains(nazwa));
            System.out.println(nazwa);

        }
    }
public void wypiszProduktyOpodatkowaneNa(PodatekProduktu podatekProduktu){
    for (Produkty produkt : warzywa) {
        if(produkt.getIloscPodatku() == podatekProduktu){
            System.out.println(produkt);
        }
    }
    for (Produkty produkt : nabialy) {
        if(produkt.getIloscPodatku() == podatekProduktu){
            System.out.println(produkt);
        }

    }


}

}
