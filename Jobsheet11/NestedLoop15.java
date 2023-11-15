import java.util.Scanner;

public class NestedLoop15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah kota: ");
        int jumlahKota = sc.nextInt();

        double[][] suhu = new double[jumlahKota][4];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i + 1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(" Suhu ke-" + (j + 1) + ": ");
                suhu [i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < suhu.length; i++) {
            System.out.print("KOTA KE-" + (i + 1) + ": ");
            double sum = 0.0;

            for (double temp : suhu[i]) {
                System.out.print(temp + " ");
                sum += temp;
            }

            sum /= suhu[i].length;
            System.out.println("\nRata-rata: " + sum);
        }
    }  
}


