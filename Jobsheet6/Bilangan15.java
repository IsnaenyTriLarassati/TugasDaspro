import java.util.Scanner;
public class Bilangan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bil1, bil2, bil3, bilanganTerbesar;

        System.out.println("Masukkan Bilangan Pertama");
        bil1 = sc.nextInt();
        System.out.println("Masukkan Bilangan Kedua");
        bil2 = sc.nextInt();
        System.out.println("Masukkan Bilangan Ketiga");
        bil3 = sc.nextInt();
        

        if (bil1>bil2) {
            if (bil1>bil3) {
                System.out.println("Bilangan Terbesar = bilangan 1");
            } else {
                System.out.println("Bilangan Terbesar = bilangan 3");
            }           
        } else {
            if(bil2>bil3) {
                System.out.println("Bialngan Terbesar = bilangan 2");
            } else {
                System.out.println("Bilangan Terbesar = bilangan 3");
            }
        }
        
        bilanganTerbesar = bil1>bil2 ? (bil1 > bil2 ? bil1 : bil3) : (bil2 > bil3 ? bil2 : bil3);
    }
}