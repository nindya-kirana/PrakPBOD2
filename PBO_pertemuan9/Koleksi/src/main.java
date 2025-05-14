
public class main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>(10);

        koleksiKarakter.add('A');
        koleksiKarakter.add('B');
        koleksiKarakter.add('C');
        koleksiKarakter.add('D');
        koleksiKarakter.add('E');

        System.out.println("Setelah penambahan awal:");
        koleksiKarakter.showAll();
        System.out.println("Ukuran maksimum koleksi: " + koleksiKarakter.getSize());

        koleksiKarakter.setIsi(2, 'X');
        System.out.println("\nSetelah mengubah indeks 2:");
        koleksiKarakter.showAll();

        koleksiKarakter.delete(1);
        System.out.println("\nSetelah menghapus indeks 1:");
        koleksiKarakter.showAll();

        koleksiKarakter.add('F');
        koleksiKarakter.add('G');
        koleksiKarakter.add('H');
        koleksiKarakter.add('I');
        koleksiKarakter.add('J');
        koleksiKarakter.add('K'); 
        koleksiKarakter.add('L');        

        System.out.println("\nSetelah penambahan lebih banyak elemen:");
        koleksiKarakter.showAll();

        koleksiKarakter.setSize(15);
        System.out.println("\nSetelah memperbesar ukuran koleksi:");
        System.out.println("Ukuran maksimum koleksi: " + koleksiKarakter.getSize());

        koleksiKarakter.add('L');
        koleksiKarakter.add('M');
        System.out.println("\nSetelah penambahan elemen baru:");
        koleksiKarakter.showAll();
    }
}