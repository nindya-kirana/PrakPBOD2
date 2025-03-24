import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak{
    private String nip;
    private static int counterPNS = 0;

    PNS(){
        super();
        nip = " ";
    }
    PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip() {
        return nip;
    }
    public static int getCounterPNS() {
        return counterPNS;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.1;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP                     : " + getNip());
        System.out.println("Pajak                   : " + hitungPajak());
    }
    @Override
    public int hitungMasaKerja() {
        if (getTgl_mulai_kerja() == null) {
            return 0;
        }
        return (int) ChronoUnit.DAYS.between(getTgl_mulai_kerja(), LocalDate.now()) + 7; 
    }
}