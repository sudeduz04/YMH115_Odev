import java.util.Scanner;
public class HipotenusHesaplama {

        public static void main(String[] args) {
            //Değişkenleri tanımla.
            int a, b;
            double c;

            //Kullanıcıdan verileri al.
            Scanner girdi = new Scanner(System.in);

            System.out.print("1. Kenarı giriniz: ");
            a = girdi.nextInt();
            System.out.print("2.Kenarı giriniz: ");
            b = girdi.nextInt();
            c = Math.sqrt((a * a) + (b * b));
            System.out.print("Hipotenüs: " + c);
        }
    }
