import java.io.Serializable;

/**
 * Created by talha on 02.07.2017.
 */
public class PersonelIslemleri implements Serializable {
    private int personelId;
    private String isim;
    private String soyIsim;
    private int yas;
    public PersonelIslemleri(){
        personelId = 0;
        yas = 0;
        isim = "Henüz isim girilmedi";
        soyIsim = "Henüz bir soyisim girilmedi";
    }
    public PersonelIslemleri(int personelId,String isim,String soyIsim,int yas){
        setPersonelId(personelId);
        this.isim = isim;
        this.soyIsim = soyIsim;
        setYas(yas);

    }
    public int getPersonelId(){
        if(personelId < 0)
            this.personelId = 0;

        return this.personelId;
    }
    public void setPersonelId(int personelId){
        if (personelId<0)
            this.personelId = 0;
        else
            this.personelId = personelId;
    }
    public String getIsim(){
        return isim;
    }
    public void setIsim(String isim){
        this.isim = isim;
    }
    public String getSoyIsim(){
        return soyIsim;
    }
    public void setSoyIsim(String soyIsim){
        this.isim = soyIsim;
    }
    public int getYas(){
        return yas;
    }
    public void setYas(int yas){
        if (yas < 0)
            this.yas = 0;
        else
            this.yas = yas;
    }

}

