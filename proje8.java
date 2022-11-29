
package algoritmaprojeleri;
// 1 den n e kadar olan sayılardan 4 e bölünenleri bulan program

import java.util.Scanner;

       public class proje8 {
           public static void main(String[] args) {                                           
           Scanner scan = new Scanner(System.in);
           
            int n,i ;
                 System.out.println("Bir n değeri giriniz:");
                 n=scan.nextInt();
               
              for(i=1;i<n;i++){
                  if(i%4==0){
                  System.out.print(i+"-");                             
                  }  
              }                     
          }              
       }
