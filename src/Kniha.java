import java.util.Random;

public class Kniha {
    private String autor;
    private String nazov;
    protected int id;

    public Kniha(String autor, String nazov) {
        this.autor = autor;
        this.nazov = nazov;
    }

    public void generujId(){
        Random rd = new Random();
    }

    public String getAutor() {
        return autor;
    }

    public String getNazov() {
        return nazov;
    }
}
