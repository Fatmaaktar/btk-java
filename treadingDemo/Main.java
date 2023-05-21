package treadingDemo1;

public class Main {
    public static void main(String[] args) {
        KronometreTread thread1=new KronometreTread("thread1");

        KronometreTread thread2=new KronometreTread("thread2");

        KronometreTread thread3=new KronometreTread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
