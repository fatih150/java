import java.util.Scanner;

public class sayiort3 {
	
	

	 
	    public static void main(String[] args) {
	        
	        Scanner sayior=new Scanner(System.in);
	        System.out.println("ilk sayiyi giriniz: ");
	        double sayi1 = sayior.nextDouble();
	        System.out.println("ikinci sayiyi giriniz: ");
	        double sayi2 = sayior.nextDouble();
	        System.out.println("ucuncu sayiyi giriniz: ");
	        double sayi3 = sayior.nextDouble();
	        System.out.println(" ");
	        
	        
	        double toplam=sayi1+sayi2+sayi3;
	        double ortalama=toplam/3;
	        System.out.println("Girilen 3 sayinin ortalamasi: "+ortalama);
	        sayior.close();

	    }
}
