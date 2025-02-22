public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(2, 3);
        Titik t2 = new Titik(4, 7);
        Titik t3 = new Titik(2, 8);
        Titik t4 = new Titik(4, 4);
        Titik t5 = new Titik(1,6);
        Titik t6 = new Titik(15,-1);
        Titik t7 = new Titik(-2,0);
        Titik t8 = new Titik(-8,-12);       

        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);
        Garis g3 = new Garis(t5, t6);
        Garis g4 = new Garis(); 
        Garis g5 = new Garis(t7,t8);       

        System.out.println("=== Garis 1 ===");
        g1.printGaris();
        System.out.println("Panjang garis: " + g1.getPanjang());
        System.out.println("Gradien garis: " + g1.getGradien());
        System.out.println("Titik tengah: ");
        g1.getTitikTengah().printTitik();
        g1.printPersGaris();

        System.out.println("\n--- Menggunakan setTitikAwal dan setTitikAkhir ---");
        g1.setTitikAwal(new Titik(1, 1));
        g1.setTitikAkhir(new Titik(5, 5));
        System.out.println("Setelah diubah, garis g1 menjadi:");
        g1.printGaris();
        g1.printPersGaris();
        System.out.println("Gradien g1 setelah diubah: " + g1.getGradien());

        System.out.println("\n=== Garis 2 ===");
        g2.printGaris();
        System.out.println("Panjang garis: " + g2.getPanjang());
        System.out.println("Gradien garis: " + g2.getGradien());
        g2.printTitikTengah();
        g2.printPersGaris();

        System.out.println("\n=== Garis 3 ===");
        g3.printGaris();
        System.out.println("Panjang garis: " + g3.getPanjang());
        System.out.println("Gradien garis: " + g3.getGradien());
        g3.printTitikTengah();
        g3.printPersGaris();

        System.out.println("\n=== Garis 4 ===");
        g4.printGaris();
        System.out.println("Panjang garis: " + g4.getPanjang());
        System.out.println("Gradien garis: " + g4.getGradien());
        g4.printTitikTengah();
        g4.printPersGaris();

        System.out.println("\n=== Garis 5 ===");
        g5.printGaris();
        System.out.println("Panjang garis: " + g5.getPanjang());
        System.out.println("Gradien garis: " + g5.getGradien());
        g5.printTitikTengah();
        g5.printPersGaris();



        System.out.println("\n=== Garis Sejajar ===");
        System.out.println("Apakah Garis 1 sejajar dengan Garis 2? " + g1.isSejajar(g2));
        System.out.println("Apakah Garis 1 sejajar dengan Garis 3? " + g1.isSejajar(g3));
        System.out.println("Apakah Garis 1 sejajar dengan Garis 4? " + g1.isSejajar(g4));
        System.out.println("Apakah Garis 1 sejajar dengan Garis 5? " + g1.isSejajar(g5));
        System.out.println("Apakah Garis 2 sejajar dengan Garis 3? " + g2.isSejajar(g3));
        System.out.println("Apakah Garis 2 sejajar dengan Garis 4? " + g2.isSejajar(g4));
        System.out.println("Apakah Garis 2 sejajar dengan Garis 5? " + g2.isSejajar(g5));
        System.out.println("Apakah Garis 3 sejajar dengan Garis 4? " + g3.isSejajar(g4));
        System.out.println("Apakah Garis 3 sejajar dengan Garis 5? " + g3.isSejajar(g5));
        System.out.println("Apakah Garis 4 sejajar dengan Garis 5? " + g4.isSejajar(g5));

        System.out.println("\n=== Garis Tegak Lurus ===");
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 2? " + g1.isTegakLurus(g2));
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 3? " + g1.isTegakLurus(g3));
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 4? " + g1.isTegakLurus(g4));
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 5? " + g1.isTegakLurus(g5));
        System.out.println("Apakah Garis 2 tegak lurus dengan Garis 3? " + g2.isTegakLurus(g3));
        System.out.println("Apakah Garis 2 tegak lurus dengan Garis 4? " + g2.isTegakLurus(g4));
        System.out.println("Apakah Garis 2 tegak lurus dengan Garis 5? " + g2.isTegakLurus(g5));
        System.out.println("Apakah Garis 3 tegak lurus dengan Garis 4? " + g3.isTegakLurus(g4));
        System.out.println("Apakah Garis 3 tegak lurus dengan Garis 5? " + g3.isTegakLurus(g5));
        System.out.println("Apakah Garis 4 tegak lurus dengan Garis 5? " + g4.isTegakLurus(g5));

        System.out.println("\nJumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}

