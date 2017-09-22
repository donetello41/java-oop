/**
 * Created by talha on 29.08.2017.
 */
public class Zaman {
    int saat, dakika, saniye;
    Zaman(int saat){
        if(saat >= 0 && saat < 24)
            this.saat = saat;
    }
    Zaman(int saat,int dakika){
        this(saat);
        if (dakika >= 0 && dakika < 60)
            this.dakika = dakika;
    }
    Zaman(int saat,int dakika,int saniye){
        this(saat,dakika);
        if (saniye >= 0 && saniye < 60)
            this.saniye = saniye;

    }

}
