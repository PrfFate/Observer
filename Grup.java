
public class Grup implements Takipci {

    private String isim;

    public Grup(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void bilgilendir(Post post) {
        System.out.println(getIsim() + " grup uyelerine  " + post.getPaylasimci().getIsim() + " 'in yaptigi paylasim mail olarak gönderildi.");
    }

}
