package Latihan.InnerClass;

public class inner {
    // inner class adalah class didalam class
    public class Mahasiswa {
        private String namaMahasiswa;
        private String dosenMahasiswa;


        //getter
        public void getNamaMahasiswa(String namaMahasiswa, String dosenMahasiswa) {
            this.namaMahasiswa = namaMahasiswa;
            this.dosenMahasiswa = dosenMahasiswa;
        }

        // setter
        public String setNamaMahasiswa() {
            String nilai = namaMahasiswa + dosenMahasiswa;
            return nilai;
        }

        //getter
        public void getDosenMahasiswa(String dosenMahasiswa) {
            this.dosenMahasiswa = dosenMahasiswa;
        }

        // setter
        public String setDosenMahasiswa() {
            return dosenMahasiswa;
        }
    }

    public class Dosen {
        private String nama;
        private String dosen;

        public String getDosen() {
            return dosen;
        }

        public void setDosen(String dosen) {
            this.dosen = dosen;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }

    public class Staff {
        private String namaStaff;
        private String staff;

        //SETTER

        public void setNamaStaff(String namaStaff){
            this.namaStaff = namaStaff;
        }

        // getter

        public String getNamaStaff(){
            return namaStaff;
        }

        //setter
        public void setStaff(String staff){
            this.staff = staff;
        }

        // getter
        public String getStaff(){
            return staff;
        }

    }
}
