package UKL;
import java.util.Scanner;
public class Mudah3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukka jumlah bilangan");
            int jumlah = input.nextInt();
            // loop pertama dimulai dari 50 menurun sampai 2
             for (int i = jumlah; i >= 2; i--) {

                // jika i habis dibagi 3
                if (i % 3 == 0) {
                    System.out.println(i + ". saya angkatan 33");
                }

                // jika sisa bagi i dengan 3 adalah 1
                else if (i % 3 == 1) {
                    System.out.println(i + ". saya anak wikusama  ");
                } 

                // jika sisa bagi i dengan 3 adalah 2
                else if (i % 3 == 2) {
                    System.out.println(i + ". saya anak moklet");
                }
            }

            // output tambahan seteah loop selesai
            System.out.println("1. saya senang");
        }
                    
    
}
    
    