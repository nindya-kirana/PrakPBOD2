import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

abstract class Manusia {
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    Manusia() {
        this.nama = " ";
        this.tgl_mulai_kerja = null;
        this.alamat = " ";
        this.pendapatan = 0;
    }

    Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public abstract int hitungMasaKerja();

    public static String formatTanggal(LocalDate tanggal) {
        if (tanggal == null) return "Tanggal tidak tersedia";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }

    public void cetakInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Nama                    : " + getNama());
        System.out.println("Tanggal Mulai Kerja     : " + formatTanggal(getTgl_mulai_kerja()));
        System.out.println("Alamat                  : " + getAlamat());
        System.out.println("Pendapatan              : " + (long) getPendapatan());
        System.out.println("Masa kerja              : " + hitungMasaKerja() + " hari");
    }
}
