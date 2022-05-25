package javacollections;

import java.util.*;

public class MainListaStringow {
    public static void main(String[] args) {

        //czytamy: List of Strings
        // lub Lista Stringow
        List<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String element;
        do {
            System.out.println("Wpisz kolejny element lub 'quit' aby zakonczyc");
            element = scanner.next();

            if(!element.equals("quit")) {
                lista.add(element);
            }
        } while (!element.equals("quit"));

        System.out.println("Wpisane elementy: ");
        System.out.println(lista);

        System.out.println("Wpisz element do znalezienia");
        String szukanyElement = scanner.next();

       int indeksSzukanegoElementu = lista.indexOf(szukanyElement);
        System.out.println("Znaleziono na indeksie: " + indeksSzukanegoElementu);

        boolean czyZnsaleziono = lista.contains(szukanyElement);
        System.out.println("Czy lista contains szuknay element: " + czyZnsaleziono);

        System.out.println("Czy lista jest pusta: " + lista.isEmpty());

        System.out.println("Rozmiar listy wynis: " + lista.size());

        //lista.clear() - usuwa wsysztkie elementy

        //
        // Najpierw sortowanie potem kopia
        Collections.sort(lista);

        List<Integer> kopia = new ArrayList<>();


    }
}
