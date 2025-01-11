
public class Sayfa extends Paylasimci {

    public Sayfa(String isim) {
        super(isim);
    }

    public void paylas(Post post) {
        System.out.println(getIsim() + " sayfasi " + post.getBaslik() + " " + post.getIcerik() + " paylasti");
        tumunuBilgilendir(post);
    }

}
