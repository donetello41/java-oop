public class KaraTasiti extends Tasit {
    private int tekerlekSayisi;

    public int getTekerlekSayisi() {
        return this.tekerlekSayisi;
    }

    public void setTekerlekSayisi(int tekerlekSayisi) {
        this.tekerlekSayisi = tekerlekSayisi;
    }

    public KaraTasiti(int tekerlekSayisi) {
        setTekerlekSayisi(tekerlekSayisi);
        System.out.println("Kara Tasiti sınıfının kurucusu");
    }
    public String bilgiVer(){
        return super.bilgiVer() + " - Kara Tasiti";
    }
}