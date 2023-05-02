package basic_codes;

import java.util.Scanner;

public class kdvHesapla {
    public static void main(String[] args){

        double miktar, kdvOran = 0.18, kdvTutar, kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Para miktarını giriniz :");
        miktar = input.nextDouble();

        if(miktar > 1000) {
            kdvOran = 0.08;
        }

        kdvTutar = miktar * kdvOran;
        kdvliFiyat = miktar + kdvTutar;


        System.out.println("KDV'siz Fiyat :"+miktar);
        System.out.println("KDV Oranı :"+kdvOran);
        System.out.println("KDV Tutarı :"+kdvTutar);
        System.out.println("KDV'li Fiyat :"+kdvliFiyat);
    }
}
