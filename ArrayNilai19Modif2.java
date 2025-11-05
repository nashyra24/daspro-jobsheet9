import java.util.Scanner;

public class ArrayNilai19Modif2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        // Input nilai akhir
        // Perubahan
         for (int i = 0; i < nilaiAkhir.length; i++) { // Baris yang diubah
        System.out.print("Masukkan nilai akhir ke-" + i + " : ");
        nilaiAkhir[i] = sc.nextInt();
        }

        // Output hasil input
       for (int i = 0; i < nilaiAkhir.length; i++) { // Mengganti '10' dengan '.length' (seperti input)
        if (nilaiAkhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + i + " lulus!");
    }
}
        sc.close();
    }
}
