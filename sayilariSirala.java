package basic_codes;
import java.util.Scanner;

public class sayilariSirala {
    public static void main(String[] args) {
        int a,b,c, enBuyuk;
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayı : ");
        a = input.nextInt();
        System.out.print("2. sayı : ");
        b = input.nextInt();
        System.out.print("3. sayı : ");
        c= input.nextInt();
        
        enBuyuk = a;
        if (b>enBuyuk && c<b){
            enBuyuk = b;
        } else if (c>enBuyuk) {
            enBuyuk = c;
        }
        System.out.print("En büyük sayı : "+enBuyuk);

    }


    }

