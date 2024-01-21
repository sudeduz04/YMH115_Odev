import java.util.Scanner;

public class VucutKitleIndeksi {
        public static void main(String[] args) {
            //Değişkenleri tanımla.
            int kilo;
            double boy;
            //Kullanıcıdan verileri al.
            Scanner input = new Scanner(System.in);
            System.out.print("Kilonuzu kg cinsinden giriniz: ");
            kilo = input.nextInt();

            System.out.print("Boyunuzu metre cinsinden giriniz: ");
            boy = input.nextDouble();

            double vucutKitleIndeksi = kilo / (boy * boy);
            System.out.println("Vücut kitle indeksi: " + vucutKitleIndeksi);
        }
    }
