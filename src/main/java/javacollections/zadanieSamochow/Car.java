package javacollections.zadanieSamochow;

public class Car {
    public Car(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numerRejestracyjny='" + numerRejestracyjny + '\'' +
                '}';
    }

    private String numerRejestracyjny;

}
