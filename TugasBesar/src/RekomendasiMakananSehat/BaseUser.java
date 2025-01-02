package RekomendasiMakananSehat;
//@author Rizqi Dwi Saputra

public abstract class BaseUser {
    
    protected String nama;
    protected int umur;
    
    public BaseUser(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public abstract void validate();
    
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
}
