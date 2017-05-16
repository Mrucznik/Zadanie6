package pl.mrucznik;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	    Wpis[] wpisy = new Wpis[6];

        wpisy[0] = new Firma("Wazznet", "łąkowa 10", new NrTelefoniczny(42, 1923123));
        wpisy[1] = new Firma("Mrucznik RP", "Kart sieciowych 21/37", new NrTelefoniczny(22, 343123));
        wpisy[2] = new Firma("Rzesza", "Mac 18/88", new NrTelefoniczny(42, 2323123));

        wpisy[3] = new Osoba("Seba", "Czarnecki", "Null", new NrTelefoniczny(42, 34432));
        wpisy[4] = new Osoba("Bartosz", "Urbanski", "Null", new NrTelefoniczny(42, 234234234));
        wpisy[5] = new Osoba("Rafal", "Kusy", "Null", new NrTelefoniczny(42, 343234232));

        TreeMap<NrTelefoniczny, Wpis> mapa = new TreeMap<>();
        for (Wpis item : wpisy) {
            mapa.put(item.getNr(), item);
        }
    }
}
