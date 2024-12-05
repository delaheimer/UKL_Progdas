package UKL;
import java.util.Scanner;
import java.util.Random;

public class Sedang3 {
   ;

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while (true) { 

            // input jenis
            System.out.println("Pilih Jenis Kuis (Pilih Angkanya):");
            System.out.println("1. Perkalian\n2. Pembagian\n3. Modulus\n4. penjumlahan\n5. pengurangan\n6. Keluar");
            int jenis = input.nextInt();

            // untuk menetukan lanjut / tidaknya program
            if (jenis == 6) { 
                System.out.println("Terima kasih telah bermain!");
                break; 
            }

            if (jenis < 1 || jenis > 6) {
                System.out.println("Pilihan tidak valid. Silakan pilih ulang.\n");
                continue; 
            }

            // untuk menyimpan variabel
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1; 
            int correctAnswer = 0;
            String operator = "";

           
            // Menetukan jenis yang harus diproses
            
            // Perkalian
            if (jenis == 1) { 
                operator = "*";
                correctAnswer = num1 * num2;
            }

            // Perkalian
            else if (jenis == 2) {
                operator = "/";
                correctAnswer = num1 / num2;
                num1 = correctAnswer*num2; // validasi jawaban
            }

            // modulus
            else if (jenis == 3) {
                operator = "%";
                correctAnswer = num1 % num2;
            }

            // penjumlahan
            else if (jenis == 4) {
                operator = "+";
                correctAnswer = num1 + num2;
            }

            else if (jenis == 5) {
                operator = "-";
                correctAnswer = num1 - num2;
            }

            


            // Tampilkan pertanyaan
            System.out.printf("%d %s %d = ", num1, operator, num2);
            int userAnswer = input.nextInt();

            // Validasi jawaban
            if (userAnswer == correctAnswer) {
                System.out.println("Jawaban benar!\n");
            }
            else {
                System.out.printf("Jawaban salah. Jawaban yang benar adalah %d.\n\n", correctAnswer);
            }
        }

    }
}

    
    

