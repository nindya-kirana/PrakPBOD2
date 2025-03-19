import java.time.LocalDate;

public class Tendik extends Pegawai{
    private String bidangKerja;
    private static int BUP = 55;
    private static double persenTunjangan = 0.01;

    public Tendik(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String bidangKerja){
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidangKerja = bidangKerja;
    }

    public String getBidangKerja(){
        return bidangKerja;
    }
    public static int getBUP(){
        return BUP;
    }
    public static double getPersenTunjangan(){
        return persenTunjangan;
    }

    public void setBidangKerja(String bidangKerja){
        this.bidangKerja = bidangKerja;
    }

    public double getTunjangan(){
        return getPersenTunjangan() * getGajiPokok() * getLamaKerja().getYears();
    }
    public LocalDate getTglPensiun(){
        return getTglLahir().plusYears(getBUP()).plusMonths(1).withDayOfMonth(1);
    }

    public void printInfo(){
        System.out.println("NIP           : " + getNIP());
        System.out.println("Nama          : " + getNama());
        System.out.println("Tanggal Lahir : " + FormatTanggal(getTglLahir()));
        System.out.println("TMT           : " + FormatTanggal(getTMT()));
        System.out.println("Bidang Kerja  : " + getBidangKerja());
        System.out.println("Masa Kerja    : " + getLamaKerja().getYears() + " tahun " + getLamaKerja().getMonths() + " bulan");
        System.out.println("BUP           : " + getTglPensiun());
        System.out.println("Gaji Pokok    : Rp" + getGajiPokok());
        System.out.println("Tunjangan     : " + getPersenTunjangan()*100 + "% x Rp" + getGajiPokok() + " = Rp" + getTunjangan() + "\n");
    }
}
