import java.time.LocalDate;
public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate kontrak;
    private static double persenTunjangan = 0.025;

    public DosenTamu(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDK, LocalDate kontrak){
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrak = kontrak;
    }

    public String getNIDK(){
        return NIDK;
    }
    public LocalDate getKontrak(){
        return kontrak;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public static double getPersenTunjangan(){
        return persenTunjangan;
    }

    public void setKontrak(LocalDate kontrak){
        this.kontrak = kontrak;
    }
    public double getTunjangan(){
        return getPersenTunjangan() * getGajiPokok();
    }
    public void printInfo(){
        System.out.println("NIP           : " + getNIP());
        System.out.println("NIDK          : " + getNIDK());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + FormatTanggal(getTglLahir()));
        System.out.println("TMT           : " + FormatTanggal(getTMT()));
        System.out.println("Jabatan      : Dosen Tetap");
        System.out.println("Fakultas      : " + getFakultas());
        System.out.println("Masa Kerja    : " + getLamaKerja().getYears() + " tahun " + getLamaKerja().getMonths() + " bulan");
        System.out.println("Kontrak       : " + FormatTanggal(getKontrak()));
        System.out.println("Gaji Pokok    : Rp" + getGajiPokok());
        System.out.println("Tunjangan     : " + getPersenTunjangan()*100 + "% x Rp" + getGajiPokok() + " = Rp" + getTunjangan() + "\n");
    }
}
