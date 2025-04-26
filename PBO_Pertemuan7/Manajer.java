public class Manajer extends Pegawai {
    private static int tunjangan = 700000;

    Manajer(String nama){
        this.setNama(nama);
    }

    public static int getTunjangan() {
        return tunjangan;
    }
    
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + getTunjangan());
    }
}
