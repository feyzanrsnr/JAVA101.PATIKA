package basic_codes;
import java.util.Scanner;

public class manav {
    public static void main(String[] args) {
        double a_Fiyat = 2.14, e_Fiyat = 3.67, d_Fiyat = 1.11, m_Fiyat = 0.95, p_Fiyat = 5.00,
        a_kg,e_kg,d_kg,m_kg,p_kg;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldınız :");
        a_kg = input.nextDouble();
        System.out.print("Kaç Kilo Elma Aldınız :");
        e_kg = input.nextDouble();
        System.out.print("Kaç Kilo Domates Aldınız :");
        d_kg = input.nextDouble();
        System.out.print("Kaç Kilo Muz Aldınız :");
        m_kg = input.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Aldınız :");
        p_kg = input.nextDouble();

        double t_Armut,t_Elma, t_Muz, t_Domates, t_Patlican, toplamFiyat;
         t_Armut= a_Fiyat*a_kg;
         t_Elma= e_Fiyat*e_kg;
         t_Muz = m_Fiyat*m_kg;
         t_Domates= d_Fiyat*d_kg;
         t_Patlican= p_Fiyat*p_kg;

        toplamFiyat = t_Armut+t_Domates+t_Elma+t_Muz+t_Patlican;
        System.out.print("Toplam Tutar :"+toplamFiyat +" TL");

    }
}
