package algoritmaprojeleri;
//kenar uzunluğu ve o kenara ait yüksekliği verilen üçgenin alanı
import java.util.Scanner;

public class Proje1 {

    public static void main(String[] args) {               
         Scanner scan = new Scanner(System.in);
        int kenar,yükseklik;
        float alan;
        
        System.out.println("Lütfen üçgenin bir kenarının uzunluğunu giriniz");
        kenar = scan.nextInt();
        
        System.out.println("Lütfen girdiğiniz kenar uzunluğa ait yüksekliği giriniz");
        yükseklik = scan.nextInt();
        
        alan=(float)( kenar*yükseklik)/2;
        System.out.println("Verilen bilgilere ait üçgenin alanı:"+alan);
    }
    
}
