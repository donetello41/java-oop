public class MotorluKaraTasiti extends KaraTasiti {

    private int motorHacmi;

    public int getMotorHacmi() {
        return motorHacmi;
    }
    public MotorluKaraTasiti(int tekerlekSayisi){
        super(tekerlekSayisi);
        System.out.println("Motorlu kara tasiti kurucusu");
    }
}
