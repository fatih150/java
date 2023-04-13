import java.util.Scanner;

public class hesapmakinasi {
    
    public static void main(String[] args) {
        
        Scanner hsp = new Scanner(System.in);
        
        System.out.println("Kesirli islemler icin virgul kullaniniz... ");
        System.out.print("1. Sayiyi giriniz: ");
        Double sayi1 = hsp.nextDouble();
        System.out.print("2. Sayiyi giriniz: ");
        Double sayi2 = hsp.nextDouble();
        
        System.out.println("YAPILACAK ISLEMI SECINIZ");
        System.out.println("1. TOPLAMA");
        System.out.println("2. CIKARMA");
        System.out.println("3. CARPMA");
        System.out.println("4. BOLME");
        
        System.out.print("Islem seciminizi giriniz: ");
        Double secim = hsp.nextDouble();
        
        if(secim == 1) {
            System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
        }
        else if(secim == 2) {
            System.out.println("Cikarma isleminin sonucu = " + (sayi1 - sayi2));
        }
        else if(secim == 3) {
            System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
        }
        else if(secim == 4) {
            System.out.println("Bolme isleminin sonucu = " + (double)sayi1 / sayi2);
        }
        else {
            System.out.println("Yanlis secim yaptiniz. Seciminizi kontrol ediniz.");
            hsp.close();
        }
       
    }
}
