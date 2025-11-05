import java.util.Scanner;

public class SearchNilai19Modif1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. INPUT BANYAKNYA ELEMEN ARRAY
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();

        // Deklarasi array dengan ukuran sesuai input pengguna
        int[] arrNilai = new int[jumlahNilai];

        // 2. INPUT ISI ARRAY
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        // 3. INPUT NILAI YANG DICARI (KEY)
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        // Variabel untuk menyimpan indeks hasil pencarian
        // Inisialisasi -1 menunjukkan nilai belum ditemukan
        int hasilIndeks = -1; 
        
        // --- PROSES PENCARIAN (LINEAR SEARCH) ---
        // 4. Lakukan pencarian nilai
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasilIndeks = i; // Simpan indeks ditemukan
                break; // Hentikan loop karena sudah ketemu
            }
        }

        // 5. TAMPILKAN OUTPUT
        if (hasilIndeks != -1) {
            // Jika hasilIndeks BUKAN -1, berarti nilai ditemukan
            // Karena output meminta "nilai mahasiswa ke-N", kita pakai (hasilIndeks + 1)
            System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasilIndeks + 1));
        } else {
            // Jika hasilIndeks tetap -1, nilai tidak ditemukan
            System.out.println("\nNilai " + key + " tidak ditemukan dalam data.");
        }

        sc.close();
    }
}