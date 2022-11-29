package algoritmaprojeleri;
// 1 ve 7 arasında sayı girilip  bu tam sayıya göre haftanın ilgili gününü yazdıran program

import java.util.Scanner;

public class proje10 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
      int n;
      
        System.out.println("Lütfen 1 ve 7 arasında sayı giriniz:");
          n = scan.nextInt(); 
         
         if (n==1){
             System.out.println("Pazartesi günü");
             }
         else if(n==2){
             System.out.println("Salı günü");
             }
         else if(n==3){
             System.out.println(":Çarşamba günü");
             }          
         else if(n==4){
             System.out.println("Perşembe günü");
             }
         else if(n==5){
             System.out.println("Cuma günü");
             }
         else if(n==6){
             System.out.println("Cumartesi günü");
             }
         else if (n==7){
             System.out.println("Pazar günü");
             }
            
    }          
}
