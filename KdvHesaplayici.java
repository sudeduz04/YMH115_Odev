import java.util.Scanner;
public class KdvHesaplayici {

        public static void main(String[] args) {
            //Değişkenleri tanımladık.
            double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
            Scanner input = new Scanner(System.in);
            System.out.print("Tutarı giriniz:");
            tutar = input.nextDouble();

            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("Tutar:" + tutar);
            System.out.println("KDV Oranı:" + kdvOran);
            System.out.println("KDV Tutarı:" + kdvTutar);
            System.out.println("KDV'li Tutar:" + kdvliTutar);
        }
    }

