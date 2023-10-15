package basic_codes;
import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        double average = (mat+fizik+kimya+turkce+muzik)/5;

        System.out.println("Ortalamanız : " +average);

        if (average <= 55){
            System.out.print("Sınıfta Kaldınız!");
        }

        else {
            System.out.print("Tebrikler Sınıfı Geçtiniz!");
        }
    }
}
