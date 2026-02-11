import java.util.Scanner;

public class PlatNomor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] KODE = {"B", "D", "L", "N", "S", "W", "A", "F", "E", "Z"};
        String[] KOTA = {
            "Jakarta", "Bandung", "Surabaya", "Malang",
            "Solo", "Sidoarjo", "Banten", "Bogor",
            "Cirebon", "Garut"
        };

        System.out.print("Masukkan kode plat: ");
        String kodeInput = sc.nextLine().toUpperCase();

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (kodeInput.equals(KODE[i])) {
                System.out.println("Kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode tidak ditemukan");
        }

        sc.close();
    }
}
