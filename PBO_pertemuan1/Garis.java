class Garis{
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    Garis(){
        this.titikAwal = new Titik();
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    Garis(Titik awal, Titik akhir){
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    Titik getTitikAwal(){
        return this.titikAwal;
    }

    Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    void setTitikAwal(Titik awal){
        this.titikAwal = awal;
    }

    void setTitikAkhir(Titik akhir){
        this.titikAkhir = akhir;
    }

    static int getCounterGaris(){
        return counterGaris;
    }

    double getPanjang(){
        return Math.sqrt(((titikAkhir.getAbsis()-titikAwal.getAbsis())*(titikAkhir.getAbsis()-titikAwal.getAbsis()))+
        ((titikAkhir.getOrdinat()-titikAwal.getOrdinat())*(titikAkhir.getOrdinat()-titikAwal.getOrdinat())));
    }

    double getGradien(){
        return ((titikAkhir.getOrdinat()-titikAwal.getOrdinat())/(titikAkhir.getAbsis()-titikAwal.getAbsis()));
    }

    Titik getTitikTengah(){
        return new Titik((titikAkhir.getAbsis()+titikAwal.getAbsis())/2,(titikAkhir.getOrdinat()+titikAwal.getOrdinat())/2);
    }

    void printTitikTengah(){
        Titik tgh = this.getTitikTengah();
        System.out.println("Titik tengah: ");
        tgh.printTitik();
    }

    boolean isSejajar(Garis G2){
        return this.getGradien() == G2.getGradien();
    }

    boolean isTegakLurus(Garis G2){
        return (this.getGradien() * G2.getGradien()) == (-1);
    }

    void printGaris(){
        System.out.println("Titik awal : (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + ")");
        System.out.println("Titik akhir : (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + ")");
    }

    void printPersGaris(){
        double m = this.getGradien();
        double c = ((titikAkhir.getOrdinat()+titikAwal.getOrdinat()) - ((m*titikAkhir.getAbsis())+ (m*titikAwal.getAbsis())))/2;
        if(c<0){
            System.out.println("Persamaan garis : y = " + m + "x" + c);
        }
        else if(c>0){
            System.out.println("Persamaan garis : y = " + m + "x" + " + " + c);           
        }
        else if(c==0){
            System.out.println("Persamaan garis : y = " + m + "x");
        }
    }
}