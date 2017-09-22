public class MotorsuzKaraTasiti extends KaraTasiti {



    public MotorsuzKaraTasiti(int tekerlekSayisi) {
        super(tekerlekSayisi);
        System.out.println("MotorsuzKaraTasiti sınıfının kurucusu");
    }
    public String bilgiVer(){
        return super.bilgiVer() + " - Motorsuz Kara Tasiti";
    }

}
