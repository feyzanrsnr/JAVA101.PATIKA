package basic_codes;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.net.SecureCacheResponse;
import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, islem;
        Scanner input = new Scanner(System.in);

        System.out.print("birinci sayıyı girin :");
        sayi1 = input.nextInt();
        System.out.print("ikinci sayıyı girin :");
        sayi2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz :");
        islem = input.nextInt();

        switch (islem){
            case 1:
                System.out.print("Toplam = "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.print("Fark = "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.print("Çarpım = "+ (sayi1*sayi2));
                break;
            case 4:
                if(sayi2 !=0){
                    System.out.print("Bölüm = "+ (sayi1/sayi2));
                    break;
                }
                else{
                    System.out.print("0'a bölme işlemi yapılamaz!");
                    break;
                }
            default:
                System.out.print("Geçersiz bir işlem numarası seçtiniz!");
        }

    }
}
