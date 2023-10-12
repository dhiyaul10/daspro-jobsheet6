import java.util.Scanner;

public class ContohSetorTunai {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        int pilihMenu = 1, pin = 123;
        char konfirmasiNominal = 'y';
        
        if (pilihMenu == 1) {
            System.out.print("Masukkan Nominal Setor :");
            pilihMenu = input00.nextInt();
            System.out.print("Konfirmasi Nominal y/n :");
            konfirmasiNominal = input00.next().charAt(0);
            if (konfirmasiNominal == 'y') {
                System.out.print("Masukkan Pin :");
                pin = input00.nextInt();
                if (pin == 123)
                    System.out.println("Setor Tunai Berhasil :");
                else 
                    System.out.println("Setor Tidak Berhasil :");
            } else 
                System.out.println("Setor Tidak Berhasil :");

        } else 
            System.out.println("Setor Tidak Berhasil :");
        
        input00.close();
    }
}
    
    




