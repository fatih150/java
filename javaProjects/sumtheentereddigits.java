import java.util.Scanner;

public class okulno {



	    public static void main(String[] args) {
	        int sonuc = 0;
	        System.out.println("Okul numaranizi girin (Max. 10 rakam): " );

	        Scanner girdisayi = new Scanner(System.in);
	              
	        int veri1 = girdisayi.nextInt();
	        
	        while (veri1 > 0) {
	        
	            sonuc += (veri1 % 10);
	            
	            
	            veri1 = veri1 / 10;
	        }
	        
	        System.out.println("Girdiginiz sayilarin rakamlari toplami: " + sonuc);
	        	girdisayi.close();
	    
	   
	    }
}

