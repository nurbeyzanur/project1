
package algoritmaprojeleri;
 // klavyeden girilen bir tam sayının pozitif negatif ya da sıfır olduğunu söyleyen program
import java.util.Scanner;

     public class proje9 {
         public static void main(String[] args) {
             
        //kullanıcı kesinlikle tam sayı girmeli yoksa kod hata veriyor.
         Scanner scan =new Scanner(System.in);
         int n;
          
             System.out.println("Lütfen bir n tam sayı değeri giriniz:");
             n =scan.nextInt();
             
             if (n==0){
                 System.out.println(n+" sayısı sıfırdır");
             }
             
             else if(n<0){
                 System.out.println(n+" sayısı negatif bir sayıdır.");                 
             }
              
             else {
                 System.out.println(n+" sayısı pozitif bir sayıdır.");
             }   
             
         }
         
         
}
