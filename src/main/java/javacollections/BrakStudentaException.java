package javacollections;

public class BrakStudentaException extends Exception{
    public BrakStudentaException(String numerIndeksu){
        super("Nie znaleziono studenta o takim numerze indeksu " + numerIndeksu);

    }
}
