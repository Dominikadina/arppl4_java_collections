package pl.sda.arp4.zadaniedomowe5;

import java.util.Collection;

public class Student {
    public Student(String numerIndeksu, String imie, String nazwisko, Plec plec) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numerIndeksu='" + numerIndeksu + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                '}';
    }

    private String numerIndeksu;
    private String imie;
    private String nazwisko;
    private Plec plec;

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Plec getPlec() {
        return plec;
    }
}
