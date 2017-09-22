import java.io.File;

/**
 * Created by talha on 03.07.2017.
 */
public class DosyaIslemleri {
    private String konum;

    public DosyaIslemleri(String konum) {
        this.konum = konum;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public void DosyaKlasorBilgisi() {
        File dosyaKlasor = new File(konum);
        if (dosyaKlasor.exists()) {
            System.out.println(dosyaKlasor.getName() + " " + "Isimli dosya Bulun11maktadır.");
            String dosya = dosyaKlasor.isFile() ? "Belirtilen konumdaki nesne bir dosyadır"
                    : "Belirtilen konumdaki nesne dosya değildir";
            System.out.println(dosya);
            String klasor = dosyaKlasor.isDirectory() ? "Belirtilen konumdaki nesne bir klasördür"
                    : "belirtilen konumdaki nesne klasör değildir";
            System.out.println(klasor);
            System.out.println("boyutu: " + dosyaKlasor.length());
            System.out.println("konumu: " + dosyaKlasor.getPath());
            if (dosyaKlasor.isDirectory()) {
                System.out.println("Klasörün içindekiler:");
                for (String dosyaIsmi : dosyaKlasor.list())
                    System.out.println(dosyaIsmi);
            }
        }
        else {
            System.out.println("Belirtilen konumda "+ konum + "isimli nesne bulunamadı");
        }
    }
}
