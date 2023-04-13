import java.util.Scanner;

public class tekcift{
	
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz ");
        int deger= tc.nextInt();
        if(deger%2 == 1){
           System.out.println("Girdiginiz Sayi TEK");
        }else{
           System.out.println("Girdiginiz Sayi CIFT");
           
           tc.close();
        }
    }
}