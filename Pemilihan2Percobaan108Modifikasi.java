import java.util.Scanner;
public class Pemilihan2Percobaan108Modifikasi {
    public static void main(String[] args) {

        Scanner input08 = new Scanner(System.in);

        System.out.println("Masukkan Tahun: ");
        int tahun = input08.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) 
                System.out.println("Tahun Kabisat");
                else
                System.out.println("Bukan Tahun Kabisat");
            }else
                System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");
    }
}