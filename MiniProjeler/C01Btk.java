package MiniProjeler;

public class C01Btk {
    private double toplama;
    private double toplam;
    private int total;
    private int ata;

    public static void main(String[] args) {
        int ilPlaka=21;
        String adi="Fatma";
        double boyu=1.70;

        System.out.println(ilPlaka);
        System.out.println(adi);
        System.out.println(boyu);

        toplama(25.5,52.3);
        toplam(20,20.5);
         total(20,'A');
         ata(10,20);

    }
    public static void toplama(double sayi1, double sayi2){
        System.out.println("toplama:"+(sayi1 +sayi2));
    }
    public static void toplam(int number1, double number2){

        System.out.println("toplam:"+(number1+number2));
    }
    public static void total(int sayac, char rakam){

        System.out.println("total:"+(sayac+rakam));
    }
    public static void ata(int no1,int no2){
        System.out.println(no1+"="+no2);
    }




}
