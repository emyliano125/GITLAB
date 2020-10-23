package ro.mta.facc.selab;

public class Carte implements Comparable<Carte> {
    private String titlu;
    private String autor;
    private int anPublicatie;
    private int nrPagini;

    @Override
    public int compareTo(Carte o) {
       return Integer.compare(this.nrPagini, o.nrPagini);   //echiv cu ce e mai sus
    }

    public Carte(String titlu, String autor, int anPublicatie, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.anPublicatie = anPublicatie;
        this.nrPagini = nrPagini;
    }

    @Override
    public String toString() {
        return this.titlu + " " + this.autor + ", aparuta in anul " + this.anPublicatie;
    }


}
