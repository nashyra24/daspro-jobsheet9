import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat; // Import untuk pemformatan angka desimal

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Objek untuk memformat output double menjadi 2 angka di belakang koma
        DecimalFormat df = new DecimalFormat("#.##"); 

        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        double[] rataMahasiswa = new double[jumlahMahasiswa];
        // ArrayList of ArrayLists untuk menyimpan nilai setiap mahasiswa
        ArrayList<ArrayList<Integer>> semuaNilai = new ArrayList<>(); 

        double totalSemuaNilai = 0;
        int totalBanyakNilai = 0;
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;

        // --- Bagian Input dan Perhitungan Rata-rata per Mahasiswa ---
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\n--- Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("Masukkan banyaknya nilai untuk mahasiswa ke-" + (i + 1) + ": ");
            int banyakNilai = input.nextInt();

            ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();
            int totalNilai = 0;

            for (int j = 0; j < banyakNilai; j++) {
                System.out.print("Masukkan nilai ke-" + (j + 1) + ": ");
                int nilai = input.nextInt();
                nilaiMahasiswa.add(nilai);
                totalNilai += nilai;

                // Memperbarui nilai tertinggi dan terendah secara keseluruhan
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                }
                if (nilai < nilaiTerendah) {
                    nilaiTerendah = nilai;
                }
            }

            semuaNilai.add(nilaiMahasiswa);

            // Hitung rata-rata per mahasiswa
            double rata = (double) totalNilai / banyakNilai;
            rataMahasiswa[i] = rata;

            totalSemuaNilai += totalNilai;
            totalBanyakNilai += banyakNilai;

            // Menggunakan DecimalFormat untuk output yang rapi
            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + " = " + df.format(rata));
        }

        // Hitung rata-rata keseluruhan
        double rataKeseluruhan = (totalBanyakNilai > 0) ? totalSemuaNilai / totalBanyakNilai : 0;

        // --- Bagian Output Hasil Akhir ---
        System.out.println("\n===== HASIL AKHIR PERHITUNGAN =====");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " memiliki rata-rata: " + df.format(rataMahasiswa[i]));
        }

        System.out.println("\n===== SEMUA NILAI YANG TELAH DIMASUKKAN =====");
        for (int i = 0; i < semuaNilai.size(); i++) {
            System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
            for (int nilai : semuaNilai.get(i)) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }

        System.out.println("\nNilai tertinggi dari semua input: " + nilaiTertinggi);
        System.out.println("Nilai terendah dari semua input: " + nilaiTerendah);
        System.out.println("Rata-rata keseluruhan: " + df.format(rataKeseluruhan));

        input.close();
    }
}