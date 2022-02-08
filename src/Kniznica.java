import java.util.ArrayList;

public class Kniznica {
    ArrayList<Kniha> zoznamKnih = new ArrayList<Kniha>();

    public void pridajKnihu(Kniha kniha){
        zoznamKnih.add(kniha);
    }

     public void vypis(){
         System.out.println(zoznamKnih);
    }

}
