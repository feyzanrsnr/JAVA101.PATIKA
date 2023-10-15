package basic_codes;
import java.util.Scanner;

public class havaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int heat ;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Kayak yapmak için harika bir gün");
        }

        else if (heat <= 25){
            if (heat < 15){
                System.out.println("Sinemaya gitmek için harika bir gün");
            }
            if (heat >= 10){
                System.out.println("Pikniğe gitmek için harika bir gün");
            }
        }
        else {
            System.out.print("Denize gitmek için harika bir gün");
        }


    }
}
