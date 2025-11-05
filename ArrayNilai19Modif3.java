import java.util.Scanner;

public class ArrayNilai19Modif3 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        // Input nilai akhir
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Output hasil status kelulusan 
        System.out.println("\n--- STATUS KELULUSAN MAHASISWA ---");
        for (int i = 0; i < nilaiAkhir.length; i++) { 
            // Cek apakah nilai > 70
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " (" + nilaiAkhir[i] + "): **LULUS!**");
            } else {
                // Jika kondisi IF salah (nilai <= 70), jalankan yang ini
                System.out.println("Mahasiswa ke-" + i + " (" + nilaiAkhir[i] + "): Tidak Lulus");
            }
        }

        sc.close();
    }
}