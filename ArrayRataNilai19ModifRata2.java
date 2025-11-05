import java.util.Scanner;

public class ArrayRataNilai19ModifRata2 {
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        // --- 1. MEMINTA JUMLAH ELEMEN DARI PENGGUNA ---
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        // Deklarasi array dengan ukuran sesuai input pengguna
        int[] nilaiMhs = new int[jmlMhs];
        
        // Deklarasi variabel untuk perhitungan rata-rata LULUS dan TIDAK LULUS
        double totalLulus = 0; 
        double totalTidakLulus = 0;
        int countLulus = 0;
        int countTidakLulus = 0;

        // --- 2. INPUT NILAI DAN MEMISAHKAN TOTAL ---
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            
            // Logika pemisahan nilai: Jika > 70 (LULUS), jika <= 70 (TIDAK LULUS)
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                countTidakLulus++;
            }
        }

        // --- 3. MENGHITUNG DAN MENAMPILKAN RATA-RATA ---
        double rata2Lulus = 0;
        double rata2TidakLulus = 0;
        
        // Cek agar tidak terjadi Error Division by Zero
        if (countLulus > 0) {
            rata2Lulus = totalLulus / countLulus;
        }
        
        if (countTidakLulus > 0) {
            rata2TidakLulus = totalTidakLulus / countTidakLulus;
        }

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);

        sc.close();
    } 
}