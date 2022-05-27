package ZadanieDomowe_Zadanie;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zadanie {
    private String nazwa;
    private String tresc;
    private LocalDateTime dateTime;
    private boolean zadaieZrealizowane;

    public Zadanie(String nazwa, String tresc) {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.dateTime = LocalDateTime.now();
    }
    public boolean isZadaieZrealizowane() {
        return zadaieZrealizowane;
    }

    public void setZadaieZrealizowane(boolean zadaieZrealizowane) {
        zadaieZrealizowane = zadaieZrealizowane;
    }


    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Zadanie{" +
                "nazwa='" + nazwa + '\'' +
                ", tresc='" + tresc + '\'' +
                ", dateTime=" + dateTime +
                ", zadaieZrealizowane=" + zadaieZrealizowane +
                '}';
    }
}
