
package algoritmaprojeleri;
  //klavyeden yarıçapı girilen kürenin alanını ve hacmini  hesaplayan program
import java.util.Scanner;

public class proje3 {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        int r;
        float hacmi;
        System.out.print("Lütfen kürenin yarıçapını giriniz");
        r =scan.nextInt();
        
       
       double hacim=4*(Math.PI)*r*r*r;
       double alan= 4*(Math.PI)*r*r;
       
        System.out.println("kürenin hacmi"+hacim);
        System.out.println("kürenin alanı"+alan);      
      
              
    }
    
}
