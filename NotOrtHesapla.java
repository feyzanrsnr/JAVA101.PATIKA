package basic_codes;

import java.util.Scanner;

public class NotOrtHesapla {
    public static void main(String[] args){

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner notGir = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Girin :");
        mat = notGir.nextInt();

        System.out.print("Fizik Notunuzu Girin :");
        fizik = notGir.nextInt();

        System.out.print("Kimya Notunuzu Girin :");
        kimya = notGir.nextInt();

        System.out.print("Turkce Notunuzu Girin :");
        turkce = notGir.nextInt();

        System.out.print("Tarih Notunuzu Girin :");
        tarih = notGir.nextInt();

        System.out.print("Muzik Notunuzu Girin :");
        muzik = notGir.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ort = toplam/6.0;

        System.out.println("Ortalamanız : "+ort);
        System.out.println(ort >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");
    }
}
