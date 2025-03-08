public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*  baris 6 pada AngkaSial.java tidak tereksekusi saat eksepsi 
    karena program akan mengeksekusi throw new AngkaSialException() karena kondisi if (angka == 13) terpenuhi

    baris 15 pada AngkaSial.java dieksekusi 
    karena ketika terdapat masukan angka 13 (eksepsi AngkaSialException) 
    maka program akan langsung masuk ke blok catch pada main()
    
*/
 
