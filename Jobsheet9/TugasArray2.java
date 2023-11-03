import java.util.Scanner;

public class TugasArray2 {
    public static void main(String[] args) {
        int[] nilai = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai: ");
            nilai [i] = sc.nextInt();
        }

        System.out.println("Array: " );

        for (int i = 9; i >= 0; i--) {
            System.out.print(nilai[i] + " ");
        }
    }
}