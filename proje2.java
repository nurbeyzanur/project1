
package algoritmaprojeleri;
//Derece cinsinden girilen sayıyı radyan ve grad birimine çeviren program
import java.util.Scanner;

public class proje2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       double a,radyan,grad;
        
        System.out.println("Lütfen derece şeklinde açıyı giriniz:");
        a = scan.nextInt();        
        radyan = a*Math.PI/180;
        System.out.println("Radyan: "+radyan);
        grad = a*10/9;
        System.out.println("Grad: "+grad);
         
    }
}
