
package algoritmaprojeleri;

import java.util.Scanner;

public class proje2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       double a,radyan,gradyan;
        
        System.out.println("Lütfen derece şeklinde açıyı giriniz:");
        a =scan.nextInt();        
        radyan=a*Math.PI/180;
        System.out.println("Radyan"+radyan);
        
        
    }
}
