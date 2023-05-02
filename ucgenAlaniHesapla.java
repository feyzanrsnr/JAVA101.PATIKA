package basic_codes;

import java.util.Scanner;

public class ucgenAlaniHesapla {
    public static void main(String[] args) {

        int kenar1, kenar2, kenar3, cevre;
        double alan, u;

        Scanner kenarlar = new Scanner(System.in);
        System.out.print("1.kenar uzunluğunu giriniz :");
        kenar1 = kenarlar.nextInt();
        System.out.print("2.kenar uzunluğunu giriniz :");
        kenar2 = kenarlar.nextInt();
        System.out.print("3.kenar uzunluğunu giriniz :");
        kenar3 = kenarlar.nextInt();

        cevre = kenar1 + kenar2 + kenar3;
        u = cevre/2;

        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("üçgenin alanı : "+alan);
    }
}
