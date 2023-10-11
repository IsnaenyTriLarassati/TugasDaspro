import java.util.Scanner;

public class KabisatNested15 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan Tahun : ");
        tahun = sc.nextInt();

        if ((tahun % 400) == 0) {
            System.out.println("Tahun kabisat");
        } else if ((tahun % 100 )== 0){
            System.out.println("Bukan tahun kabinet");
        } else if ((tahun % 4) == 0){
            System.out.println("Tahun kabiset");
        } else
            System.out.println("Bukan tahun kabinet");

}
}