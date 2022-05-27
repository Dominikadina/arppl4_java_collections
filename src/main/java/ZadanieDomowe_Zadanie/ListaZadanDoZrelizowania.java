package ZadanieDomowe_Zadanie;

import java.util.ArrayList;
import java.util.List;

public class ListaZadanDoZrelizowania {
    private List<Zadanie> listaZadanDoZrelizowania = new ArrayList<>();

    public void dodajZadanie(Zadanie zadanie) { //dodaje mi ststic??
        listaZadanDoZrelizowania.add(zadanie);
        System.out.println("Dodano nowe zadanie do listy zadań do zrealizowania");
    }
public void stworzzadanie(String nazwa, String tresc){
        Zadanie noweZadanie = new Zadanie(nazwa, tresc);
        listaZadanDoZrelizowania.add(noweZadanie);

}

    public void usunZadanie(String nazwaZadaniadoUsuniecia) {
        for (Zadanie zadanie : listaZadanDoZrelizowania) {
            if (zadanie.getNazwa().equals(nazwaZadaniadoUsuniecia)){
                listaZadanDoZrelizowania.remove(zadanie);
                System.out.println("Usunieto z listy zadań do zrealizowania");
                return;
            }
        }

    }

        public void wypisz(String nazwa){
            System.out.println("Znalezione zadanie po wpisaniu pełnej nazwy: ");
        for (Zadanie zadanie : listaZadanDoZrelizowania) {  //private static- zmienilo mi?!
            if(zadanie.getNazwa().equals(nazwa)){
                System.out.println(zadanie);

            }
        }
    }

    public void szukajPoPelnejNazwie(){
        //if(Zadanie.getNazwa)
    }

}
