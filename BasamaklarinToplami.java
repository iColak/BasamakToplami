package donguler;

import java.util.Scanner;

public class BasamaklarinToplami {
    public static void main(String[] args) {
        int sayi, toplam=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();
        while(sayi!=0){
            int rakam = sayi % 10;
            toplam += rakam;
            sayi /=10;
        }
        System.out.println(toplam);
    }
}
