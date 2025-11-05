import java.util.Scanner;

public class ArrayRataNilai19Modif1 { 
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0; 
        double rata2;
        
        // 1. Deklarasi variabel counter untuk menampung jumlah mahasiswa yang lulus
        int lulusCount = 0; 

        // Input nilai mahasiswa
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        // Loop untuk menghitung total dan menentukan kelulusan
        for (int i = 0; i < nilaiMhs.length; i++) {
            // Menghitung total (tetap dilakukan)
            total += nilaiMhs[i];
            
            // 2. Cek dan hitung mahasiswa yang lulus (nilai > 70)
            if (nilaiMhs[i] > 70) {
                lulusCount++; // Tambah counter jika nilai memenuhi syarat
            }
        }

        // Menghitung dan menampilkan rata-rata (tetap dilakukan)
        rata2 = total / nilaiMhs.length; 
        System.out.println("Rata-rata nilai = " + rata2);

        // 3. Menampilkan jumlah mahasiswa yang lulus
        System.out.println("Jumlah mahasiswa yang LULUS (Nilai > 70) adalah: " + lulusCount + " orang.");

        sc.close();
    } 
}