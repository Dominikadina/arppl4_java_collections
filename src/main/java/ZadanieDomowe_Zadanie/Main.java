package ZadanieDomowe_Zadanie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zadanie zadanie = new Zadanie("prasowanie", "prasowanie poscieli");
        ListaZadanDoZrelizowania lista = new ListaZadanDoZrelizowania();
        lista.dodajZadanie(new Zadanie("odkurzanie", "odkurzanie podłóg"));
        lista.dodajZadanie(new Zadanie("mycie", "mycie okien"));

        System.out.println(lista);

       lista.stworzzadanie ("odkurzanie2", "odkurzanie mebli");


        lista.wypisz("odkurzanie");
        lista.wypisz("odkurzanie2");


    }
}
