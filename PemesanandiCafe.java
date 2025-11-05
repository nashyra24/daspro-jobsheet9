import java.util.Scanner;

public class PemesanandiCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // === Daftar Menu (dipisahkan) ===
        String[] makanan = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng"};
        double[] hargaMakanan = {20000, 18000, 15000, 12000};

        String[] minuman = {"Teh Tarik", "Cappuccino", "Chocolate Ice", "Jus Alpukat"};
        double[] hargaMinuman = {10000, 25000, 22000, 18000};

        System.out.println("=== SELAMAT DATANG DI KAFE JAVA ===");
        System.out.println("\nDaftar Makanan:");
        for (int i = 0; i < makanan.length; i++) {
            System.out.printf("%d. %-20s Rp %.0f%n", (i + 1), makanan[i], hargaMakanan[i]);
        }

        System.out.println("\nDaftar Minuman:");
        for (int i = 0; i < minuman.length; i++) {
            System.out.printf("%d. %-20s Rp %.0f%n", (i + 1), minuman[i], hargaMinuman[i]);
        }

        // === Pencarian Menu (Linear Search di dua kategori) ===
        System.out.println("\n=== PENCARIAN MENU ===");
        System.out.print("Masukkan nama makanan/minuman yang ingin dicari: ");
        String cari = input.nextLine();

        boolean ditemukan = false;
        String kategori = "";
        double hargaDitemukan = 0;

        // Cari di makanan
        for (int i = 0; i < makanan.length; i++) {
            if (makanan[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                kategori = "Makanan";
                hargaDitemukan = hargaMakanan[i];
                break;
            }
        }

        // Jika belum ditemukan, cari di minuman
        if (!ditemukan) {
            for (int i = 0; i < minuman.length; i++) {
                if (minuman[i].equalsIgnoreCase(cari)) {
                    ditemukan = true;
                    kategori = "Minuman";
                    hargaDitemukan = hargaMinuman[i];
                    break;
                }
            }
        }

        if (ditemukan) {
            System.out.printf("✅ %s ditemukan di kategori %s (Rp %.0f)%n", cari, kategori, hargaDitemukan);
        } else {
            System.out.println("❌ Maaf, menu yang Anda cari tidak tersedia di kafe.");
        }

        // === Pemesanan ===
        System.out.println("\n=== PEMESANAN ===");
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine(); // bersihkan buffer

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = input.nextLine();

            boolean ada = false;

            // Cek di daftar makanan
            for (int j = 0; j < makanan.length; j++) {
                if (makanan[j].equalsIgnoreCase(namaPesanan[i])) {
                    hargaPesanan[i] = hargaMakanan[j];
                    ada = true;
                    System.out.println("(Kategori: Makanan)");
                    break;
                }
            }

            // Cek di daftar minuman jika belum ditemukan
            if (!ada) {
                for (int j = 0; j < minuman.length; j++) {
                    if (minuman[j].equalsIgnoreCase(namaPesanan[i])) {
                        hargaPesanan[i] = hargaMinuman[j];
                        ada = true;
                        System.out.println("(Kategori: Minuman)");
                        break;
                    }
                }
            }

            if (!ada) {
                System.out.println("⚠ Menu tidak ditemukan! Harga diisi Rp 0.");
                hargaPesanan[i] = 0;
            }
        }

        // === Hitung total ===
        double totalBiaya = 0;
        for (double h : hargaPesanan) {
            totalBiaya += h;
        }

        // === Tampilkan hasil ===
        System.out.println("\n=== DAFTAR PESANAN ANDA ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%d. %-20s Rp %.0f%n", (i + 1), namaPesanan[i], hargaPesanan[i]);
        }

        System.out.printf("\nTOTAL BIAYA: Rp %.0f%n", totalBiaya);
        System.out.println("=== TERIMA KASIH TELAH MEMESAN DI KAFE JAVA ===");

        input.close();
    }
}