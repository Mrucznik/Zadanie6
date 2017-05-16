package pl.mrucznik;

/**
 * Created by Sebastian on 24.03.2017.
 */
public class Osoba extends Wpis {
    private String imie;
    private String nazwisko;
    private String adres;
    private NrTelefoniczny numer;

    public Osoba(String imie, String nazwisko, String adres, NrTelefoniczny numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.numer = numer;
    }

    @Override
    void opis() {
        System.out.printf("Imie: %s\nNazwisko: %s\nAdres: %s\nNumer: %s", imie, nazwisko, adres, numer);
    }

    @Override
    NrTelefoniczny getNr() {
        return numer;
    }
}
