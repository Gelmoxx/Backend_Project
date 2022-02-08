import java.util.ArrayList;

public class Kniznica {
    ArrayList<Kniha> zoznamKnih = new ArrayList<Kniha>();

    public void pridajKnihu(Kniha kniha){
        zoznamKnih.add(kniha);
    }

     public void vypis(){
        for (Kniha k : zoznamKnih){
            System.out.println(k.getAutor());
            System.out.println(k.getNazov());
            System.out.println();
        }
    }

}
