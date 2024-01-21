import java.util.Scanner;

public class DaireAlanHesaplama {

        public static void main(String[] args){
            //Değişkenleri tanımla.
            int r;
            double pi = 3.14;
            //Kullanıcıdan verileri al.
            Scanner input = new Scanner(System.in);
            System.out.print("Dairenin yarıçapını giriniz: ");
            r = input.nextInt();
            double alan = pi * r * r;
            double cevre = 2 * pi * r;
            System.out.println("Dairenin alanı: " + alan);
            System.out.println("Dairenin çevresi: " + cevre);
        }
}
