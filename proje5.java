
package algoritmaprojeleri;
//klavyeden bir iletkenin direnci ile akısı girildiğinde uçlarındaki gerilimi hesaplayan program

import java.util.Scanner;

              public class proje5 {
                  public static void main(String[] args) {                      
                  
                      Scanner scan =new Scanner(System.in);
                      int I,R,U;
                      
                      System.out.println("Lütfen sistemin akımını giriniz:");
                      I= scan.nextInt();
                      
                      System.out.println("Lütfen sistemin direncini giriniz:");
                      R= scan.nextInt();
                      
                      U = I*R;
                      System.out.println("Sistemin gerilimi="+U);
                      
                  
              } 
    
}
