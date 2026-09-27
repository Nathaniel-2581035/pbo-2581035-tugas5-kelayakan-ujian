import java.util.Scanner;

public class kelayakan_ujian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kehadiran (%): ");
        int kehadiran = input.nextInt();

        System.out.print("Nilai tugas: ");
        int nilaiTugas = input.nextInt();

        System.out.print("Dispensasi (true/false): ");
        boolean dispensasi = input.nextBoolean();

        boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;
        boolean b = (kehadiran >= 75 && nilaiTugas >= 60) || dispensasi;
        boolean c = kehadiran >= 75 && (nilaiTugas >= 60 || dispensasi);
        boolean notDispensasi = !dispensasi;
        // a == b selalu (&& diikat lebih kuat dari ||, jadi a otomatis = b)
        // c beda: kehadiran>=75 jadi wajib, dispensasi=true saja tak cukup jika kehadiran<75

        System.out.println();
        System.out.println("==== KELAYAKAN UJIAN ====");

        System.out.println("a (tanpa kurung): " + a);
        System.out.println("b (kurung precedence): " + b);
        System.out.println("c (kurung digeser): " + c);
        System.out.println("!dispensasi: " + notDispensasi);

        int cek = 0;
        boolean x = (kehadiran >= 75) && (cek++ >=0);
        boolean y = (nilaiTugas >= 60) || (cek++ >=0);
        System.out.println("cek dipanggil: " + cek);
        // cek=0: kehadiran>=75 sudah false (&& langsung false, kanan di-skip)
        // nilaiTugas>=60 sudah true (|| langsung true, kanan di-skip juga)
    }
}
