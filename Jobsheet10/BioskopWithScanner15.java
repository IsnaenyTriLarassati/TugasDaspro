import java.util.Scanner;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
       
        int baris, kolom;
        String nama, next;

        Scanner sc = new Scanner (System.in);
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihanMenu = sc.nextInt();

            switch (pilihanMenu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.next();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan");
                    } else {
                        System.out.println("Kursi sudah terisi oleh penonton lain. Silahkan pilih kursi lain");
                    }
                    break;
                case 2:
                    System.out.println("Daftar penonton: ");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton.length; j++) {
                             if (penonton[i][j] != null) {
                                 System.out.println("Baris " + (i + 1) + " | " + "Kolom " + (j + 1) + ": " + penonton[i][j]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
            }

            System.out.print("Lanjutkan? (y/n): ");
            next = sc.next();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
