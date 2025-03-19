import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String NIDN;
    private static int BUP = 65;
    private static double persenTunjangan = 0.02;

    public DosenTetap(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas, String NIDN){
        super(NIP, nama, tglLahir, TMT, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN(){
        return NIDN;
    }
    public int getBUP(){
        return BUP;
    }

    public void setNIDN(String NIDN){
        this.NIDN = NIDN;
    }

    public static double getPersenTunjangan(){
        return persenTunjangan;
    }
    public double getTunjangan(){
        return getPersenTunjangan() * getGajiPokok() * getLamaKerja().getYears();
    }
    public LocalDate getTglPensiun(){
        return getTglLahir().plusYears(getBUP()).plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo(){
        System.out.println("NIP           : " + getNIP());
        System.out.println("NIDN          : " + getNIDN());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + FormatTanggal(getTglLahir()));
        System.out.println("TMT           : " + FormatTanggal(getTMT()));
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + getFakultas());
        System.out.println("Masa Kerja    : " + getLamaKerja().getYears() + " tahun " + getLamaKerja().getMonths() + " bulan");
        System.out.println("BUP           : " + getTglPensiun());
        System.out.println("Gaji Pokok    : Rp" + getGajiPokok());
        System.out.println("Tunjangan     : " + getPersenTunjangan()*100 + "% x Rp" + getGajiPokok() + " = Rp" + getTunjangan() + "\n");
    }
}
