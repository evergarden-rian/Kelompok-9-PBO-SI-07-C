package RekomendasiMakananSehat;
//@author Rizqi Dwi Saputra

public class User extends BaseUser {

    private double bb;
    private double tb;
    private String aktivitas;
    private String preferensi;

    public User(String nama, int umur, double bb, double tb, String aktivitas, String preferensi) {
        super(nama, umur);
        this.bb = bb;
        this.tb = tb;
        this.aktivitas = aktivitas;
        this.preferensi = preferensi;
    }
    
    @Override
    public void validate() {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        if (umur <= 0) {
            throw new IllegalArgumentException("Umur harus lebih dari 0");
        }
        if (bb <= 0) {
            throw new IllegalArgumentException("Berat badan harus lebih dari 0");
        }
        if (tb <= 0) {
            throw new IllegalArgumentException("Tinggi badan harus lebih dari 0");
        }
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public double getBb() {
        return bb;
    }

    public double getTb() {
        return tb;
    }
    
    
    public String getAktivitas() {
        return aktivitas;
    }

    public String getPreferensi() {
        return preferensi;
    }
    
}
