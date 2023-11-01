import java.util.Scanner;

public class ArrayNilai15 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

    int [] nilaiAkhir = new int [10];
    int max = 0, min = 100, lulus = 0, tidaklulus = 0;
    
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.println("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
        nilaiAkhir[i] = sc.nextInt();
        
        if (max < nilaiAkhir[i]) {
            max = nilaiAkhir [i];
        } 
        
        if (min > nilaiAkhir[i]) {
            min = nilaiAkhir [i];
        }
    }
    for (int i = 0; i < 10; i++) {
        if (nilaiAkhir[i] > 70) {
          System.out.println("mahasiswa ke-" + (i+1) + " lulus "); 
            lulus++;
        } 
        
        if (nilaiAkhir[i] <= 70) {
            System.out.println("mahasiswa ke-" + (i+1) + " tidak lulus");
            tidaklulus++;
        }
    }

    System.out.println("======================================================");
    int rataRata = 0;
    for (int num : nilaiAkhir) {
        rataRata += num;
    }

    double average = rataRata / nilaiAkhir.length;
    System.out.println("Rata-rata: " + average);
    System.out.println("Nilai terbesar : " + max);
    System.out.println("Nilai Terkecil : " + min);
    System.out.println("Jumlah mahasiswa lulus: " + lulus);
    System.out.println("Jumlah mahasiswa tidak lulus: " + tidaklulus);

}    
}
