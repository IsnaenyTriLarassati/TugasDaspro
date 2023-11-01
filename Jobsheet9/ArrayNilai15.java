import java.util.Scanner;

public class ArrayNilai15 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

    int [] nilaiAkhir = new int [10];
    
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.println("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
        nilaiAkhir[i] = sc.nextInt();
    }

    for (int i = 0; i < 10; i++) {
        if (nilaiAkhir[i] > 70) {
          System.out.println("mahasiswa ke-" + (i+1) + " lulus ");  
        } else {
            System.out.println("mahasiswa ke-" + i + " tidak lulus");
        }
    }
}
    
}
