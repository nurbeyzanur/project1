
package algoritmaprojeleri;
//kullanıcıdan yarıçapı ve yüksekliği alınan koninin hacmi

import java.util.Scanner;


    public class proje7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int r,h;
            double hacim;
            
            System.out.println("Lütfen koninin yarıçapını giriniz: ");
            r = scan.nextInt();
            
            System.out.println("lütfen koniye ait yüksekliği giriniz:");
            h = scan.nextInt();
            
            hacim=Math.PI*r*r*h/3;
             System.out.println("verilen koninin hacmi"+hacim);
        }
    
}
