package donguler;

import java.util.Scanner;

public class BasamaklarinToplami {
    public static void main(String[] args) {
        int sayi, tempNumber, bolum=0, toplam=0, basamakSayisi=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        tempNumber = sayi;
        do{
            bolum=tempNumber/10;
            tempNumber = bolum;
            basamakSayisi++;
        }while (bolum!=0);

        int rakam;
        for(int i=1; i<=basamakSayisi; i++){
            rakam = sayi%10;
            toplam += rakam;
            sayi/=10;
        }
        System.out.println("Girilen sayının basamaklarının sayı değeri toplamı: " +toplam);

    }
}
