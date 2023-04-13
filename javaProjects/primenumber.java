import java.util.Scanner;

public class girdiasalsayi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = sc.nextInt();
        sc.nextLine();
        boolean asalMi = true, asalMi1 = true;
        int yedekSayi1 = sayi;
        for (int i = 2; i < sayi; i++) {
            if(sayi % i == 0){
                asalMi = false;
            }
        }
        if(asalMi == true){
            System.out.println("Girilen sayı: Asal");
        } else {
            while(asalMi1 == true){
                yedekSayi1++;
                for (int i = 2; i < yedekSayi1; i++) {
                    if(yedekSayi1 % i == 0) {
                        asalMi1 = false;
                    }
                }
                if(asalMi1 == false){
          
                
                    asalMi1 = true;
                } else {
                    System.out.println("Girilen sayıdan sonra gelen ilk asal sayı: " + yedekSayi1);
                    break;
                   


      }
            }
            sc.close();
      }
    }
}
