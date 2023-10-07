package basic_codes;
import java.util.Scanner;

public class vucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double boy, kilo, vki;
        System.out.print("Boyunuzu Girin (m) :");
        boy = input.nextDouble();
        System.out.print("Kilonuzu Girin (kg) :");
        kilo = input.nextDouble();
        vki = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : "+vki);
    }
}
