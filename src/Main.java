import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();

        System.out.print("Input ID Karyawan: ");
        karyawan.setIdKaryawan(input.next());

        System.out.print("Input Nama Karyawan: ");
        karyawan.setNama(input.next());

        System.out.print("Input Gaji: ");
        karyawan.setGaji(input.nextInt());

        System.out.println("\n<<DATA DITAMPILKAN>>");
        System.out.println("Berkas Karyawan");
        System.out.println("ID Karyawan:" + karyawan.getIdKaryawan());
        System.out.println("Nama Karyawan:" + karyawan.getNama());
        System.out.println("Gaji Karyawan:" + karyawan.getGaji());
        System.out.printf("Tunjangan : %.2f\n", + karyawan.Tunjangan());
        System.out.printf("Total Gaji : %.2f\n", + karyawan.TotalGaji());

        }
    }
