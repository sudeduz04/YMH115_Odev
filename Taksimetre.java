import java.util.Scanner;

public class Taksimetre {
        public static void main(String[] args){
            //Değişkenleri tanımla.
            int km;
            double perKm = 2.20, total, startPrice = 10;

            //Kullanıcıdan verileri al.
            Scanner input = new Scanner(System.in);
            System.out.print("Mesafeyi KM cinsinden giriniz: ");
            km = input.nextInt();
            total = (km * perKm);
            total += startPrice;

            //Karşılaştırma yap.
            total = (total < 20) ? 20 : total ;
            System.out.print("Toplam tutar: " + total);
        }
    }
