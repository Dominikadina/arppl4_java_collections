package javacollections.zadanieSamochow;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

//        Car car = new Car("GA82");
//        Car car1 = new Car("GA78");
//        Car car2 = new Car("GA67"); - na dole zrobilismy od razu dodanie do garazu bo w kalsie garage mamy metode dodaj pod nazwa wjazdPojazdu

        garage.wjazdPojazdu(new Car("GA82"));
        garage.wjazdPojazdu(new Car("GA78"));
        garage.wjazdPojazdu(new Car("GA67"));

        garage.wyjazdPojazdu("GA82");
        garage.wypiszSamochowyZTablicaRejestracyjnaZaczynajacaSieOd("GA");

        Optional<Car> tuMozeBycSamochod = garage.wyjazdSamochpduZGarazu("GKA71");
        if(tuMozeBycSamochod.isPresent()) {

            Car samochodKtoryWyjechal = tuMozeBycSamochod.get();

            System.out.println("Wyjechal: " + samochodKtoryWyjechal.getNumerRejestracyjny());
        }else{
            System.out.println("Skradziono");

        }
    }
}
