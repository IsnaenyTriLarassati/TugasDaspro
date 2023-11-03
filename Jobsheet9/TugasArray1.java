import java.util.Arrays;
import java.util.Scanner;

public class TugasArray1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] arrayPertama = {1, 2, 3, 4, 5};
        int[] arrayKedua = new int[arrayPertama.length];

        for (int i = 0; i < arrayPertama.length; i++) {
            arrayKedua[i] = arrayPertama[i];
        }

        System.out.println("Array pertama: " + Arrays.toString(arrayPertama));
        System.out.println("Array kedua: " + Arrays.toString(arrayKedua));
    
  }
}