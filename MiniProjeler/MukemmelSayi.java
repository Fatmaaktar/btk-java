package MiniProjeler;

public class MukemmelSayi {
    public static void main(String[] args) {
        //6--->1,2,3
        //28--->1,2,4,7,14
        int number = 25;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Mükemmel Sayı");
        } else {
            System.out.println("Mükemmel Sayı Değildir");
        }
    }
}
