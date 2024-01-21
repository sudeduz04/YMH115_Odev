import java.util.Scanner;

public class KullaniciGiris {
        public static void main(String[] args) {
            String userName, password;

            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();

            System.out.print("Şifre giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("Giriş yaptınız");

            }else{
                System.out.println("Bilgiler hatalı");
            }
        }
    }
