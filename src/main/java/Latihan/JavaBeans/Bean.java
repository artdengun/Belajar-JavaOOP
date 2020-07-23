package Latihan.JavaBeans;

public class Bean {
    private String nama;
    private String panggilan;
    private String alamat;
    private int umur;
    private int berat;

        // set tempat modify program
    public void setNama(String nama){
        this.nama = nama;
    }
        // untuk menghasilakn program
    public String getNama(){
        return nama;
    }

    public String getPanggilan() {
        return panggilan;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }
}
