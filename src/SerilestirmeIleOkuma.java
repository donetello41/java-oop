
/**
 * Created by talha on 03.07.2017.
 */
import java.io.*;
public class SerilestirmeIleOkuma {
    private ObjectInputStream oku;
    public void dosyaAc(){
        try {
            FileInputStream fileInput = new FileInputStream("/home/talha/Desktop/personel.ser");
            oku = new ObjectInputStream(fileInput);
        }
        catch (FileNotFoundException istisna){
            System.err.println("Dosya Bulunamadı");
            System.exit(1);
        }
        catch (IOException istisna2){
            System.err.println("Dosya Açma Hatası");
            System.exit(2);
        }
    }
    public void kayitOku(){
        PersonelIslemleri okuma;
        try {
            while (true){
                okuma = (PersonelIslemleri)oku.readObject();
                System.out.println(okuma.getPersonelId() + " " + okuma.getIsim() + " " + okuma.getSoyIsim()
                + " " + okuma.getYas());
            }
        }
        catch (EOFException istisna5){
            return;
        }
        catch (ClassNotFoundException istisna3){
            System.err.println("Personel İşlemleri Sınıfı Bulunamadı");
            System.exit(3);
        }
        catch (IOException istisna4){
            System.err.println("Dosya Okuma Hatası");
            System.exit(4);
        }
    }
    public void dosyaKapa(){
        try {
            if (oku != null)
                oku.close();
        }
        catch (IOException istisna4){
            System.err.println("Dosya Kapama Hatası");
            System.exit(5);
        }
    }

}
