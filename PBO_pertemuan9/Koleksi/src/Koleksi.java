
public class Koleksi<T> {
    private int nbelm;
    private T[] wadah;

    @SuppressWarnings("unchecked")
    public Koleksi(int size) {
        this.nbelm = 0;
        this.wadah = (T[]) new Object[size];
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah[index];
        } 
        else {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
    }

    public void setIsi(int index, T elemen) {
        if (index >= 0 && index < nbelm) {
            wadah[index] = elemen;
            System.out.println("wadah dengan indeks " + index + " berhasil diganti dengan elemen " + elemen);
        } 
        else {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
    }

    public int getSize() {
        return wadah.length;
    }

    public void setSize(int newSize) {
        if (newSize < 0) {
            throw new IllegalArgumentException("Ukuran tidak boleh negatif");
        }

        T[] newWadah = (T[]) new Object[newSize];

        int elementsToCopy;
        if (nbelm <= newSize) {
            elementsToCopy = nbelm;
        } 
        else {
            elementsToCopy = newSize;
        }

        for (int i = 0; i < elementsToCopy; i++) {
            newWadah[i] = wadah[i];
        }

        wadah = newWadah;
        nbelm = elementsToCopy;
        System.out.println("ukuran wadah berhasil diganti menjadi " + newSize);
    }

    public void add(T elemen) {
        if (nbelm < wadah.length) {
            wadah[nbelm] = elemen;
            nbelm++;
            System.out.println("elemen " + elemen + " berhasil ditambahkan");
        } 
        else {
            throw new IllegalStateException("Koleksi penuh, tidak bisa menambah elemen");
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            for (int i = index; i < nbelm - 1; i++) {
                wadah[i] = wadah[i + 1];
            }
            wadah[nbelm - 1] = null;
            nbelm--;
            System.out.println("elemen indeks ke " + index + " berhasil dihapus");
        } 
        else {
            throw new IndexOutOfBoundsException("Indeks tidak valid");
        }
    }

    public void showAll() {
        System.out.print("Isi Koleksi: [");
        for (int i = 0; i < nbelm; i++) {
            System.out.print(wadah[i]);
            if (i < nbelm - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}