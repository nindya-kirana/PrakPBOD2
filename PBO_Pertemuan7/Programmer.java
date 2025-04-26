public class Programmer extends Pegawai {
    private static int bonus = 450000;

    Programmer(String nama){
        this.setNama(nama);
    }

    public static int getBonus() {
        return bonus;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + getBonus());
    }
}
