package ZadanieDomowe_Zadanie;

public class ListaZadanDoZrealizowania {
    public ListaZadanDoZrealizowania(String listaZadanDoZrelizowania) {
        this.listaZadanDoZrelizowania = listaZadanDoZrelizowania;
    }

    private String listaZadanDoZrelizowania;

    @Override
    public String toString() {
        return "ListaZadanDoZrealizowania{" +
                "listaZadanDoZrelizowania='" + listaZadanDoZrelizowania + '\'' +
                '}';
    }

public String dodajZadanie(){
    System.out.println("Zadanie zostało dodane:)");
    return null;
}

}
