import java.util.Scanner;

public class jadwalKuliah {

    static Scanner sc = new Scanner(System.in);

    public static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i+1));
            System.out.print("Nama MK : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang   : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari    : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam     : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=== Semua Jadwal ===");
        for (int i = 0; i < n; i++) {
            System.out.println(jadwal[i][0] + " | " +
                               jadwal[i][1] + " | " +
                               jadwal[i][2] + " | " +
                               jadwal[i][3]);
        }
    }

    public static void cariHari(String[][] jadwal, int n, String hari) {
        System.out.println("\nJadwal Hari " + hari);
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
            }
        }
    }

    public static void cariMK(String[][] jadwal, int n, String mk) {
        System.out.println("\nJadwal Mata Kuliah " + mk);
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(jadwal[i][1] + " | " +
                                   jadwal[i][2] + " | " +
                                   jadwal[i][3]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Jumlah jadwal: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        cariHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan nama MK: ");
        String mk = sc.nextLine();
        cariMK(jadwal, n, mk);

        sc.close();
    }
}
