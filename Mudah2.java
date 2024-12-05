package UKL;
import java.util.Scanner;

public class Mudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas bawah");
        int bawah =  input.nextInt();
        System.out.println("Masukkan batas atas");
        int atas =  input.nextInt();

        for ( int i = bawah; i <= atas; i++) {

       



        // Proses menentukan ganjil/genap bilangan
        if (i % 2 == 1) {
            System.out.println(+i + " Bilangan Ganjil");
        }
        else {
            System.out.println(+i+ " Bilangan Genap");
        }
        
    }  
}  
        
    }




    
    

