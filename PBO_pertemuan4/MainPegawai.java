import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args) {
        Tendik T1, T2;
        DosenTetap DTe1, DTe2;
        DosenTamu DTa1, DTa2;

        T1 = new Tendik("111111", "Ahmad Saputra",
                        LocalDate.of(1988, 5, 10),
                        LocalDate.of(2012, 4, 1),
                        4800000, "Administrasi");

        T2 = new Tendik("222222", "Maria Sari",
                        LocalDate.of(1992, 8, 25),
                        LocalDate.of(2016, 10, 1),
                        4600000, "Perpustakaan");

        // Data Pegawai Dosen Tetap
        DTe1 = new DosenTetap("333333", "Dr. Yulianto",
                              LocalDate.of(1975, 2, 15),
                              LocalDate.of(2000, 9, 10),
                              8000000, "Fakultas Teknik",
                              "98765432");

        DTe2 = new DosenTetap("444444", "Prof. Dwi Suryanto",
                              LocalDate.of(1970, 12, 5),
                              LocalDate.of(1995, 7, 5),
                              8500000, "Fakultas Ilmu Komputer",
                              "87654321");

        // Data Pegawai Dosen Tamu
        DTa1 = new DosenTamu("555555", "Dr. Ratna Wulandari",
                             LocalDate.of(1980, 3, 20),
                             LocalDate.of(2017, 6, 1),
                             5000000, "Fakultas Kedokteran",
                             "76543210",
                             LocalDate.of(2026, 5, 10));

        DTa2 = new DosenTamu("666666", "Ir. Budi Prasetyo",
                             LocalDate.of(1982, 9, 18),
                             LocalDate.of(2019, 2, 15),
                             4800000, "Fakultas Pertanian",
                             "65432109",
                             LocalDate.of(2026, 7, 1));

        System.out.println("\n=== Data Pegawai Tendik ===");
        T1.printInfo();
        T2.printInfo();

        System.out.println("\n=== Data Pegawai Dosen Tetap ===");
        DTe1.printInfo();
        DTe2.printInfo();

        System.out.println("\n=== Data Pegawai Dosen Tamu ===");
        DTa1.printInfo();
        DTa2.printInfo();
    }
}
