package javacollections;

import javax.swing.text.Element;
import java.util.*;

public class Zadaniedomowe2 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        int kolejneLiczby = 0;

        for (int i = 0; i < 10; i++) {
            int wylosowanaLiczba = new Random().nextInt(100);
            kolejneLiczby = wylosowanaLiczba;

            lista.add(kolejneLiczby);

        }
        double suma = 0.0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i);

        }

        System.out.println("Lista: " + lista);
        //ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(kolejneLiczby));

        System.out.println("Suma liczb: " + suma);

        System.out.println("Srednia z wylosowanych liczb: " + suma / lista.size());

        List<Integer> kopia = new ArrayList<>();
        System.out.println(kopia);

        Collections.sort(lista);
        System.out.println("Lista posortowana: " + lista);
// do mediany potrzebujemy posortowanej listy

        //Integer mediana = 0;

        double mediana;
        if (lista.size() % 2 == 0) { // dla parzystych
            int indeksSrodkowyElement = lista.size() / 2;

            int wartosc1 = lista.get(indeksSrodkowyElement);
            int wartosc2 = lista.get(indeksSrodkowyElement - 1);

            mediana = (wartosc1 + wartosc2) / 2.0;
        } else { // dla nieparzystych
            int indeksSrodkowyElement = lista.size() / 2;
            mediana = lista.get(indeksSrodkowyElement);

        }
        System.out.println("Mediana: " + mediana);
        System.out.println("Mediana z wylosowanych liczb: " + lista);


// najwiekszy element i najmniejszy element

        int maximum = kopia.get(0);
        int minimum = kopia.get(0);
        for (int i = 0; i < kopia.size(); i++) {
            if (kopia.get(i) > maximum) {
                maximum = kopia.get(i);
            }
            if (kopia.get(i) < minimum) {
                minimum = kopia.get(i);
            }
        }
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        System.out.println("Najwiekszy element: " + maximum);
        System.out.println("Najwieksy element jest na pozycji: " + kopia.indexOf(maximum));
        System.out.println("Najmniejszy element: " + minimum);
        System.out.println("Najmniejszy element jest na pozycji: " + kopia.indexOf(minimum));


        //to samo co wyzej ale za pomoca petli for

        int indeksmaximum = 0;
        int indeksminimum = 0;

//        for (int i = 0; i < kopia.size(); i++) {
//            if (kopia.get(i)) == maximum {
//                indeksmaximum = i;
//            }
//            if (kopia.get(i)) == minimum {
//                indeksminimum = i;
            }

        }
//        System.out.println(+indeksmaximum);
//        System.out.println(+indeksminimum);
//    }
//}
