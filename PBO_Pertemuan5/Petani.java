import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani = 0;

    Petani(){
        super();
        asal_kota = " ";
    }
    Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsal_kota() {
        return asal_kota;
    }
    public static int getCounterPetani() {
        return counterPetani;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal kota               : " + getAsal_kota());
        System.out.println("Pajak                   : " + hitungPajak());
    }
    @Override
    public int hitungMasaKerja() {
        if (getTgl_mulai_kerja() == null) {
            return 0;
        }
        return (int) ChronoUnit.DAYS.between(getTgl_mulai_kerja(), LocalDate.now()) + 0; 
    }
}
