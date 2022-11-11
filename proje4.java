

package algoritmaprojeleri;
//klavyeden kütlesi hızı ve yerden yüksekliği girilen madddenin potansiyel ve kinetik enerjisini hesaplayan program

import java.util.Scanner;

        public class proje4 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int h,m,V,g;
                float potansiyel,kinetik;
                                                                                                                          
                System.out.println("Lütfen cismin kütlesini giriniz:");
                m= input.nextInt();
                
                System.out.println("Lütfen cismin yerden yüksekliğini giriniz:");
                h = input.nextInt();
                
                System.out.println("lütfen alacağınız yerçekimi ivmesini giriniz:");
                g= input.nextInt();
                
                
                System.out.println("Lütfen cismin hızını giriniz:");
                V =input.nextInt();
                
                potansiyel=m*g*h;
                 System.out.println("Cismin potansiyel enejisi:"+potansiyel);
                 
                 kinetik=(m*V*V)/2;
                 System.out.println("Cismin kinetik enerjisi:"+kinetik);
                 
                
                
                      
                     
            }
                   
    
}
