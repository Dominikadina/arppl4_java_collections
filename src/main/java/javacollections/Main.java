package javacollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaDoSkopiowaniaAleNieUzywania = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(listaDoSkopiowaniaAleNieUzywania);
        //listaDoskopo....... - nie mozna zastosowac remove, ani add,


       List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(lista);

        lista.add(3, 6);
        System.out.println(lista);

// dodanie większej ilości elementów
        lista.addAll(Arrays.asList(100, 200, 300));

        lista.remove(1);
        System.out.println(lista);

        //przeiterowac
        //znalezc pod ktorym indeksem
        int inkeksPiatki = lista.indexOf(5);
        lista.remove(inkeksPiatki);

        Integer obiektDoUsuniecia = 5;
        lista.remove(obiektDoUsuniecia);
        //lub
       // lista.remove((Integer).valueoF(5)); ////cos tu jest zle


    }
}
