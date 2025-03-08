class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/*asersi diletakkan setelah deklarasi jari2 pada main() yaitu jariJari = 0
asersi sebaiknya diletakkan pada konstruktor Lingkaran()
sehingga program dapat memastikan bahwa jari-jari lingkaran lebih dari 0
meskipun objek dibuat di tempat lain
*/ 
