public class Hlavna {
    public static void main(String[] args) {
        Kniha k1 = new Kniha("Hemingway", "Starec a more");
        Kniha k2 = new Kniha("J.K. Rowlingová", "Harry Potter: Kameň mudrcov");

        System.out.println("Na sklade máme: ");
        Kniznica knzinica = new Kniznica();
        knzinica.pridajKnihu(k1);
        knzinica.pridajKnihu(k2);
        knzinica.vypis();
    }
}
