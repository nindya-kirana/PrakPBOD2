import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tglLahir;
    private LocalDate TMT;
    private double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP(){
        return NIP;
    }
    public String getNama(){
        return nama;
    }
    public LocalDate getTglLahir(){
        return tglLahir;
    }
    public LocalDate getTMT(){
        return TMT;
    }
    public double getGajiPokok(){
        return gajiPokok;
    }
    public Period getLamaKerja(){
        return Period.between(TMT, LocalDate.of(2025,3,19));
    }

    public void setNip(String NIP){
        this.NIP = NIP;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setTglLahir(LocalDate tglLahir){
        this.tglLahir = tglLahir;
    }
    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    } 

    public static String FormatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }
    
}
