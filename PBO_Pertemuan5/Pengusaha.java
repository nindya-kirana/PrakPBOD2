import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    Pengusaha(){
        super();
        npwp = " ";
    }
    Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp() {
        return npwp;
    }
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    @Override
    public double hitungPajak() {
        return getPendapatan() * 0.15;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP                    : " + getNpwp());
        System.out.println("Pajak                   : " + hitungPajak());
    }
    @Override
    public int hitungMasaKerja() {
        if (getTgl_mulai_kerja() == null) {
            return 0;
        }
        return (int) ChronoUnit.DAYS.between(getTgl_mulai_kerja(), LocalDate.now()) + 6; 
    }
}
