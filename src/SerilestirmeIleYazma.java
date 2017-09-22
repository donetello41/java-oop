/**
 * Created by talha on 03.07.2017.
 */
import java.io.*;

public class SerilestirmeIleYazma {
    private ObjectOutputStream yazici;
    public void dosyaAc(){
        try {
            FileOutputStream fileout = new FileOutputStream("/home/talha/Desktop/personel.ser");
            yazici = new ObjectOutputStream(fileout);
        }
        catch (FileNotFoundException istisna){
            System.err.println("Dosya Oluşturulamadı...");
        }
        catch (IOException istisna2){
            System.err.println("Dosya Açılamadı");
        }
    }
    public void kayitEkle(){
        PersonelIslemleri islem1 = new PersonelIslemleri(124652,"Talha","Demir",22);
        PersonelIslemleri islem2 = new PersonelIslemleri(56489,"Emre","Turhan",22);
        try {
            yazici.writeObject(islem1);
            yazici.writeObject(islem2);
        }
        catch (IOException istisna3){
            System.err.println("dosya yazım hatası");
        }
    }
    public void dosyaKapa(){
        try {
            if (yazici != null)
                yazici.close();
        }
        catch (IOException istina4){
            System.err.println("Dosya Kapama Hatası");
            System.exit(1);
        }

    }
}
