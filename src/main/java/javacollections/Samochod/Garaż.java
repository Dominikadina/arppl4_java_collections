package javacollections.Samochod;

import java.util.ArrayList;
import java.util.List;

public class Garaż {
   private List<Car> lista = new ArrayList<>();

    public void wjazd(Car car){
       lista.add(car);
    }

    //public void wyjazd(String numerRejesteracyjny);

}
