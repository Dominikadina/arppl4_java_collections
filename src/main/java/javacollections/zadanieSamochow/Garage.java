package javacollections.zadanieSamochow;

import javacollections.domowe5.Produkty;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Garage {
    private List<Car> listaSamochodow = new ArrayList<>();

    public void wjazdPojazdu(Car car) {
        listaSamochodow.add(car);


    }

    public void wyjazdPojazdu(String numerRejestracyjny) {
        for (Car car : listaSamochodow) {
            if (car.getNumerRejestracyjny().equals(numerRejestracyjny)) {
                listaSamochodow.remove(car);
                System.out.println("Wyjechal: ");
                return; //break; - jesli napsalibysmy samo break to mielibysmy i wyjechl i niezlanezlimyy samochodu z ta samo rekjestracja
            }
        }
        System.out.println("Nie znalezlismy samochodu: " + numerRejestracyjny);
    }

    public void wypiszSamochody() {
        System.out.println("wszytskie samochody w garazu: ");
        for (Car car : listaSamochodow) {
            System.out.println(car);

        }
    }

    public void wypiszRejestracjeSamochodow() {
        System.out.println("Tablice rejestracyjne: ");
        for (Car car : listaSamochodow) {
            System.out.println(car.getNumerRejestracyjny());

        }
    }

    public void wypiszSamochowyZTablicaRejestracyjnaZaczynajacaSieOd(String poczatekRejestracji) {
        System.out.println("Samochowy, ktorych rejestracja zaczyna sie od: " + poczatekRejestracji + " ");
        for (Car car : listaSamochodow) {
            if (car.getNumerRejestracyjny().startsWith(poczatekRejestracji)) {
                System.out.println(car);
            }
        }
    }

public Optional<Car> wyjazdSamochpduZGarazu(String numerRejestracyjny) {  //ulepszamy metode WYJAZD POJAZDU
    for (Car car : listaSamochodow) {
        if (car.getNumerRejestracyjny().equals(numerRejestracyjny)) {
            listaSamochodow.remove(car);
            return Optional.of(car);
        }
    }

    return Optional.empty();

}
}
