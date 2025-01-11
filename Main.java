
public class Main {

    public static void main(String[] args) {
        Kullanici k = new Kullanici("Ali", "aliacar2047@gmail.com");
        Kullanici k2 = new Kullanici("Yusuf", "ysf@gmail.com");
        Sayfa s = new Sayfa("KriptoHanem");
        k.takipciEkle(k2);

        Post p = new Post("Kripto", "Trend Coinler", k);
        k.paylas(p);

    }

}
