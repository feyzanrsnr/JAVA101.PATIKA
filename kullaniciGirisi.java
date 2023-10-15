package basic_codes;
import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, yeniSifre, islem;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        userName = input.nextLine();
        System.out.print("Şifre : ");
        password = input.nextLine();

        if(userName.equals("Feyzanur") && password.equals("java123")){
            System.out.println("Sisteme Giriş Başarılı");

        } else{
            System.out.println("Bilgileriniz Yanlış");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? (evet/hayır) :");
            islem = input.nextLine();

            if (islem.equals("evet")){
                System.out.print("Yeni Şifre: ");
                yeniSifre = input.nextLine();

                    if (!yeniSifre.equals("java123")){
                        System.out.print("Şifreniz başarıyla güncellendi");
                    }

                    else {
                        System.out.print("Yeni şifreniz eskisiyle aynı olamaz!");
                    }

            }
            else{
                System.out.println("Lütfen bilgilerinizi kontrol ederek tekrar giriş yapınız");
            }


        }

    }
}
