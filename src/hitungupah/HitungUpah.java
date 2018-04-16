/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungupah;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class HitungUpah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Jam Kerja : ");
        int jam = input.nextInt();
        System.out.println("Basepay : ");
        int basepay = input.nextInt();
        Upah(jam, basepay);
        
    }
    public static void Upah(int jam, int basepay){
            if (jam > 40 && basepay >= 8000 && jam <60) {
            double upah = ((jam-40)*(1.5*basepay))+ (40*basepay);
            System.out.println(upah);
            
        }
        else if(jam > 0 && basepay >= 8000&& jam <= 60 ){
            double upah = jam*basepay;
            System.out.println(upah);
        }
        else if(jam>60){
            System.out.println("jam kerja tidak boleh melebih dari 60");
        }
        else if(basepay < 8000){
            System.out.println("0.0");
        }
    }
}
