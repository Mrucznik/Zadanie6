package pl.mrucznik;

public class NrTelefoniczny implements Comparable<NrTelefoniczny> {
    private int nrKierunkowy;
    private int nrTelefonu;

    public NrTelefoniczny(int nrKierunkowy, int nrTelefonu) {
        this.nrKierunkowy = nrKierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public int compareTo(NrTelefoniczny o) {
        int kierunkowyCompare = compareInts(nrKierunkowy, o.nrKierunkowy);
        return (kierunkowyCompare != 0) ? kierunkowyCompare : compareInts(nrTelefonu, o.nrTelefonu);
    }

    private int compareInts(int a, int b)
    {
        if(a == b)
            return 0;
        else if(a>b)
            return 1;
        return -1;
    }

    @Override
    public String toString() {
        return Integer.toString(nrKierunkowy) + Integer.toString(nrTelefonu);
    }
}
