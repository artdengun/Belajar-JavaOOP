package Latihan.Polymorphisme;

public class Movie {

    private  String judul;
    private  String jadwal;
    private  int umur;

    public  void panggilMovie(){
        System.out.println("Ini adalah movie");
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
