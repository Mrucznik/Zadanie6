package pl.mrucznik;

/**
 * Created by Sebastian on 24.03.2017.
 */
public class Firma extends Wpis {
    private String nazwa;
    private String adres;
    private NrTelefoniczny numer;

    public Firma(String nazwa, String adres, NrTelefoniczny numer) {
        this.nazwa = nazwa;
        this.adres = adres;
        this.numer = numer;
    }

    @Override
    void opis() {
        System.out.printf("Nazwa: %s\nAdres: %s\nNumer: %s\n", nazwa, adres, numer);
    }

    @Override
    NrTelefoniczny getNr() {
        return numer;
    }
}
