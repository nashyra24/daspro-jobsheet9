import java.util.Scanner;

public class SearchNilai19Modif2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- INPUT DATA ---
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        int[] arrNilai = new int[jumlahNilai];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        // Variabel hasilInsdex diinisialisasi dengan -1
        // -1 menunjukkan bahwa nilai BELUM DITEMUKAN
        int hasilIndeks = -1; 
        
        // --- PROSES PENCARIAN (LINEAR SEARCH) ---
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasilIndeks = i; // Ganti dengan indeks yang ditemukan
                break; 
            }
        }

        // --- OUTPUT HASIL DENGAN IF-ELSE ---
        System.out.println();
        if (hasilIndeks != -1) {
            // Jika hasilIndeks BUKAN -1, berarti ditemukan
            // Output sesuai contoh sebelumnya (cetak posisi mahasiswa ke-N)
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasilIndeks + 1));
        } else {
            // Jika hasilIndeks TETAP -1, berarti tidak ditemukan
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        
        sc.close();
    }
}