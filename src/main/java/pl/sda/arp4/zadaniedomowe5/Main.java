package pl.sda.arp4.zadaniedomowe5;

import java.util.ArrayList;
import java.util.List;

import static pl.sda.arp4.zadaniedomowe5.Plec.KOBIETA;
import static pl.sda.arp4.zadaniedomowe5.Plec.MEZCZYZNA;

public class Main {
    public static void main(String[] args) {

        List<Student> listaStudentow = new ArrayList<>();

        Student student = new Student("111", "Zosia", "Zych", Plec.KOBIETA);
        listaStudentow.add(student);
        listaStudentow.add(new Student("222", "Ola", "Fik", Plec.KOBIETA));
        listaStudentow.add(new Student("333", "Kuba", "Myk",Plec.MEZCZYZNA));
        listaStudentow.add(new Student("444", "Tomek", "Pyk", Plec.MEZCZYZNA));

        System.out.println(listaStudentow);

        for (int i = 0; i <listaStudentow.size() ; i++) {
            if ((listaStudentow.get(i)).getPlec() == Plec.KOBIETA){
                System.out.println("Kobieta: " + listaStudentow.get(i));
            }

        }
        System.out.println("Indeksy osob");
        for (int i = 0; i <listaStudentow.size() ; i++) {
            System.out.println(listaStudentow.get(i).getNumerIndeksu());
        }
    }
}
