
public class Main {

    public static void main(String[] args) {
        /**
        DizilerSinifi <String> StringDiziYaz = new DizilerSinifi<String>();
        DizilerSinifi <Character> CharacterDiziYaz = new DizilerSinifi<Character>();
        DizilerSinifi <Integer> IntegerDiziYaz = new DizilerSinifi<Integer>();
        DizilerSinifi <Double> DoubleDiziYaz = new DizilerSinifi<Double>();



        StringDiziYaz stringdizi = new StringDiziYaz();
        CharacterDiziYaz characterdizi = new CharacterDiziYaz();
        IntegerDiziYaz intdizi = new IntegerDiziYaz();
        DoubleDiziYaz doubledizi = new DoubleDiziYaz();
         stringdizi.diziYaz(sdizi);
         characterdizi.diziYaz(cdizi);
         intdizi.diziYaz(idizi);
         doubledizi.diziYaz(ddizi);


        String[] sdizi = {"asd","dffd","fdg","dfs"};
        Character[] cdizi = {'a','b','t','b','t'};
        Integer[] idizi = {1,7,7,5,6,7,89,12,41,06};
        Double[] ddizi = {2.3,5.4655,8.4654654,456.7891231300};

        StringDiziYaz.diziYaz(sdizi);
        IntegerDiziYaz.diziYaz(idizi);
        CharacterDiziYaz.diziYaz(cdizi);
        DoubleDiziYaz.diziYaz(ddizi);

        Zaman zmn = new Zaman(20,12, 55);
        System.out.println(zmn.saat+" "+zmn.dakika + " " + zmn.saniye);
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
         */
        Bisiklet bisiklet = new Bisiklet(2);
        System.out.println("Bisikletin Bilgileri: " + bisiklet.bilgiVer());

        Tasit tasit = new Tasit();
        System.out.println("Tasit'in Bilgileri: " + tasit.bilgiVer());





    }
}