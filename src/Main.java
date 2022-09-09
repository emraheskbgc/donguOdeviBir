import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, adet =0 , toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz = ");
        sayi = input.nextInt();

        for (int i=1; i <= sayi; i++){
            if (i%3 == 0 && i%4 == 0){
                toplam = toplam + i;
                adet++;
            }
        }
        double avg;
        avg = toplam / adet;
        System.out.println("3'e ve 4'e Tam Bölünen Sayıların Ortalaması = " + avg);

    }
}
