import java.util.Scanner;

public class Kabisat15 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan Tahun :");
        tahun = sc.nextInt();

        if (( tahun % 4) == 0 && (tahun % 100) != 0 || ( tahun % 4) == 0 ){
            System.out.println("Tahun abisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}