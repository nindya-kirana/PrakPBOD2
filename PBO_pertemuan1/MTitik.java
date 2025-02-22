public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik(3, 4);
        Titik t2 = new Titik(-5, 6);
        Titik t3 = new Titik(-4, -7);
        Titik t4 = new Titik(6, -3);
        Titik t5 = new Titik();

        System.out.println("=== Koordinat Awal ===");
        t1.printTitik();
        t2.printTitik();
        t3.printTitik();
        t4.printTitik();
        t5.printTitik();
        System.out.println("\n=== Menggeser Titik ===");
        t1.printTitik();
        System.out.println("Menggeser titik 1 sejauh x = 2 dan y = 3");
        t2.printTitik();
        System.out.println("Menggeser titik 2 sejauh x = -3 dan y = -2");
        t1.geser(2, 3);
        t2.geser(-3, -2);
        System.out.println("--- Setelah Digeser ---");  
        t1.printTitik();
        t2.printTitik();

        System.out.println("\n=== Kuadran Titik ===");
        System.out.println("Titik t1 berada di kuadran: " + t1.getKuadran());
        System.out.println("Titik t2 berada di kuadran: " + t2.getKuadran());
        System.out.println("Titik t3 berada di kuadran: " + t3.getKuadran());
        System.out.println("Titik t4 berada di kuadran: " + t4.getKuadran());
        System.out.println("Titik t5 berada di kuadran: " + t5.getKuadran());

        System.out.println("\n=== Jarak ke Pusat ===");
        System.out.println("Jarak t1 ke pusat: " + t1.getJarakPusat());
        System.out.println("Jarak t2 ke pusat: " + t2.getJarakPusat());
        System.out.println("Jarak t3 ke pusat: " + t3.getJarakPusat());
        System.out.println("Jarak t4 ke pusat: " + t4.getJarakPusat());

        System.out.println("\n=== Jarak Antar Titik ===");
        System.out.println("Jarak t1 ke t2: " + t1.getJarak(t2));
        System.out.println("Jarak t3 ke t4: " + t3.getJarak(t4));

        System.out.println("\n=== Refleksi Terhadap Sumbu ===");
        t1.refleksiX();
        t2.refleksiY();
        System.out.println("Setelah refleksi X, t1: ");
        t1.printTitik();
        System.out.println("Setelah refleksi Y, t2: ");
        t2.printTitik();

        Titik t3RefX = t3.getRefleksiX();
        Titik t4RefY = t4.getRefleksiY();
        System.out.println("\n=== Objek Refleksi Baru ===");
        System.out.print("Refleksi X dari t3: ");
        t3RefX.printTitik();
        System.out.print("Refleksi Y dari t4: ");
        t4RefY.printTitik();

        System.out.println("\nJumlah objek Titik yang dibuat: " + Titik.getCounterTitik());
    }
}
