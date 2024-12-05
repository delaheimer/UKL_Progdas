
package UKL;
import java.util.Scanner;

public class Sedang2 {

    // method untuk menghitung volume tabung
     static void volumetabung(Double r , double t ){
        double phi = 3.14;
        double result = phi * r * r * t;
        System.out.println("volume tabung "+ result);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input jari-jari
        System.out.println("masukan nilai r");
        double r = input.nextDouble();

        // input tinggi
        System.out.println(" masukan nilai t");
        double t = input.nextDouble();
        
        // Memanggil method untuk menghitung volume tabung
        volumetabung(r, t);
                
    }

}
    
    