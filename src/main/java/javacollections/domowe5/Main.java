package javacollections.domowe5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> doSkopiowania = Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912");
        List<String> lista = new ArrayList<>(doSkopiowania);

//        Stwórz oddzielnego maina, a w nim kolejną listę ​String'ów​. Wykonaj zadania:
//                - dodaj do listy elementy 10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355,
//                2222, 1111, 3546, 138751, 235912 (jako stringi) (dodaj je posługując się metodą
//        Arrays.asList())
//
//        Przykład użycia Arrays.asList():
//        ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23, 32, 44, 55, 677, 11, 33));
//        Podany przykład to tylko demonstracja metody Arrays.asList, zadanie należy wykonać
//        na liście String’ów.
//
//                - określ indeks elementu 138751 posługując się metodą indexOf
//        - sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
//        - sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)
//        - usuń z listy obiekt 67888 oraz 67889 (metoda remove)
//        - wykonaj ponownie powyższe sprawdzenia.
//        - iteruj całą listę, wypisz elementy na ekran (a. w jednej linii, b. każdy element w
//                oddzielnej linii).
//                Sprawdź działanie aplikacji.

       // - określ indeks elementu 138751 posługując się metodą indexOf
        System.out.println("Indeks elementu: " + lista.indexOf("138751"));
        //sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)

        boolean czyJestNaLiscie = lista.contains("67888");
        if(czyJestNaLiscie) {
            System.out.println("Jest na liscie");
        }else{
            System.out.println("Nie ma go na liscie");
        }
    //opcja 2
        System.out.println("Czy jest n liscie: " +czyJestNaLiscie);
    // opcja 3
        System.out.println("Czy jets na liscie: " + lista.contains("67888"));


        lista.remove("67888");

        //w tym przypadku sprawdzam dodatkowo czy elelemnt zostal usuniety
               boolean czyZostalUsuniety = lista.remove("67889");
        System.out.println("Czy zostal usiniety: " + czyZostalUsuniety);
//- wykonan ponownie powyzse sprawdzenia
        System.out.println("Czy jest na liscie: " + lista.contains("67888"));

        //- iteruj całą listę, wypisz elementy na ekran (a. w jednej linii, b. każdy element w oddzielnej linii).
        System.out.println("W jednej lini:");
        for (int i = 0; i < lista.size(); i++) {
            String elementyListy = lista.get(i);
            System.out.println(elementyListy +  " ");
        }
        for (String elementListy : lista) {
            System.out.println(elementListy + " ");
        }
//-znak nowej lini zeby postwic ba koncu wszystkich wypisanych wyzej elementow
        System.out.println();
        System.out.println("W oddzielnych liniach:");
        for (int i = 0; i < lista.size(); i++) {
            String elementyListy = lista.get(i);
            System.out.println((i + 1) + " " + elementyListy);
        }
    }

}
