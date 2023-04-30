package MiniProjeler;

public class AsalSayi {
    public static void main(String[] args) {
        int number = 25;
        int remainder = number % 2;
        //"remainder=kalan , isPrime = asalmı" anlamlarına gelirler
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;

            }
            if(isPrime){
                System.out.println("Sayı Asaldır");
            }else{
                System.out.println("Sayı Asal Değildir");
            }
        }
    }
}
