package ZadanieDomowe_Zadanie;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Zadanie {
    private String nazwa;
    private String tresc;
    private LocalDateTime dateTime;

    @Override
    public String toString() {
        return "Zadanie{" +
                "nazwa='" + nazwa + '\'' +
                ", tresc='" + tresc + '\'' +
                ", dateTime=" + dateTime +
                '}';
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

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Zadanie(String nazwa, String tresc, LocalDateTime dateTime) {
        this.nazwa = nazwa;
        this.tresc = tresc;
        this.dateTime = dateTime;
    }
}
