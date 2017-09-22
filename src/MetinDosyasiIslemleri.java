/**
 * Created by talha on 02.07.2017.
 */
import java.io.FileNotFoundException;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MetinDosyasiIslemleri {
    private Scanner oku;
    public void dosyaAc(){
        try {
            oku = new Scanner(new File("/home/talha/Desktop/personel.txt"));
        }
        catch (FileNotFoundException istisna){
            System.err.println("Dosya oluşturulamadı...");
            System.exit(1);
        }
    }
    public void kayıtOku(){
        PersonelIslemleri okuma = new PersonelIslemleri();
        try {
            while (oku.hasNext()) {
                okuma.setPersonelId(oku.nextInt());
                okuma.setIsim(oku.next());
                okuma.setSoyIsim(oku.next());
                okuma.setYas(oku.nextInt());
                System.out.println(okuma.getPersonelId() + " " + okuma.getIsim() + " " + okuma.getSoyIsim() + " " + okuma.getYas());
            }
        }
        catch (NoSuchElementException istisna){
            System.err.println("Dosya Beklenildiği gibi tasarlanmamış...");
            System.exit(1);
        }
    }
    public void dosyaKapa(){
        if (oku != null)
            oku.close();
    }
}
