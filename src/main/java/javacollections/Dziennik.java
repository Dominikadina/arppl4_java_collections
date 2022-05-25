package javacollections;

import java.util.ArrayList;
import java.util.List;

public class Dziennik {
    private List<Student> lista = new ArrayList<>();

    public void dodajStudenta(Student student) {
        lista.add(student);
    }

    public void usunStudenta(Student student) {
        lista.remove(student);

    }

    public void usunStudenta(String numerIndeksu) {
        for (int i = 0; i < lista.size(); i++) {
           Student sprawdzanyStudentI = lista.get(i);
            String numekIndeksuStudentaI = sprawdzanyStudentI.getNumerIndeksu();

            if (numekIndeksuStudentaI.equals(numerIndeksu)) {
                System.out.println("Usuwam studenta");
                lista.remove(sprawdzanyStudentI);
                return;
            }
        }
        System.out.println("Nie znaleziono studenta");
    }



    public Student zwrocStudenta(String numerIndeksu) throws BrakStudentaException {
        for (int i = 0; i < lista.size(); i++) {
            Student sprawdzanyStudentI = lista.get(i);
            String numerIndeksuStudentI = sprawdzanyStudentI.getNumerIndeksu();
            if (numerIndeksuStudentI.equals(numerIndeksu)) {
                return sprawdzanyStudentI;
            }

        }
        throw new BrakStudentaException(numerIndeksu);
    }

        public double podajSredniastudenta(String numerIndeksu) throws BrakStudentaException {
        for (int i = 0; i < lista.size(); i++) {
        Student sprawdzanyStudentI = lista.get(i);
        String numerIndeksuStudentI = sprawdzanyStudentI.getNumerIndeksu();

        if (numerIndeksuStudentI.equals(numerIndeksu)) {
            double srednia = sprawdzanyStudentI.obliczSrednia();
            return srednia;
        }
        }
            throw new BrakStudentaException(numerIndeksu);
    }

    public void wypisz(){
        System.out.println("Lista studentow:");
        for (Student student: lista){
            System.out.println(student);
        }
    }

//
//        public Student zwrocStudentaNULL(String numerIndeksu){
//            for (int i = 0; i < lista.size(); i++) {
//                Student sprawdzanyStudentI = lista.get(i);
//                String numerIndeksuStudentI = sprawdzanyStudentI.getNumerIndeksu();
//                if(numerIndeksuStudentI.equals(numerIndeksu)){
//                    return sprawdzanyStudentI;
//                }
//
//            }
//            return null;
//
    }



