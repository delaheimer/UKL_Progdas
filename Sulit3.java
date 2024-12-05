package UKL;

public class Sulit3 {
    public static void main(String[] args) {

        // deklarasi array
        int [] array = {1, 2, 2, 3, 3, 3, 1, 2, 4};
        hitungFrekuensi(array);
    } 

    // menghitung frekuensi elemen dalam array
    public static void hitungFrekuensi(int[] array) {

        // looping 1 (memilih elemen array)
        for (int g = 0; g < array.length; g++) {
            
            // menghitung frekuensi elemen array [g]
            int frekuensi = 1;  


            // looping 2 (Membandingkan elemen setelah g yaitu h)
            for (int h = g + 1; h < array.length; h++) {

                // ditemukannya elemen yang sama
                if (array[g] == array[h]) {
                    frekuensi++;  // untuk menambah frekuensi kemunculan
                    array[h] = -1;  // untuk menandai elemen yang sudah dihitung
                }

            // mencetak elemen yang belum ditandai (-1)
            } if (array [g] != -1) {
                System.out.println(array [g] + " muncul " + frekuensi + " kali");
            }
        }
    }

}

    
    

