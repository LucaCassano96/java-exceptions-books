package libreria;

public class Libro {

    private String titolo;
    private int numeroPagine;
    private String autore;
    private String editore;

    public Libro(String titolo, int numeroPagine, String autore, String editore) {

        this.setTitolo(titolo);
        this.setNumeroPagine(numeroPagine);
        this.setAutore(autore);
        this.setEditore(editore);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {

        if (titolo == null || titolo.isEmpty()) {
            throw new IllegalArgumentException("Il titolo non può essere vuoto");
        }
        this.titolo = titolo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {

        if (numeroPagine <= 0) {
            throw new IllegalArgumentException("Il numero di pagine non può essere <= 0");
        }
        this.numeroPagine = numeroPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        if (autore == null || autore.isEmpty()) {
            throw new IllegalArgumentException("L'autore non può essere vuoto");
        }
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {

        if (editore == null || editore.isEmpty()) {
            throw new IllegalArgumentException("L'editore non può essere vuoto");
        }
        this.editore = editore;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", numeroPagine=" + numeroPagine +
                ", autore='" + autore + '\'' +
                ", editore='" + editore + '\'' +
                '}';
    }
}
