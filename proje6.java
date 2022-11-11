
package algoritmaprojeleri;
//kullanıcıdan alınan cisme uygulanan kuvvet, yer değiştirme ve geçen süreyle iş ve gücü bulma

import java.util.Scanner;

public class proje6 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x,F,W,s;
        float P;
        
        System.out.println("Lütfen cisme uygulanan kuvveti giriniz:");
        F = scan.nextInt();
        
        System.out.println("Lütfen yapılan yer değiştirmeyi giriniz:");
        x= scan.nextInt();
        
        System.out.println("Lütfen iş yapılırken geçen süreyi saniye cinsinden giriniz:");
        s= scan.nextInt();
        
        W=F*x;
        System.out.println("Yapılan iş:"+W);
        
        P=W/s;
        System.out.println("Güç:"+P);
                
        
        
        
        
    }
}
