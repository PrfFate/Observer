
public class Kullanici extends Paylasimci implements Takipci {

    private String mail;

    public Kullanici(String isim, String mail) {
        this.mail = mail;
        super(isim);
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void paylas(Post post) {
        System.out.println(getIsim() + " kullanicisi " + post.getBaslik() + " paylasti");
        tumunuBilgilendir(post);

    }

    public void bilgilendir(Post post) {
        System.out.println(getIsim() + " kullanicisina " + post.getPaylasimci().getIsim() + " 'in yaptigi paylasim mesaj olarak gonderildi");
    }

}
