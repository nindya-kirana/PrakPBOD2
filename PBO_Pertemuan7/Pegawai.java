public class Pegawai {
    private String nama;
    private static int gajiPokok = 5000000;

    public String getNama() {
        return nama;
    }
    public static int getGajiPokok() {
        return gajiPokok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + getNama() + ", Gaji Pokok : " + getGajiPokok());
    }
}