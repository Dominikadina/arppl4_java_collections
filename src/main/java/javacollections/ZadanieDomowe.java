package javacollections;

import java.util.*;

public class ZadanieDomowe {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbe:");

            int wpisanaLiczba = scanner.nextInt();
            lista.add(wpisanaLiczba);
        }

//        System.out.println("Podaj liczbe: ");
//        lista.add(scanner.nextInt());
//

//            System.out.println("Podene liczby: " + lista);
//
//
//        System.out.println("Wpisz pierwsza liczbę: ");
//        Integer pierwsza = Integer.valueOf(scanner.next());
//
//        System.out.println("Wpisz druga liczbę: ");
//        Integer druga = Integer.valueOf(scanner.next());
//
//        System.out.println("Wpisz trzecia liczbę: ");
//        Integer trzecia = Integer.valueOf(scanner.next());
//
//        System.out.println("Wpisz czwartą liczbę: ");
//        Integer czwarta = Integer.valueOf(scanner.next());
//
//        lista.add(pierwsza);
//        lista.add(druga);
//        lista.add(trzecia);
//        lista.add(czwarta);

        // System.out.println("Nowa lista: " + lista);


        int kolejneLiczby;

        for (int i = 0; i <5 ; i++) {
            int wylosowanaLiczba = new Random().nextInt(100);
            kolejneLiczby = wylosowanaLiczba;

            lista.add(kolejneLiczby);

        }
            System.out.println("Wypisana lista: " + lista);
        }
        }






//       // double random = Math.random()*100;
//int i = Math.random();
//
//do{
//    for (int i = 0; i <5 ; i++) {
//random++;
//
//}
//    while ( i == 5){
//        System.out.println(djsidi);
//    }

//        int random = (int) Math.random();
//        for (int i = 0; i <5 ; i++) {
//            random++;}
//
//Integer liczbyZLosowania = random++;
//
//        System.out.print("Losowo wybrane liczby to: " );
//        System.out.println(liczbyZLosowania);
//
//
//
//        System.out.println(lista);
//    }
//}
////
////        Random random = new Random();
////        Integer rand = null;
////        int doListyLosowe = rand.nextInt(51);
////
////
//lista.addAll(Arrays.asList(100, 200, 300));
//
//
//
//
//        System.out.println("Podaj 5 liczb: ");
//
//        System.out.println(listaScanner);
//
//
//        Integer liczbaScanner = new scanner.next();
//        listaScanner.add() Integer(1);
//
//
//// dodanie większej ilości elementów
//        lista.addAll(Arrays.asList(100, 200, 300));
//
//        lista.remove(1);
//        System.out.println(lista);
//
//        //przeiterowac
//        //znalezc pod ktorym indeksem
//        int inkeksPiatki = lista.indexOf(5);
//        lista.remove(inkeksPiatki);
//
//        Integer obiektDoUsuniecia = 5;
//        lista.remove(obiektDoUsuniecia);
//    }
//}
