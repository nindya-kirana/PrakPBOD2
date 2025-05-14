public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(5);
        BangunDatarGeneric<Lingkaran> bdgl = new BangunDatarGeneric<Lingkaran>();
        bdgl.set(l);
        System.out.println("Keliling lingkaran : " + bdgl.hitungKeliling());
        System.out.println("Luas lingkaran     : " + l.hitungLuas());
        System.out.println("Tipe generic       : " + bdgl.get().getClass().getName());
        System.out.println("==========================================");

        Persegi p = new Persegi(3);
        BangunDatarGeneric<Persegi> bdgp = new BangunDatarGeneric<Persegi>();
        bdgp.set(p);
        System.out.println("Keliling persegi   : " + bdgp.hitungKeliling());
        System.out.println("Luas persegi       : " + p.hitungLuas());
        System.out.println("Tipe generic       : " + bdgp.get().getClass().getName());
        System.out.println("==========================================");
        
        PersegiPanjang pp = new PersegiPanjang(3,7);
        BangunDatarGeneric<PersegiPanjang> bdgpp = new BangunDatarGeneric<PersegiPanjang>();
        bdgpp.set(pp);
        System.out.println("Keliling persegi panjang  : " + bdgpp.hitungKeliling());
        System.out.println("Luas persegi panjang      : " + pp.hitungLuas());
        System.out.println("Tipe generic              : " + bdgpp.get().getClass().getName());
        System.out.println("==========================================");        
        
        Segitiga s = new Segitiga(3, 4, 5);
        BangunDatarGeneric<Segitiga> bdgs = new BangunDatarGeneric<Segitiga>();
        bdgs.set(s);
        System.out.println("Keliling segitiga  : " + bdgs.hitungKeliling());
        System.out.println("Luas segitiga      : " + s.hitungLuas());
        System.out.println("Tipe generic       : " + bdgs.get().getClass().getName());
        System.out.println("==========================================");                
    }
}
