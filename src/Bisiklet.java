public class Bisiklet extends MotorsuzKaraTasiti {

    public Bisiklet(int tekerlekSayisi) {
        super(tekerlekSayisi);
        System.out.println("Bisiklet sınıfının kurucusu");
    }
    public String bilgiVer(){
        return super.bilgiVer() + " - Bisiklet";
    }

}
