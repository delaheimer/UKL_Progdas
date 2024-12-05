package UKL;

public class Sulit2 {
        
            public static void main(String[] args) {
                // Contoh array input
                int[] array = {1, 2, 3, 4, 5, 1, 2};
        
                // Panggil method untuk mengecek dan mencetak elemen duplikat
                cekDuplikat(array);
            }
        
            // Method untuk mengecek dan mencetak elemen duplikat
            public static void cekDuplikat(int[] array) {
                boolean adaDuplikat = false; // Penanda jika ditemukan duplikat
                System.out.print("Array memiliki elemen duplikat: ");
        
                // Loop untuk mencari elemen duplikat
                for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            
                            System.out.print(array[i] + " ");
                            adaDuplikat = true;
                            break; 
                    }
                }
        
                // Jika tidak ada duplikat
                if (!adaDuplikat) {
                    System.out.println("Tidak ada.");
                } else {
                    System.out.println(); // Pindah baris
                }
            }
        }
}
        


    
           