import java.time.LocalDate;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(String NIP, String nama, LocalDate tglLahir, LocalDate TMT, double gajiPokok, String fakultas){
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas(){
        return fakultas;
    }

    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }
}
