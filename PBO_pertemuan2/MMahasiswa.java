public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("123456", "Budi Santoso", "Informatika");

        MataKuliah matkul1 = new MataKuliah("IF101", "Pemrograman Dasar", 3);
        MataKuliah matkul2 = new MataKuliah("IF102", "Struktur Data", 4);
        MataKuliah matkul5 = new MataKuliah("IF103", "Pemrograman Berbasis Objek", 3);

        mahasiswa1.addMatkul(matkul1);
        mahasiswa1.addMatkul(matkul2);

        Dosen dosenWali1 = new Dosen("98765", "Dr. Susilo", "Informatika");
        mahasiswa1.setDosenWali(dosenWali1);

        Kendaraan kendaraan1 = new Kendaraan("B 1234 XYZ", "Motor");
        mahasiswa1.setKendaraan(kendaraan1);
        
        Mahasiswa mahasiswa2 = new Mahasiswa("654321", "Siti Aminah", "Sistem Informasi");
        
        MataKuliah matkul3 = new MataKuliah("SI201", "Basis Data", 3);
        MataKuliah matkul4 = new MataKuliah("SI202", "Manajemen Proyek", 4);

        mahasiswa2.addMatkul(matkul3);
        mahasiswa2.addMatkul(matkul4);

        Dosen dosenWali2 = new Dosen("87654", "Dr. Rahmawati", "Sistem Informasi");
        mahasiswa2.setDosenWali(dosenWali2);

        Kendaraan kendaraan2 = new Kendaraan("D 5678 ABC", "Mobil");
        mahasiswa2.setKendaraan(kendaraan2);

        Mahasiswa mahasiswa3 = new Mahasiswa("789012", "Andi Wijaya", "Informatika");
        
        mahasiswa3.addMatkul(matkul1);
        mahasiswa3.addMatkul(matkul2);
        mahasiswa3.addMatkul(matkul5);

        mahasiswa3.setDosenWali(dosenWali1);

        Kendaraan kendaraan3 = new Kendaraan("A 9999 DEF", "Motor");
        mahasiswa3.setKendaraan(kendaraan3);
        
        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa1.printMhs();
        System.out.println("\nDetail Mahasiswa 1:");
        mahasiswa1.printDetailMhs();
        System.out.println("\nTotal SKS yang diambil: " + mahasiswa1.getJumlahSKS());
        System.out.println("Total mata kuliah yang diambil: " + mahasiswa1.getJumlahMatkul());

        System.out.println("\nInformasi Mahasiswa 2:");
        mahasiswa2.printMhs();
        System.out.println("\nDetail Mahasiswa 2:");
        mahasiswa2.printDetailMhs();
        System.out.println("\nTotal SKS yang diambil: " + mahasiswa2.getJumlahSKS());
        System.out.println("Total mata kuliah yang diambil: " + mahasiswa2.getJumlahMatkul());
        
        System.out.println("\nInformasi Mahasiswa 3:");
        mahasiswa3.printMhs();
        System.out.println("\nDetail Mahasiswa 3:");
        mahasiswa3.printDetailMhs();
        System.out.println("\nTotal SKS yang diambil: " + mahasiswa3.getJumlahSKS());
        System.out.println("Total mata kuliah yang diambil: " + mahasiswa3.getJumlahMatkul());
    }
}
