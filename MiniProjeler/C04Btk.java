package MiniProjeler;

public class C04Btk {
    public static void main(String[] args) {
        String ogrenci1="Fatma";
        String ogrenci2="Rojin";
        String ogrenci3="Pınar";
        String ogrenci4="Elif";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-------------------------");

        String [] ogrenciler=new String[4];

        ogrenciler[0]="Fatma";
        ogrenciler[1]="Rojin";
        ogrenciler[2]="Pınar";
        ogrenciler[3]="Elif";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }//iki for döngüsüde aynı görevi görür.
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
