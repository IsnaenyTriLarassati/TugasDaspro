import java.util.Scanner;

public class LinearSearch15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key, jumlahElemen;
        int hasil = -1;

        System.out.println("Masukkan jumlah elemen array: ");
        jumlahElemen = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Masukkan elemen array ke-" + i + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.println("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

            for (int i = 0; i < arrayInt.length; i++) {
                if (arrayInt[i] == key) {
                    hasil = i;
                    System.out.println("Key ada dalam array pada indeks ke- " + i);
                    i++;
                }
            }
            if (hasil == -1) {
                System.out.println("Key tidak ditemukan");
            }
     }
           
}