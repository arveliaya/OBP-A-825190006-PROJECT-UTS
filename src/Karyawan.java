public class Karyawan {
        private String idKaryawan;
        private String nama;
        private int gaji;

        public Karyawan(){
                this.idKaryawan = idKaryawan;
                this.nama = nama;
                this.gaji = gaji;
        }

        public Karyawan(String IdKaryawan, String Nama, int gaji) {
              this.idKaryawan = idKaryawan;
              this.nama = nama;
              this.gaji = gaji;
        }

        public String getIdKaryawan() {
                return idKaryawan;
        }

        public void setIdKaryawan(String idKaryawan) {
                this.idKaryawan = idKaryawan;
        }

        public String getNama() {
                return nama;
        }

        public void setNama(String nama) {
                this.nama = nama;
        }

        public int getGaji() {
                return gaji;
        }

        public void setGaji(int gaji) {
                this.gaji = gaji;
        }

        public float Tunjangan()
        {
                return gaji/100*10;
        }

        public float TotalGaji(){
                return gaji+Tunjangan();
        }
}
